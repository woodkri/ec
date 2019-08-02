/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:20 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class LsaFailureModeWithDistributionRating extends EcRemoteLinkedData {

    protected FailureModeIdentifier fmId;
    protected FailureModeDescription fmDescr;
    protected Array<FailureModeFailureRate> failRte;
    protected Array<FailureModeDetectionAbilityRating> detectRtg;
    protected FailureModeDetectionAbilityDescription detectDescr;
    protected FailureModeLocalizationAbilityRating lznRtg;
    protected FailureModeLocalizationAbilityDescription lznDescr;
    protected FailureModeIsolationRate isolRte;
    protected Array<LsaFailureModeDistributionRating> distrRtg;
    protected Array<Object> failureModeEffectNonAbstractClasses;
    protected Array<FailureModeReference> techFmRef;
    protected DownTime.OrgInfos orgInfos;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;
    protected ProductName.Applic applic;
    protected String uid;
    protected CrudCodeValues crud;

    public FailureModeIdentifier getFmId() {
        return fmId;
    }

    public void setFmId(FailureModeIdentifier value) {
        this.fmId = value;
    }

    public FailureModeDescription getFmDescr() {
        return fmDescr;
    }

    public void setFmDescr(FailureModeDescription value) {
        this.fmDescr = value;
    }

    public Array<FailureModeFailureRate> getFailRte() {
        if (failRte == null) {
            failRte = new Array<FailureModeFailureRate>();
        }
        return this.failRte;
    }

    public Array<FailureModeDetectionAbilityRating> getDetectRtg() {
        if (detectRtg == null) {
            detectRtg = new Array<FailureModeDetectionAbilityRating>();
        }
        return this.detectRtg;
    }

    public FailureModeDetectionAbilityDescription getDetectDescr() {
        return detectDescr;
    }

    public void setDetectDescr(FailureModeDetectionAbilityDescription value) {
        this.detectDescr = value;
    }

    public FailureModeLocalizationAbilityRating getLznRtg() {
        return lznRtg;
    }

    public void setLznRtg(FailureModeLocalizationAbilityRating value) {
        this.lznRtg = value;
    }

    public FailureModeLocalizationAbilityDescription getLznDescr() {
        return lznDescr;
    }

    public void setLznDescr(FailureModeLocalizationAbilityDescription value) {
        this.lznDescr = value;
    }

    public FailureModeIsolationRate getIsolRte() {
        return isolRte;
    }

    public void setIsolRte(FailureModeIsolationRate value) {
        this.isolRte = value;
    }

    public Array<LsaFailureModeDistributionRating> getDistrRtg() {
        if (distrRtg == null) {
            distrRtg = new Array<LsaFailureModeDistributionRating>();
        }
        return this.distrRtg;
    }

    public Array<Object> getFailureModeEffectNonAbstractClasses() {
        if (failureModeEffectNonAbstractClasses == null) {
            failureModeEffectNonAbstractClasses = new Array<Object>();
        }
        return this.failureModeEffectNonAbstractClasses;
    }

    public Array<FailureModeReference> getTechFmRef() {
        if (techFmRef == null) {
            techFmRef = new Array<FailureModeReference>();
        }
        return this.techFmRef;
    }

    public DownTime.OrgInfos getOrgInfos() {
        return orgInfos;
    }

    public void setOrgInfos(DownTime.OrgInfos value) {
        this.orgInfos = value;
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

	public LsaFailureModeWithDistributionRating() {
		super("http://www.asd-europe.org/s-series/s3000l", "LsaFailureModeWithDistributionRating");
	}

}
