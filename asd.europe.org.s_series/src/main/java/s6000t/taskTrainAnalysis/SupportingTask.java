/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:22 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class SupportingTask extends EcRemoteLinkedData {

    protected Array<TaskIdentifier> taskId;
    protected Array<TaskRevision> taskRev;
    protected s6000t.taskTrainAnalysis.OperationalTask.Secs secs;
    protected s6000t.taskTrainAnalysis.DownTime.OrgInfos orgInfos;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Docs docs;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Rmks rmks;
    protected String uid;
    protected String uri;
    protected CrudCodeValues crud;

    public Array<TaskIdentifier> getTaskId() {
        if (taskId == null) {
            taskId = new Array<TaskIdentifier>();
        }
        return this.taskId;
    }

    public Array<TaskRevision> getTaskRev() {
        if (taskRev == null) {
            taskRev = new Array<TaskRevision>();
        }
        return this.taskRev;
    }

    public s6000t.taskTrainAnalysis.OperationalTask.Secs getSecs() {
        return secs;
    }

    public void setSecs(s6000t.taskTrainAnalysis.OperationalTask.Secs value) {
        this.secs = value;
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

	public SupportingTask() {
		super("http://asd-europe.org/", "SupportingTask");
	}

}
