/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:19 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class FailureModeDetection extends EcRemoteLinkedData {

    protected FailureModeDetectionRate detectRte;
    protected FailureModeReference fmRef;
    protected String uid;
    protected CrudCodeValues crud;

    public FailureModeDetectionRate getDetectRte() {
        return detectRte;
    }

    public void setDetectRte(FailureModeDetectionRate value) {
        this.detectRte = value;
    }

    public FailureModeReference getFmRef() {
        return fmRef;
    }

    public void setFmRef(FailureModeReference value) {
        this.fmRef = value;
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

	public FailureModeDetection() {
		super("http://asd-europe.org/", "FailureModeDetection");
	}

}
