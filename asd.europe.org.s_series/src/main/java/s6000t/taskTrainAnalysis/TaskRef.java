/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:22 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class TaskRef extends EcRemoteLinkedData {

    protected TaskIdentifier taskId;
    protected Object uidRef;

    public TaskIdentifier getTaskId() {
        return taskId;
    }

    public void setTaskId(TaskIdentifier value) {
        this.taskId = value;
    }

    public Object getUidRef() {
        return uidRef;
    }

    public void setUidRef(Object value) {
        this.uidRef = value;
    }

	public TaskRef() {
		super("http://asd-europe.org/", "TaskRef");
	}

}
