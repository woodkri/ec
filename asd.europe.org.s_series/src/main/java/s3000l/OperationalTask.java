/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class OperationalTask extends EcRemoteLinkedData {

    protected Array<TaskIdentifier> taskId;
    protected Array<TaskRevision> taskRev;
    protected OperationalTask.Secs secs;
    protected DownTime.OrgInfos orgInfos;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;
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

    public OperationalTask.Secs getSecs() {
        return secs;
    }

    public void setSecs(OperationalTask.Secs value) {
        this.secs = value;
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

    public static class Secs {

        protected Array<SecurityClassification> sec;

        public Array<SecurityClassification> getSec() {
            if (sec == null) {
                sec = new Array<SecurityClassification>();
            }
            return this.sec;
        }

    }

	public OperationalTask() {
		super("http://www.asd-europe.org/s-series/s3000l", "OperationalTask");
	}

}
