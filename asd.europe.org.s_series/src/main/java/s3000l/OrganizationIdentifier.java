/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class OrganizationIdentifier extends EcRemoteLinkedData {

    protected OrganizationIdentifierClassValues clazz;
    protected ProductName.Applic applic;

    public OrganizationIdentifierClassValues getClazz() {
        return clazz;
    }

    public void setClazz(OrganizationIdentifierClassValues value) {
        this.clazz = value;
    }

    public ProductName.Applic getApplic() {
        return applic;
    }

    public void setApplic(ProductName.Applic value) {
        this.applic = value;
    }

	public OrganizationIdentifier() {
		super("http://www.asd-europe.org/s-series/s3000l", "OrganizationIdentifier");
	}

}
