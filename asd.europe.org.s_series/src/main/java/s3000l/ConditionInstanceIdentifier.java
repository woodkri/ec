/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:19 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class ConditionInstanceIdentifier extends EcRemoteLinkedData {

    protected ConditionInstanceIdentifierClassValues clazz;
    protected OrganizationReference setBy;

    public ConditionInstanceIdentifierClassValues getClazz() {
        return clazz;
    }

    public void setClazz(ConditionInstanceIdentifierClassValues value) {
        this.clazz = value;
    }

    public OrganizationReference getSetBy() {
        return setBy;
    }

    public void setSetBy(OrganizationReference value) {
        this.setBy = value;
    }

	public ConditionInstanceIdentifier() {
		super("http://www.asd-europe.org/s-series/s3000l", "ConditionInstanceIdentifier");
	}

}
