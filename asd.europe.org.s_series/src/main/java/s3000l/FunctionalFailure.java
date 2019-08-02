/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:19 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class FunctionalFailure extends EcRemoteLinkedData {

    protected FunctionalFailureDescription funcFailDescr;
    protected FunctionalFailureEffectCriticality efctCritic;
    protected String uid;
    protected CrudCodeValues crud;

    public FunctionalFailureDescription getFuncFailDescr() {
        return funcFailDescr;
    }

    public void setFuncFailDescr(FunctionalFailureDescription value) {
        this.funcFailDescr = value;
    }

    public FunctionalFailureEffectCriticality getEfctCritic() {
        return efctCritic;
    }

    public void setEfctCritic(FunctionalFailureEffectCriticality value) {
        this.efctCritic = value;
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

	public FunctionalFailure() {
		super("http://www.asd-europe.org/s-series/s3000l", "FunctionalFailure");
	}

}
