/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:22 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class SubtaskIdentifier extends EcRemoteLinkedData {

    protected SubtaskIdentifierClassValues clazz;
    protected OrganizationReference setBy;

    public SubtaskIdentifierClassValues getClazz() {
        return clazz;
    }

    public void setClazz(SubtaskIdentifierClassValues value) {
        this.clazz = value;
    }

    public OrganizationReference getSetBy() {
        return setBy;
    }

    public void setSetBy(OrganizationReference value) {
        this.setBy = value;
    }

	public SubtaskIdentifier() {
		super("http://www.asd-europe.org/s-series/s3000l", "SubtaskIdentifier");
	}

}
