/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:20 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class MaintenanceLocationIdentifier extends EcRemoteLinkedData {

    protected MaintenanceLocationIdentifierClassValues clazz;
    protected OrganizationReference setBy;

    public MaintenanceLocationIdentifierClassValues getClazz() {
        return clazz;
    }

    public void setClazz(MaintenanceLocationIdentifierClassValues value) {
        this.clazz = value;
    }

    public OrganizationReference getSetBy() {
        return setBy;
    }

    public void setSetBy(OrganizationReference value) {
        this.setBy = value;
    }

	public MaintenanceLocationIdentifier() {
		super("http://asd-europe.org/", "MaintenanceLocationIdentifier");
	}

}
