/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class ResourceSpecificationIdentifier extends EcRemoteLinkedData {

    protected ResourceSpecificationIdentifierClassValues clazz;
    protected OrganizationReference setBy;

    public ResourceSpecificationIdentifierClassValues getClazz() {
        return clazz;
    }

    public void setClazz(ResourceSpecificationIdentifierClassValues value) {
        this.clazz = value;
    }

    public OrganizationReference getSetBy() {
        return setBy;
    }

    public void setSetBy(OrganizationReference value) {
        this.setBy = value;
    }

	public ResourceSpecificationIdentifier() {
		super("http://asd-europe.org/", "ResourceSpecificationIdentifier");
	}

}
