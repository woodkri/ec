/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Aug 22 12:47:55 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class TaskMaterialResourceBySpecification extends EcRemoteLinkedData {

    protected Boolean fixed;
    protected Array<TaskResourceDuration> duration;
    protected TaskMaterialResourceQuantity qty;
    protected TaskMaterialResourceCategory cat;
    protected Array<TaskResourceRelationship> relRes;
    protected ResourceSpecificationReference specRef;
    protected s3000l.ConditionInstance.Docs docs;
    protected s3000l.ConditionInstance.Rmks rmks;
    protected s3000l.ProductName.Applic applic;
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

    public s3000l.ProductName.Applic getApplic() {
        return applic;
    }

    public void setApplic(s3000l.ProductName.Applic value) {
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
		super("http://www.asd-europe.org/s-series/s3000l", "TaskMaterialResourceBySpecification");
	}

}
