/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:20 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class HardwareElementReplaceabilityStrategy extends EcRemoteLinkedData {

    protected HardwareElementReplaceabilityStrategyCodeValues code;
    protected ProductName.Applic applic;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;

    public HardwareElementReplaceabilityStrategyCodeValues getCode() {
        return code;
    }

    public void setCode(HardwareElementReplaceabilityStrategyCodeValues value) {
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

	public HardwareElementReplaceabilityStrategy() {
		super("http://www.asd-europe.org/s-series/s3000l", "HardwareElementReplaceabilityStrategy");
	}

}
