/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Sep 12 10:06:03 CDT 2019
 *
 **/

package s6000t;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class TaskKnowledgeSkillAttitudeGapItem extends EcRemoteLinkedData {

    protected Array<TaskKnowledgeSkillAttitudeGap> taskKSAGap;

    public Array<TaskKnowledgeSkillAttitudeGap> getTaskKSAGap() {
        if (taskKSAGap == null) {
            taskKSAGap = new Array<TaskKnowledgeSkillAttitudeGap>();
        }
        return this.taskKSAGap;
    }

	public TaskKnowledgeSkillAttitudeGapItem() {
		super("http://www.asd-europe.org/s-series/s3000l", "TaskKnowledgeSkillAttitudeGapItem");
	}

}