/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class SoftwareElementPartRealization extends EcRemoteLinkedData {

    protected PartAsDesignedReference partRef;
    protected s6000t.taskTrainAnalysis.HardwareElementPartRealization.UsableOnList usableOnList;
    protected s6000t.taskTrainAnalysis.PartAsDesignedPartsList.ApcEfys apcEfys;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Docs docs;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public PartAsDesignedReference getPartRef() {
        return partRef;
    }

    public void setPartRef(PartAsDesignedReference value) {
        this.partRef = value;
    }

    public s6000t.taskTrainAnalysis.HardwareElementPartRealization.UsableOnList getUsableOnList() {
        return usableOnList;
    }

    public void setUsableOnList(s6000t.taskTrainAnalysis.HardwareElementPartRealization.UsableOnList value) {
        this.usableOnList = value;
    }

    public s6000t.taskTrainAnalysis.PartAsDesignedPartsList.ApcEfys getApcEfys() {
        return apcEfys;
    }

    public void setApcEfys(s6000t.taskTrainAnalysis.PartAsDesignedPartsList.ApcEfys value) {
        this.apcEfys = value;
    }

    public s6000t.taskTrainAnalysis.ConditionInstance.Docs getDocs() {
        return docs;
    }

    public void setDocs(s6000t.taskTrainAnalysis.ConditionInstance.Docs value) {
        this.docs = value;
    }

    public s6000t.taskTrainAnalysis.ConditionInstance.Rmks getRmks() {
        return rmks;
    }

    public void setRmks(s6000t.taskTrainAnalysis.ConditionInstance.Rmks value) {
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

	public SoftwareElementPartRealization() {
		super("http://asd-europe.org/", "SoftwareElementPartRealization");
	}

}
