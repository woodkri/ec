/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class SamplingDefinitionByRatio extends EcRemoteLinkedData {

    protected SamplingMethodDescription samplDescr;
    protected double samplRo;
    protected ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public SamplingMethodDescription getSamplDescr() {
        return samplDescr;
    }

    public void setSamplDescr(SamplingMethodDescription value) {
        this.samplDescr = value;
    }

    public double getSamplRo() {
        return samplRo;
    }

    public void setSamplRo(double value) {
        this.samplRo = value;
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

	public SamplingDefinitionByRatio() {
		super("http://www.asd-europe.org/s-series/s3000l", "SamplingDefinitionByRatio");
	}

}
