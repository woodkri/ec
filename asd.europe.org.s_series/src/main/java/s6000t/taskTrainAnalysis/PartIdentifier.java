/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class PartIdentifier extends EcRemoteLinkedData {

    protected PartIdentifierClassValues clazz;
    protected OrganizationReference setBy;

    public PartIdentifierClassValues getClazz() {
        return clazz;
    }

    public void setClazz(PartIdentifierClassValues value) {
        this.clazz = value;
    }

    public OrganizationReference getSetBy() {
        return setBy;
    }

    public void setSetBy(OrganizationReference value) {
        this.setBy = value;
    }

	public PartIdentifier() {
		super("http://asd-europe.org/", "PartIdentifier");
	}

}
