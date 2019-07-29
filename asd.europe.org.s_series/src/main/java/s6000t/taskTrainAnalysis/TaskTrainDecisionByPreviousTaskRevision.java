/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:22 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class TaskTrainDecisionByPreviousTaskRevision extends EcRemoteLinkedData {

    protected TaskTrainDecisionIterationIdentifier iterationId;
    protected Array<TaskTrainDecisionRationale> dcsnRtnle;
    protected Array<TaskTrainDecisionIterationRationale> iterRtnle;
    protected TaskTrainDecisionIterationDate iterDate;
    protected Array<TaskPerformanceObjective> perfObj;
    protected s6000t.taskTrainAnalysis.DownTime.OrgInfos orgInfos;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Docs docs;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Rmks rmks;
    protected String uid;
    protected String uri;
    protected CrudCodeValues crud;

    public TaskTrainDecisionIterationIdentifier getIterationId() {
        return iterationId;
    }

    public void setIterationId(TaskTrainDecisionIterationIdentifier value) {
        this.iterationId = value;
    }

    public Array<TaskTrainDecisionRationale> getDcsnRtnle() {
        if (dcsnRtnle == null) {
            dcsnRtnle = new Array<TaskTrainDecisionRationale>();
        }
        return this.dcsnRtnle;
    }

    public Array<TaskTrainDecisionIterationRationale> getIterRtnle() {
        if (iterRtnle == null) {
            iterRtnle = new Array<TaskTrainDecisionIterationRationale>();
        }
        return this.iterRtnle;
    }

    public TaskTrainDecisionIterationDate getIterDate() {
        return iterDate;
    }

    public void setIterDate(TaskTrainDecisionIterationDate value) {
        this.iterDate = value;
    }

    public Array<TaskPerformanceObjective> getPerfObj() {
        if (perfObj == null) {
            perfObj = new Array<TaskPerformanceObjective>();
        }
        return this.perfObj;
    }

    public s6000t.taskTrainAnalysis.DownTime.OrgInfos getOrgInfos() {
        return orgInfos;
    }

    public void setOrgInfos(s6000t.taskTrainAnalysis.DownTime.OrgInfos value) {
        this.orgInfos = value;
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

    public String getUri() {
        return uri;
    }

    public void setUri(String value) {
        this.uri = value;
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

	public TaskTrainDecisionByPreviousTaskRevision() {
		super("http://asd-europe.org/", "TaskTrainDecisionByPreviousTaskRevision");
	}

}
