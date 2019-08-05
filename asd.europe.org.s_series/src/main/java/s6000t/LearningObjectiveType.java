/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:20 CDT 2019
 *
 **/

package s6000t;

import org.cassproject.schema.general.EcRemoteLinkedData;
import s3000l.ConditionInstance;
import s3000l.ProductName;

public class LearningObjectiveType extends EcRemoteLinkedData {

    protected LearningObjectiveTypeCodeValues code;
    protected ProductName.Applic applic;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;

    public LearningObjectiveTypeCodeValues getCode() {
        return code;
    }

    public void setCode(LearningObjectiveTypeCodeValues value) {
        this.code = value;
    }

    public ProductName.Applic getApplic() {
        return applic;
    }

    public void setApplic(ProductName.Applic value) {
        this.applic = value;
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

	public LearningObjectiveType() {
		super("http://www.asd-europe.org/s-series/s6000t", "LearningObjectiveType");
	}

}