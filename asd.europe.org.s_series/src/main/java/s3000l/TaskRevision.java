/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:22 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class TaskRevision extends EcRemoteLinkedData {

    protected TaskRevisionIdentifier taskRevId;
    protected Array<TaskName> name;
    protected TaskRevisionStatus status;
    protected TaskRevisionChangeDescription revChangeDescr;
    protected InformationCode infoCode;
    protected TaskPersonnelSafetyCriticality persSafety;
    protected TaskProductIntegrityCriticality prodIntegr;
    protected TaskOperabilityImpact opImpact;
    protected Array<TaskDuration> duration;
    protected Array<TaskTotalLaborTime> laborTime;
    protected Array<Object> subtaskNonAbstractClasses;
    protected Array<Object> taskTrainDecisionNonAbstractClasses;
    protected Array<TaskRevisionWarningCautionNote> wcn;
    protected Array<TaskJustification> taskJust;
    protected Array<DataModuleScope> dm;
    protected TaskRevision.Resources resources;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public TaskRevisionIdentifier getTaskRevId() {
        return taskRevId;
    }

    public void setTaskRevId(TaskRevisionIdentifier value) {
        this.taskRevId = value;
    }

    public Array<TaskName> getName() {
        if (name == null) {
            name = new Array<TaskName>();
        }
        return this.name;
    }

    public TaskRevisionStatus getStatus() {
        return status;
    }

    public void setStatus(TaskRevisionStatus value) {
        this.status = value;
    }

    public TaskRevisionChangeDescription getRevChangeDescr() {
        return revChangeDescr;
    }

    public void setRevChangeDescr(TaskRevisionChangeDescription value) {
        this.revChangeDescr = value;
    }

    public InformationCode getInfoCode() {
        return infoCode;
    }

    public void setInfoCode(InformationCode value) {
        this.infoCode = value;
    }

    public TaskPersonnelSafetyCriticality getPersSafety() {
        return persSafety;
    }

    public void setPersSafety(TaskPersonnelSafetyCriticality value) {
        this.persSafety = value;
    }

    public TaskProductIntegrityCriticality getProdIntegr() {
        return prodIntegr;
    }

    public void setProdIntegr(TaskProductIntegrityCriticality value) {
        this.prodIntegr = value;
    }

    public TaskOperabilityImpact getOpImpact() {
        return opImpact;
    }

    public void setOpImpact(TaskOperabilityImpact value) {
        this.opImpact = value;
    }

    public Array<TaskDuration> getDuration() {
        if (duration == null) {
            duration = new Array<TaskDuration>();
        }
        return this.duration;
    }

    public Array<TaskTotalLaborTime> getLaborTime() {
        if (laborTime == null) {
            laborTime = new Array<TaskTotalLaborTime>();
        }
        return this.laborTime;
    }

    public Array<Object> getSubtaskNonAbstractClasses() {
        if (subtaskNonAbstractClasses == null) {
            subtaskNonAbstractClasses = new Array<Object>();
        }
        return this.subtaskNonAbstractClasses;
    }

    public Array<Object> getTaskTrainDecisionNonAbstractClasses() {
        if (taskTrainDecisionNonAbstractClasses == null) {
            taskTrainDecisionNonAbstractClasses = new Array<Object>();
        }
        return this.taskTrainDecisionNonAbstractClasses;
    }

    public Array<TaskRevisionWarningCautionNote> getWcn() {
        if (wcn == null) {
            wcn = new Array<TaskRevisionWarningCautionNote>();
        }
        return this.wcn;
    }

    public Array<TaskJustification> getTaskJust() {
        if (taskJust == null) {
            taskJust = new Array<TaskJustification>();
        }
        return this.taskJust;
    }

    public Array<DataModuleScope> getDm() {
        if (dm == null) {
            dm = new Array<DataModuleScope>();
        }
        return this.dm;
    }

    public TaskRevision.Resources getResources() {
        return resources;
    }

    public void setResources(TaskRevision.Resources value) {
        this.resources = value;
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

    public static class Resources {

        protected Array<Object> taskResourceNonAbstractClasses;

        public Array<Object> getTaskResourceNonAbstractClasses() {
            if (taskResourceNonAbstractClasses == null) {
                taskResourceNonAbstractClasses = new Array<Object>();
            }
            return this.taskResourceNonAbstractClasses;
        }

    }

	public TaskRevision() {
		super("http://www.asd-europe.org/s-series/s3000l", "TaskRevision");
	}

}
