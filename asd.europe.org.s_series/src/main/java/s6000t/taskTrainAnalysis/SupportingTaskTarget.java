/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:22 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class SupportingTaskTarget extends EcRemoteLinkedData {

    protected Array<SupportingTaskTarget.TaskFreq> taskFreq;
    protected TaskRef taskRef;
    protected s6000t.taskTrainAnalysis.DownTime.OrgInfos orgInfos;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Docs docs;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Rmks rmks;
    protected s6000t.taskTrainAnalysis.ProductName.Applic applic;
    protected String uid;
    protected CrudCodeValues crud;

    public Array<SupportingTaskTarget.TaskFreq> getTaskFreq() {
        if (taskFreq == null) {
            taskFreq = new Array<SupportingTaskTarget.TaskFreq>();
        }
        return this.taskFreq;
    }

    public TaskRef getTaskRef() {
        return taskRef;
    }

    public void setTaskRef(TaskRef value) {
        this.taskRef = value;
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

    public s6000t.taskTrainAnalysis.ProductName.Applic getApplic() {
        return applic;
    }

    public void setApplic(s6000t.taskTrainAnalysis.ProductName.Applic value) {
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

    public static class TaskFreq {

        protected Array<TaskFrequency> frequency;
        protected TaskFrequencyCalculationMethod calcMthd;
        protected s6000t.taskTrainAnalysis.ConditionInstance.Docs docs;
        protected s6000t.taskTrainAnalysis.ConditionInstance.Rmks rmks;
        protected s6000t.taskTrainAnalysis.ProductName.Applic applic;

        public Array<TaskFrequency> getFrequency() {
            if (frequency == null) {
                frequency = new Array<TaskFrequency>();
            }
            return this.frequency;
        }

        public TaskFrequencyCalculationMethod getCalcMthd() {
            return calcMthd;
        }

        public void setCalcMthd(TaskFrequencyCalculationMethod value) {
            this.calcMthd = value;
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

        public s6000t.taskTrainAnalysis.ProductName.Applic getApplic() {
            return applic;
        }

        public void setApplic(s6000t.taskTrainAnalysis.ProductName.Applic value) {
            this.applic = value;
        }

    }

	public SupportingTaskTarget() {
		super("http://asd-europe.org/", "SupportingTaskTarget");
	}

}
