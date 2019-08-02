/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class ParameterThresholdDefinition extends EcRemoteLinkedData {

    protected ThresholdValue thldValue;
    protected ConditionInstance.Rmks rmks;
    protected ProductName.Applic applic;
    protected String uid;
    protected CrudCodeValues crud;

    public ThresholdValue getThldValue() {
        return thldValue;
    }

    public void setThldValue(ThresholdValue value) {
        this.thldValue = value;
    }

    public ConditionInstance.Rmks getRmks() {
        return rmks;
    }

    public void setRmks(ConditionInstance.Rmks value) {
        this.rmks = value;
    }

    public ProductName.Applic getApplic() {
        return applic;
    }

    public void setApplic(ProductName.Applic value) {
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

	public ParameterThresholdDefinition() {
		super("http://www.asd-europe.org/s-series/s3000l", "ParameterThresholdDefinition");
	}

}
