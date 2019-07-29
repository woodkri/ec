/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:19 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class DetectionMeanAlarm extends EcRemoteLinkedData {

    protected DetectionMeanAlarmDescription alarmDescr;
    protected DetectionMeanAlarmFalseAlarmRate falseAlarmRte;
    protected DetectionMeanAlarmPresentation alarmPres;
    protected Array<FailureModeDetection> fmDetect;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Docs docs;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public DetectionMeanAlarmDescription getAlarmDescr() {
        return alarmDescr;
    }

    public void setAlarmDescr(DetectionMeanAlarmDescription value) {
        this.alarmDescr = value;
    }

    public DetectionMeanAlarmFalseAlarmRate getFalseAlarmRte() {
        return falseAlarmRte;
    }

    public void setFalseAlarmRte(DetectionMeanAlarmFalseAlarmRate value) {
        this.falseAlarmRte = value;
    }

    public DetectionMeanAlarmPresentation getAlarmPres() {
        return alarmPres;
    }

    public void setAlarmPres(DetectionMeanAlarmPresentation value) {
        this.alarmPres = value;
    }

    public Array<FailureModeDetection> getFmDetect() {
        if (fmDetect == null) {
            fmDetect = new Array<FailureModeDetection>();
        }
        return this.fmDetect;
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

	public DetectionMeanAlarm() {
		super("http://asd-europe.org/", "DetectionMeanAlarm");
	}

}
