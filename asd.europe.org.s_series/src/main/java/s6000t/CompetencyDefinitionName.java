/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Aug 22 12:47:53 CDT 2019
 *
 **/

package s6000t;

import org.cassproject.schema.general.EcRemoteLinkedData;
import s3000l.LanguageCodeValues;
import s3000l.OrganizationReference;

public class CompetencyDefinitionName extends EcRemoteLinkedData {

    protected String name;
    protected LanguageCodeValues lang;
    protected OrganizationReference providedBy;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public LanguageCodeValues getLang() {
        return lang;
    }

    public void setLang(LanguageCodeValues value) {
        this.lang = value;
    }

    public OrganizationReference getProvidedBy() {
        return providedBy;
    }

    public void setProvidedBy(OrganizationReference value) {
        this.providedBy = value;
    }

	public CompetencyDefinitionName() {
		super("http://www.asd-europe.org/s-series/s6000t", "CompetencyDefinitionName");
	}

}
