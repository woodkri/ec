/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:22 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class TaskRevisionIdentifier extends EcRemoteLinkedData {

    protected TaskRevisionIdentifierClassValues clazz;
    protected OrganizationReference setBy;

    public TaskRevisionIdentifierClassValues getClazz() {
        return clazz;
    }

    public void setClazz(TaskRevisionIdentifierClassValues value) {
        this.clazz = value;
    }

    public OrganizationReference getSetBy() {
        return setBy;
    }

    public void setSetBy(OrganizationReference value) {
        this.setBy = value;
    }

	public TaskRevisionIdentifier() {
		super("http://asd-europe.org/", "TaskRevisionIdentifier");
	}

}
