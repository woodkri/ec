/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:22 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class TaskRequirementAuthoritySourceType extends EcRemoteLinkedData {

    protected String code;
    protected ProductName.Applic applic;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
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

	public TaskRequirementAuthoritySourceType() {
		super("http://www.asd-europe.org/s-series/s3000l", "TaskRequirementAuthoritySourceType");
	}

}
