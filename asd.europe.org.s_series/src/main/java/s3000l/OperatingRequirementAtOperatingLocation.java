/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Date;

public class OperatingRequirementAtOperatingLocation extends EcRemoteLinkedData {

    protected Date date;
    protected ValueDeterminationCodeValues vdtm;
    protected String unit;
    protected double value;
    protected double nomVal;
    protected double lowOff;
    protected double uppOff;
    protected double lowVal;
    protected double uppVal;
    protected String txt;
    protected ProductName.Applic applic;
    protected ConditionInstance.Docs docs;
    protected DownTime.OrgInfos orgInfos;
    protected ConditionInstance.Rmks rmks;

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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String value) {
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

    public DownTime.OrgInfos getOrgInfos() {
        return orgInfos;
    }

    public void setOrgInfos(DownTime.OrgInfos value) {
        this.orgInfos = value;
    }

    public ConditionInstance.Rmks getRmks() {
        return rmks;
    }

    public void setRmks(ConditionInstance.Rmks value) {
        this.rmks = value;
    }

	public OperatingRequirementAtOperatingLocation() {
		super("http://www.asd-europe.org/s-series/s3000l", "OperatingRequirementAtOperatingLocation");
	}

}
