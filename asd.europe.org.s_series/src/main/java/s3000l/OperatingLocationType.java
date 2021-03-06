/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Sep 12 10:06:02 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class OperatingLocationType extends EcRemoteLinkedData {

    protected OperatingLocationTypeIdentifier opTypeId;
    protected OperatingLocationTypeName name;
    protected OperatingLocationTypeDescription opTypeDescr;
    protected NumberOfOperatingLocations nrOfLoc;
    protected MaintenanceCapabilityAtOperatingLocationType maintCap;
    protected OrganizationReference orgRef;
    protected s3000l.ConditionInstance.Docs docs;
    protected s3000l.ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public OperatingLocationTypeIdentifier getOpTypeId() {
        return opTypeId;
    }

    public void setOpTypeId(OperatingLocationTypeIdentifier value) {
        this.opTypeId = value;
    }

    public OperatingLocationTypeName getName() {
        return name;
    }

    public void setName(OperatingLocationTypeName value) {
        this.name = value;
    }

    public OperatingLocationTypeDescription getOpTypeDescr() {
        return opTypeDescr;
    }

    public void setOpTypeDescr(OperatingLocationTypeDescription value) {
        this.opTypeDescr = value;
    }

    public NumberOfOperatingLocations getNrOfLoc() {
        return nrOfLoc;
    }

    public void setNrOfLoc(NumberOfOperatingLocations value) {
        this.nrOfLoc = value;
    }

    public MaintenanceCapabilityAtOperatingLocationType getMaintCap() {
        return maintCap;
    }

    public void setMaintCap(MaintenanceCapabilityAtOperatingLocationType value) {
        this.maintCap = value;
    }

    public OrganizationReference getOrgRef() {
        return orgRef;
    }

    public void setOrgRef(OrganizationReference value) {
        this.orgRef = value;
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

	public OperatingLocationType() {
		super("http://www.asd-europe.org/s-series/s3000l", "OperatingLocationType");
	}

}
