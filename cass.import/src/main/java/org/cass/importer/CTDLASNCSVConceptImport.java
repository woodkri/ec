package org.cass.importer;

import com.eduworks.ec.array.EcArray;
import com.eduworks.ec.array.EcAsyncHelper;
import com.eduworks.ec.crypto.EcPpk;
import js.Papa;
import js.PapaParseParams;
import org.stjs.javascript.JSON;
import org.w3.skos.EcConcept;
import org.w3.skos.EcConceptScheme;
import org.cassproject.ebac.identity.EcIdentity;
import org.cassproject.ebac.identity.EcIdentityManager;
import org.cassproject.ebac.repository.EcRepository;
import org.json.ld.EcLinkedData;
import org.stjs.javascript.*;
import org.stjs.javascript.Array;
import org.stjs.javascript.JSObjectAdapter;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Callback3;

import static org.stjs.javascript.JSGlobal.typeof;

public class CTDLASNCSVConceptImport {

    public static void analyzeFile(Object file, final Callback2<Integer, Integer> success, final Callback1<Object> failure) {

        if (file == null) {
            failure.$invoke("No file to analyze");
            return;
        }

        if (JSObjectAdapter.$get(file, "name") == null) {
            failure.$invoke("Invalid file");
        } else if (!((String) JSObjectAdapter.$get(file, "name")).endsWith(".csv")) {
            failure.$invoke("Invalid file type");
        }

        Papa.parse(file, new PapaParseParams() {
            {
                encoding = "UTF-8";
                complete = new Callback1<Object>() {
                    @Override
                    public void $invoke(Object results) {
                        Array<Array<String>> tabularData = (Array<Array<String>>) JSObjectAdapter.$get(results, "data");

                        Array<String> colNames = tabularData.$get(0);

                        Object nameToCol = new Object();
                        for (int i = 0; i < colNames.$length(); i++)
                            JSObjectAdapter.$put(nameToCol, colNames.$get(i), i);

                        int conceptSchemeCounter = 0;
                        int conceptCounter = 0;
                        Integer typeCol = (Integer) JSObjectAdapter.$get(nameToCol, "@type");
                        if (typeCol == null) {
                            error.$invoke("No @type in CSV.");
                            return;
                        }
                        for (int i = 0; i < tabularData.$length(); i++) {
                            if (i == 0) continue;
                            Array<String> col = tabularData.$get(i);
                            if (col.$get(typeCol) == "skos:ConceptScheme")
                                conceptSchemeCounter++;
                            else if (col.$get(typeCol) == "skos:Concept")
                                conceptCounter++;
                            else if (col.$get(typeCol) == null || col.$get(typeCol) == "")
                                continue;
                            else {
                                error.$invoke("Found unknown type:" + col.$get(typeCol));
                                return;
                            }
                        }
                        success.$invoke(conceptSchemeCounter, conceptCounter);
                    }
                };
                error = failure;
            }
        });
    }

