/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Aug 22 12:47:54 CDT 2019
 *
 **/

package s6000t;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;
import s3000l.CrudCodeValues;

public class PrerequisiteCompetenciesDefinition extends EcRemoteLinkedData {

    protected PrerequisiteCompetenciesIterationIdentifier compId;
    protected Array<PrerequisiteCompetenciesDescription> compDescr;
    protected Array<AssociatedCompetencyDefinition> compDef;
    protected s3000l.DownTime.OrgInfos orgInfos;
    protected s3000l.ConditionInstance.Docs docs;
    protected s3000l.ConditionInstance.Rmks rmks;
    protected String uid;
    protected String uri;
    protected CrudCodeValues crud;

    public PrerequisiteCompetenciesIterationIdentifier getCompId() {
        return compId;
    }

    public void setCompId(PrerequisiteCompetenciesIterationIdentifier value) {
        this.compId = value;
    }

    public Array<PrerequisiteCompetenciesDescription> getCompDescr() {
        if (compDescr == null) {
            compDescr = new Array<PrerequisiteCompetenciesDescription>();
        }
        return this.compDescr;
    }

    public Array<AssociatedCompetencyDefinition> getCompDef() {
        if (compDef == null) {
            compDef = new Array<AssociatedCompetencyDefinition>();
        }
        return this.compDef;
    }

    public s3000l.DownTime.OrgInfos getOrgInfos() {
        return orgInfos;
    }

    public void setOrgInfos(s3000l.DownTime.OrgInfos value) {
        this.orgInfos = value;
    }

    public s3000l.ConditionInstance.Docs getDocs() {
        return docs;
    }

    public void setDocs(s3000l.ConditionInstance.Docs value) {
        this.docs = value;
    }

    public s3000l.ConditionInstance.Rmks getRmks() {
        return rmks;
    }

    public void setRmks(s3000l.ConditionInstance.Rmks value) {
        this.rmks = value;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String value) {
        this.uid = value;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String value) {
        this.uri = value;
    }

    public CrudCodeValues getCrud() {
        if (crud == null) {
            return CrudCodeValues.I;
        } else {
            return crud;
        }
    }

    public void setCrud(CrudCodeValues value) {
        this.crud = value;
    }

	public PrerequisiteCompetenciesDefinition() {
		super("http://www.asd-europe.org/s-series/s6000t", "PrerequisiteCompetenciesDefinition");
	}

}
