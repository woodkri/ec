/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:20 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class MaintenanceLevelIdentifier extends EcRemoteLinkedData {

    protected MaintenanceLevelIdentifierClassValues clazz;
    protected OrganizationReference setBy;

    public MaintenanceLevelIdentifierClassValues getClazz() {
        return clazz;
    }

    public void setClazz(MaintenanceLevelIdentifierClassValues value) {
        this.clazz = value;
    }

    public OrganizationReference getSetBy() {
        return setBy;
    }

    public void setSetBy(OrganizationReference value) {
        this.setBy = value;
    }

	public MaintenanceLevelIdentifier() {
		super("http://www.asd-europe.org/s-series/s3000l", "MaintenanceLevelIdentifier");
	}

}