    public static void importFrameworksAndCompetencies(final EcRepository repo, Object file, final Callback2<Array<EcConceptScheme>, Array<EcConcept>> success, final Callback1<Object> failure, final EcIdentity ceo) {

        if (file == null) {
            failure.$invoke("No file to analyze");
            return;
        }

        if (JSObjectAdapter.$get(file, "name") == null) {
            failure.$invoke("Invalid file");
        } else if (!((String) JSObjectAdapter.$get(file, "name")).endsWith(".csv")) {
            failure.$invoke("Invalid file type");
        }

        Papa.parse(file, new PapaParseParams() {
            {
                header = true;
                encoding = "UTF-8";
                complete = new Callback1<Object>() {
                    @Override
                    public void $invoke(Object results) {
                        Array<Object> tabularData = (Array<Object>) JSObjectAdapter.$get(results, "data");

                        final Array schemeArray = new Array<EcConceptScheme>();
                        final Array concepts = new Array<EcConcept>();
                        new EcAsyncHelper<Object>().each(tabularData, new Callback2<Object, Callback0>() {
                            @Override
                            public void $invoke(final Object pretranslatedE, final Callback0 callback0) {
                                if (JSObjectAdapter.$get(pretranslatedE, "@type") == "skos:ConceptScheme") {
                                    EcLinkedData translator = new EcLinkedData(null, null);
                                    translator.copyFrom(pretranslatedE);
                                    CTDLASNCSVImport.cleanUpTranslator(translator);

                                    if (JSObjectAdapter.$get(translator, "ceasn:name") != null) {
                                        Object name = JSObjectAdapter.$get(translator, "ceasn:name");
                                        Object nameWithLanguage = new Object();
                                        JSObjectAdapter.$put(nameWithLanguage, "en-US", name);
                                        JSObjectAdapter.$put(translator, "ceasn:name", nameWithLanguage);
                                    }
                                    translator.recast("https://schema.cassproject.org/0.4/ceasn2cassConcepts", "https://schema.cassproject.org/0.4/skos", new Callback1<EcLinkedData>() {
                                        @Override
                                        public void $invoke(EcLinkedData e) {
                                            EcConceptScheme f = new EcConceptScheme();
                                            f.copyFrom(e);
                                            if (JSObjectAdapter.$get(e, "owner") != null) {
                                                EcIdentity id = new EcIdentity();
                                                id.ppk = EcPpk.fromPem((String) JSObjectAdapter.$get(e, "owner"));
                                                f.addOwner(id.ppk.toPk());
                                                EcIdentityManager.addIdentityQuietly(id);
                                            }
                                            if (ceo != null)
                                                f.addOwner(ceo.ppk.toPk());
                                            JSObjectAdapter.$put(f, "schema:dateModified", new Date().toISOString());

                                            if (EcConceptScheme.template != null && JSObjectAdapter.$get(EcConceptScheme.template,("schema:dateCreated")) != null) {
                                                CTDLASNCSVImport.setDateCreated(e, f);
                                            }

                                            schemeArray.push(f);
                                            callback0.$invoke();
                                        }
                                    }, (Callback1) failure);
                                } else if (JSObjectAdapter.$get(pretranslatedE, "@type") == "skos:Concept") {
                                    EcLinkedData translator = new EcLinkedData(null, null);
                                    translator.copyFrom(pretranslatedE);
                                    CTDLASNCSVImport.cleanUpTranslator(translator);

                                    if (JSObjectAdapter.$get(translator, "skos:prefLabel") != null) {
                                        Object name = JSObjectAdapter.$get(translator, "skos:prefLabel");
                                        Object nameWithLanguage = new Object();
                                        JSObjectAdapter.$put(nameWithLanguage, "en-US", name);
                                        JSObjectAdapter.$put(translator, "skos:prefLabel", nameWithLanguage);
                                    }
                                    translator.recast("https://schema.cassproject.org/0.4/ceasn2cassConcepts", "https://schema.cassproject.org/0.4/skos", new Callback1<EcLinkedData>() {
                                        @Override
                                        public void $invoke(EcLinkedData e) {
                                            EcConcept f = new EcConcept();
                                            f.copyFrom(e);
                                            if (JSObjectAdapter.$get(e, "id") == null) {
                                                callback0.$invoke();
                                                return;
                                            }

                                            if (JSObjectAdapter.$get(e, "owner") != null) {
                                                EcIdentity id = new EcIdentity();
                                                id.ppk = EcPpk.fromPem((String) JSObjectAdapter.$get(e, "owner"));
                                                if (id.ppk != null)
                                                    f.addOwner(id.ppk.toPk());
                                                EcIdentityManager.addIdentityQuietly(id);
                                            }
                                            if (ceo != null)
                                                f.addOwner(ceo.ppk.toPk());

                                            if (EcConcept.template != null && JSObjectAdapter.$get(EcConcept.template,("schema:dateCreated")) != null) {
                                                CTDLASNCSVImport.setDateCreated(e, f);
                                            }

                                            //Turn relation fields into arrays
                                            if (JSObjectAdapter.$get(e, "skos:narrower") != null) {
                                                Object relation = JSObjectAdapter.$get(e, "skos:narrower");
                                                if (!EcArray.isArray(relation)) {
                                                    Array<String> array = JSCollections.$array((String)relation);
                                                    JSObjectAdapter.$put(f, "skos:narrower", array);
                                                }
                                            }
                                            if (JSObjectAdapter.$get(e, "skos:broader") != null) {
                                                Object relation = JSObjectAdapter.$get(e, "skos:broader");
                                                if (!EcArray.isArray(relation)) {
                                                    Array<String> array = JSCollections.$array((String)relation);
                                                    JSObjectAdapter.$put(f, "skos:broader", array);
                                                }
                                            }
                                            if (JSObjectAdapter.$get(e, "skos:broadMatch") != null) {
                                                Object relation = JSObjectAdapter.$get(e, "skos:broadMatch");
                                                if (!EcArray.isArray(relation)) {
                                                    Array<String> array = JSCollections.$array((String)relation);
                                                    JSObjectAdapter.$put(f, "skos:broadMatch", array);
                                                }
                                            }
                                            if (JSObjectAdapter.$get(e, "skos:closeMatch") != null) {
                                                Object relation = JSObjectAdapter.$get(e, "skos:closeMatch");
                                                if (!EcArray.isArray(relation)) {
                                                    Array<String> array = JSCollections.$array((String)relation);
                                                    JSObjectAdapter.$put(f, "skos:closeMatch", array);
                                                }
                                            }
                                            if (JSObjectAdapter.$get(e, "skos:exactMatch") != null) {
                                                Object relation = JSObjectAdapter.$get(e, "skos:exactMatch");
                                                if (!EcArray.isArray(relation)) {
                                                    Array<String> array = JSCollections.$array((String)relation);
                                                    JSObjectAdapter.$put(f, "skos:exactMatch", array);
                                                }
                                            }
                                            if (JSObjectAdapter.$get(e, "skos:narrowMatch") != null) {
                                                Object relation = JSObjectAdapter.$get(e, "skos:narrowMatch");
                                                if (!EcArray.isArray(relation)) {
                                                    Array<String> array = JSCollections.$array((String)relation);
                                                    JSObjectAdapter.$put(f, "skos:narrowMatch", array);
                                                }
                                            }
                                            if (JSObjectAdapter.$get(e, "skos:related") != null) {
                                                Object relation = JSObjectAdapter.$get(e, "skos:related");
                                                if (!EcArray.isArray(relation)) {
                                                    Array<String> array = JSCollections.$array((String)relation);
                                                    JSObjectAdapter.$put(f, "skos:related", array);
                                                }
                                            }
                                            //If concept has topConceptOf, add to hasTopConcept of Scheme
                                            if (JSObjectAdapter.$get(e, "skos:topConceptOf") != null) {
                                                String scheme = (String)JSObjectAdapter.$get(e, "skos:topConceptOf");
                                                for (int i = 0; i < schemeArray.$length(); i++) {
                                                    Object schemeObj = schemeArray.$get(i);
                                                    if (scheme == JSObjectAdapter.$get(schemeObj,"id")) {
                                                        if (JSObjectAdapter.$get(schemeObj, "skos:hasTopConcept") == null) {
                                                            Array hasTopConcept = new Array<String>();
                                                            JSObjectAdapter.$put(schemeObj, "skos:hasTopConcept", hasTopConcept);
                                                        }
                                                        Object conceptId = f.shortId();
                                                        EcArray.setAdd((Array<String>)JSObjectAdapter.$get(schemeObj, "skos:hasTopConcept"), conceptId);
                                                    }
                                                }
                                            }
                                            JSObjectAdapter.$put(f, "schema:dateModified", new Date().toISOString());

                                            concepts.push(f);
                                            callback0.$invoke();
                                        }
                                    }, (Callback1) failure);
                                } else if (JSObjectAdapter.$get(pretranslatedE, "@type") == null || JSObjectAdapter.$get(pretranslatedE, "@type") == "")
                                {callback0.$invoke();return;}

                                else {
                                    error.$invoke("Found unknown type:" + JSObjectAdapter.$get(pretranslatedE, "@type"));
                                    callback0.$invoke();
                                    return;
                                }
                            }
                        }, new Callback1<Array<Object>>() {
                            @Override
                            public void $invoke(Array<Object> strings) {
                                success.$invoke(schemeArray, concepts);
                            }
                        });
                    }
                };
                error = failure;
            }
        });
    }
}
