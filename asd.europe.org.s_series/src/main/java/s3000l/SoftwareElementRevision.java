/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class SoftwareElementRevision extends EcRemoteLinkedData {

    protected BreakdownElementRevisionIdentifier beRevId;
    protected BreakdownElementRevisionStatus status;
    protected MaintenanceSignificantOrRelevant msi;
    protected SoftwareElementSize swSize;
    protected SoftwareElementModificationFrequency modFreq;
    protected BreakdownElementRevisionCreationDate beRevDate;
    protected Array<FunctionalFailure> funcFail;
    protected Array<BreakdownElementRevisionRelationship> beRel;
    protected Array<SoftwareElementPartRealization> swPart;
    protected LsaCandidateIndicator lsaCand;
    protected LsaCandidateRationale candRtnl;
    protected Array<LsaCandidateMaintenanceConcept> maintCpt;
    protected Array<LsaCandidateMaintenanceSolution> maintSln;
    protected Array<ZoneElementRevision.SrvLife> productServiceLife;
    protected Array<ZoneElementRevision.SmInt> scheduledMaintenanceInterval;
    protected Array<ZoneElementRevision.Mfop> maintenanceFreeOperatingPeriod;
    protected Array<ZoneElementRevision.Dt> downTime;
    protected Array<ZoneElementRevision.Mmhoh> maintenanceManHoursPerOperatingHour;
    protected Array<ZoneElementRevision.Mtbur> meanTimeBetweenUnscheduledRemoval;
    protected Array<ZoneElementRevision.Mttr> meanTimeToRepair;
    protected Array<ZoneElementRevision.Dmc> directMaintenanceCost;
    protected Array<ZoneElementRevision.Spt> shopProcessingTime;
    protected Array<ZoneElementRevision.Foh> failuresPerOperatingHour;
    protected Array<ZoneElementRevision.Rplt> replacementTime;
    protected Array<ZoneElementRevision.Lcc> lifeCycleCost;
    protected Array<ZoneElementRevision.Mtbf> meanTimeBetweenFailure;
    protected Array<ZoneElementRevision.FRate> failureRate;
    protected LsaCandidateAnalysisActivities anlysActvty;
    protected Array<TaskRequirementTarget> taskReq;
    protected Array<Object> taskTargetNonAbstractClasses;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;
    protected ZoneElementRevision.DmgAnlys dmgAnlys;
    protected ZoneElementRevision.FailModes failModes;
    protected ZoneElementRevision.DetectMnCaps detectMnCaps;
    protected String uid;
    protected CrudCodeValues crud;

    public BreakdownElementRevisionIdentifier getBeRevId() {
        return beRevId;
    }

    public void setBeRevId(BreakdownElementRevisionIdentifier value) {
        this.beRevId = value;
    }

    public BreakdownElementRevisionStatus getStatus() {
        return status;
    }

    public void setStatus(BreakdownElementRevisionStatus value) {
        this.status = value;
    }

    public MaintenanceSignificantOrRelevant getMsi() {
        return msi;
    }

    public void setMsi(MaintenanceSignificantOrRelevant value) {
        this.msi = value;
    }

    public SoftwareElementSize getSwSize() {
        return swSize;
    }

    public void setSwSize(SoftwareElementSize value) {
        this.swSize = value;
    }

    public SoftwareElementModificationFrequency getModFreq() {
        return modFreq;
    }

    public void setModFreq(SoftwareElementModificationFrequency value) {
        this.modFreq = value;
    }

    public BreakdownElementRevisionCreationDate getBeRevDate() {
        return beRevDate;
    }

    public void setBeRevDate(BreakdownElementRevisionCreationDate value) {
        this.beRevDate = value;
    }

    public Array<FunctionalFailure> getFuncFail() {
        if (funcFail == null) {
            funcFail = new Array<FunctionalFailure>();
        }
        return this.funcFail;
    }

    public Array<BreakdownElementRevisionRelationship> getBeRel() {
        if (beRel == null) {
            beRel = new Array<BreakdownElementRevisionRelationship>();
        }
        return this.beRel;
    }

    public Array<SoftwareElementPartRealization> getSwPart() {
        if (swPart == null) {
            swPart = new Array<SoftwareElementPartRealization>();
        }
        return this.swPart;
    }

    public LsaCandidateIndicator getLsaCand() {
        return lsaCand;
    }

    public void setLsaCand(LsaCandidateIndicator value) {
        this.lsaCand = value;
    }

    public LsaCandidateRationale getCandRtnl() {
        return candRtnl;
    }

    public void setCandRtnl(LsaCandidateRationale value) {
        this.candRtnl = value;
    }

    public Array<LsaCandidateMaintenanceConcept> getMaintCpt() {
        if (maintCpt == null) {
            maintCpt = new Array<LsaCandidateMaintenanceConcept>();
        }
        return this.maintCpt;
    }

    public Array<LsaCandidateMaintenanceSolution> getMaintSln() {
        if (maintSln == null) {
            maintSln = new Array<LsaCandidateMaintenanceSolution>();
        }
        return this.maintSln;
    }

    public Array<ZoneElementRevision.SrvLife> getProductServiceLife() {
        if (productServiceLife == null) {
            productServiceLife = new Array<ZoneElementRevision.SrvLife>();
        }
        return this.productServiceLife;
    }

    public Array<ZoneElementRevision.SmInt> getScheduledMaintenanceInterval() {
        if (scheduledMaintenanceInterval == null) {
            scheduledMaintenanceInterval = new Array<ZoneElementRevision.SmInt>();
        }
        return this.scheduledMaintenanceInterval;
    }

    public Array<ZoneElementRevision.Mfop> getMaintenanceFreeOperatingPeriod() {
        if (maintenanceFreeOperatingPeriod == null) {
            maintenanceFreeOperatingPeriod = new Array<ZoneElementRevision.Mfop>();
        }
        return this.maintenanceFreeOperatingPeriod;
    }

    public Array<ZoneElementRevision.Dt> getDownTime() {
        if (downTime == null) {
            downTime = new Array<ZoneElementRevision.Dt>();
        }
        return this.downTime;
    }

    public Array<ZoneElementRevision.Mmhoh> getMaintenanceManHoursPerOperatingHour() {
        if (maintenanceManHoursPerOperatingHour == null) {
            maintenanceManHoursPerOperatingHour = new Array<ZoneElementRevision.Mmhoh>();
        }
        return this.maintenanceManHoursPerOperatingHour;
    }

    public Array<ZoneElementRevision.Mtbur> getMeanTimeBetweenUnscheduledRemoval() {
        if (meanTimeBetweenUnscheduledRemoval == null) {
            meanTimeBetweenUnscheduledRemoval = new Array<ZoneElementRevision.Mtbur>();
        }
        return this.meanTimeBetweenUnscheduledRemoval;
    }

    public Array<ZoneElementRevision.Mttr> getMeanTimeToRepair() {
        if (meanTimeToRepair == null) {
            meanTimeToRepair = new Array<ZoneElementRevision.Mttr>();
        }
        return this.meanTimeToRepair;
    }

    public Array<ZoneElementRevision.Dmc> getDirectMaintenanceCost() {
        if (directMaintenanceCost == null) {
            directMaintenanceCost = new Array<ZoneElementRevision.Dmc>();
        }
        return this.directMaintenanceCost;
    }

    public Array<ZoneElementRevision.Spt> getShopProcessingTime() {
        if (shopProcessingTime == null) {
            shopProcessingTime = new Array<ZoneElementRevision.Spt>();
        }
        return this.shopProcessingTime;
    }

    public Array<ZoneElementRevision.Foh> getFailuresPerOperatingHour() {
        if (failuresPerOperatingHour == null) {
            failuresPerOperatingHour = new Array<ZoneElementRevision.Foh>();
        }
        return this.failuresPerOperatingHour;
    }

    public Array<ZoneElementRevision.Rplt> getReplacementTime() {
        if (replacementTime == null) {
            replacementTime = new Array<ZoneElementRevision.Rplt>();
        }
        return this.replacementTime;
    }

    public Array<ZoneElementRevision.Lcc> getLifeCycleCost() {
        if (lifeCycleCost == null) {
            lifeCycleCost = new Array<ZoneElementRevision.Lcc>();
        }
        return this.lifeCycleCost;
    }

    public Array<ZoneElementRevision.Mtbf> getMeanTimeBetweenFailure() {
        if (meanTimeBetweenFailure == null) {
            meanTimeBetweenFailure = new Array<ZoneElementRevision.Mtbf>();
        }
        return this.meanTimeBetweenFailure;
    }

    public Array<ZoneElementRevision.FRate> getFailureRate() {
        if (failureRate == null) {
            failureRate = new Array<ZoneElementRevision.FRate>();
        }
        return this.failureRate;
    }

    public LsaCandidateAnalysisActivities getAnlysActvty() {
        return anlysActvty;
    }

    public void setAnlysActvty(LsaCandidateAnalysisActivities value) {
        this.anlysActvty = value;
    }

    public Array<TaskRequirementTarget> getTaskReq() {
        if (taskReq == null) {
            taskReq = new Array<TaskRequirementTarget>();
        }
        return this.taskReq;
    }

    public Array<Object> getTaskTargetNonAbstractClasses() {
        if (taskTargetNonAbstractClasses == null) {
            taskTargetNonAbstractClasses = new Array<Object>();
        }
        return this.taskTargetNonAbstractClasses;
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

    public ZoneElementRevision.DmgAnlys getDmgAnlys() {
        return dmgAnlys;
    }

    public void setDmgAnlys(ZoneElementRevision.DmgAnlys value) {
        this.dmgAnlys = value;
    }

    public ZoneElementRevision.FailModes getFailModes() {
        return failModes;
    }

    public void setFailModes(ZoneElementRevision.FailModes value) {
        this.failModes = value;
    }

    public ZoneElementRevision.DetectMnCaps getDetectMnCaps() {
        return detectMnCaps;
    }

    public void setDetectMnCaps(ZoneElementRevision.DetectMnCaps value) {
        this.detectMnCaps = value;
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

	public SoftwareElementRevision() {
		super("http://www.asd-europe.org/s-series/s3000l", "SoftwareElementRevision");
	}

}
