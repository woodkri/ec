/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:22 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class SubtaskRef extends EcRemoteLinkedData {

    protected TaskIdentifier taskId;
    protected TaskRevisionIdentifier taskRevId;
    protected SubtaskIdentifier subtId;
    protected Object uidRef;

    public TaskIdentifier getTaskId() {
        return taskId;
    }

    public void setTaskId(TaskIdentifier value) {
        this.taskId = value;
    }

    public TaskRevisionIdentifier getTaskRevId() {
        return taskRevId;
    }

    public void setTaskRevId(TaskRevisionIdentifier value) {
        this.taskRevId = value;
    }

    public SubtaskIdentifier getSubtId() {
        return subtId;
    }

    public void setSubtId(SubtaskIdentifier value) {
        this.subtId = value;
    }

    public Object getUidRef() {
        return uidRef;
    }

    public void setUidRef(Object value) {
        this.uidRef = value;
    }

	public SubtaskRef() {
		super("http://www.asd-europe.org/s-series/s3000l", "SubtaskRef");
	}

}
