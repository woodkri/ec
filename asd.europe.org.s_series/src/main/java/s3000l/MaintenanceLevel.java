/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:20 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class MaintenanceLevel extends EcRemoteLinkedData {

    protected MaintenanceLevelIdentifier mlvId;
    protected MaintenanceLevelName name;
    protected MaintenanceLevelCapabilityDescription mlvCapDescr;
    protected Array<OperatorMaintenanceLevel> opers;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public MaintenanceLevelIdentifier getMlvId() {
        return mlvId;
    }

    public void setMlvId(MaintenanceLevelIdentifier value) {
        this.mlvId = value;
    }

    public MaintenanceLevelName getName() {
        return name;
    }

    public void setName(MaintenanceLevelName value) {
        this.name = value;
    }

    public MaintenanceLevelCapabilityDescription getMlvCapDescr() {
        return mlvCapDescr;
    }

    public void setMlvCapDescr(MaintenanceLevelCapabilityDescription value) {
        this.mlvCapDescr = value;
    }

    public Array<OperatorMaintenanceLevel> getOpers() {
        if (opers == null) {
            opers = new Array<OperatorMaintenanceLevel>();
        }
        return this.opers;
    }

    public ConditionInstance.Docs getDocs() {
        return docs;
    }

    public void setDocs(ConditionInstance.Docs value) {
        this.docs = value;
    }

    public ConditionInstance.Rmks getRmks() {
        return rmks;
    }

    public void setRmks(ConditionInstance.Rmks value) {
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

	public MaintenanceLevel() {
		super("http://www.asd-europe.org/s-series/s3000l", "MaintenanceLevel");
	}

}
