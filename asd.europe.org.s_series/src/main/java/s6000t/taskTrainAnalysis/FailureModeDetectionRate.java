/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:19 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Date;

public class FailureModeDetectionRate extends EcRemoteLinkedData {

    protected Date date;
    protected ValueDeterminationCodeValues vdtm;
    protected RelativeUnit unit;
    protected double value;
    protected double nomVal;
    protected double lowOff;
    protected double uppOff;
    protected double lowVal;
    protected double uppVal;
    protected String txt;
    protected s6000t.taskTrainAnalysis.ProductName.Applic applic;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Docs docs;
    protected s6000t.taskTrainAnalysis.DownTime.OrgInfos orgInfos;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Rmks rmks;

    public Date getDate() {
        return date;
    }

    public void setDate(Date value) {
        this.date = value;
    }

    public ValueDeterminationCodeValues getVdtm() {
        return vdtm;
    }

    public void setVdtm(ValueDeterminationCodeValues value) {
        this.vdtm = value;
    }

    public RelativeUnit getUnit() {
        return unit;
    }

    public void setUnit(RelativeUnit value) {
        this.unit = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getNomVal() {
        return nomVal;
    }

    public void setNomVal(double value) {
        this.nomVal = value;
    }

    public double getLowOff() {
        return lowOff;
    }

    public void setLowOff(double value) {
        this.lowOff = value;
    }

    public double getUppOff() {
        return uppOff;
    }

    public void setUppOff(double value) {
        this.uppOff = value;
    }

    public double getLowVal() {
        return lowVal;
    }

    public void setLowVal(double value) {
        this.lowVal = value;
    }

    public double getUppVal() {
        return uppVal;
    }

    public void setUppVal(double value) {
        this.uppVal = value;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String value) {
        this.txt = value;
    }

    public s6000t.taskTrainAnalysis.ProductName.Applic getApplic() {
        return applic;
    }

    public void setApplic(s6000t.taskTrainAnalysis.ProductName.Applic value) {
        this.applic = value;
    }

    public s6000t.taskTrainAnalysis.ConditionInstance.Docs getDocs() {
        return docs;
    }

    public void setDocs(s6000t.taskTrainAnalysis.ConditionInstance.Docs value) {
        this.docs = value;
    }

    public s6000t.taskTrainAnalysis.DownTime.OrgInfos getOrgInfos() {
        return orgInfos;
    }

    public void setOrgInfos(s6000t.taskTrainAnalysis.DownTime.OrgInfos value) {
        this.orgInfos = value;
    }

    public s6000t.taskTrainAnalysis.ConditionInstance.Rmks getRmks() {
        return rmks;
    }

    public void setRmks(s6000t.taskTrainAnalysis.ConditionInstance.Rmks value) {
        this.rmks = value;
    }

	public FailureModeDetectionRate() {
		super("http://asd-europe.org/", "FailureModeDetectionRate");
	}

}
