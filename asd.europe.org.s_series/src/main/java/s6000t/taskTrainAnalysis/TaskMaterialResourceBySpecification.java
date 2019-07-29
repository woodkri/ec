/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:22 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class TaskMaterialResourceBySpecification extends EcRemoteLinkedData {

    protected Boolean fixed;
    protected Array<TaskResourceDuration> duration;
    protected TaskMaterialResourceQuantity qty;
    protected TaskMaterialResourceCategory cat;
    protected Array<TaskResourceRelationship> relRes;
    protected ResourceSpecificationReference specRef;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Docs docs;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Rmks rmks;
    protected s6000t.taskTrainAnalysis.ProductName.Applic applic;
    protected String uid;
    protected CrudCodeValues crud;

    public Boolean getFixed() {
        return fixed;
    }

    public void setFixed(Boolean value) {
        this.fixed = value;
    }

    public Array<TaskResourceDuration> getDuration() {
        if (duration == null) {
            duration = new Array<TaskResourceDuration>();
        }
        return this.duration;
    }

    public TaskMaterialResourceQuantity getQty() {
        return qty;
    }

    public void setQty(TaskMaterialResourceQuantity value) {
        this.qty = value;
    }

    public TaskMaterialResourceCategory getCat() {
        return cat;
    }

    public void setCat(TaskMaterialResourceCategory value) {
        this.cat = value;
    }

    public Array<TaskResourceRelationship> getRelRes() {
        if (relRes == null) {
            relRes = new Array<TaskResourceRelationship>();
        }
        return this.relRes;
    }

    public ResourceSpecificationReference getSpecRef() {
        return specRef;
    }

    public void setSpecRef(ResourceSpecificationReference value) {
        this.specRef = value;
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

    public s6000t.taskTrainAnalysis.ProductName.Applic getApplic() {
        return applic;
    }

    public void setApplic(s6000t.taskTrainAnalysis.ProductName.Applic value) {
        this.applic = value;
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

	public TaskMaterialResourceBySpecification() {
		super("http://asd-europe.org/", "TaskMaterialResourceBySpecification");
	}

}
