/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:19 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class ContractIdentifier extends EcRemoteLinkedData {

    protected ContractIdentifierClassValues clazz;
    protected OrganizationReference setBy;

    public ContractIdentifierClassValues getClazz() {
        return clazz;
    }

    public void setClazz(ContractIdentifierClassValues value) {
        this.clazz = value;
    }

    public OrganizationReference getSetBy() {
        return setBy;
    }

    public void setSetBy(OrganizationReference value) {
        this.setBy = value;
    }

	public ContractIdentifier() {
		super("http://www.asd-europe.org/s-series/s3000l", "ContractIdentifier");
	}

}
