/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:20 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class LearningObjectiveRevision extends EcRemoteLinkedData {

    protected Array<LearningObjectiveRevisionIdentifier> loRevId;
    protected Array<LearningObjectiveRevisionRationale> loRevRtnle;
    protected Array<LearningObjectiveDescription> loDescr;
    protected Array<LearningObjectivePerformanceStandard> loPerfStd;
    protected LearningObjectiveAssessment loAssmnt;
    protected Array<LearningObjectiveRelationship> relLO;
    protected s6000t.taskTrainAnalysis.DownTime.OrgInfos orgInfos;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Docs docs;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Rmks rmks;
    protected String uid;
    protected String uri;
    protected CrudCodeValues crud;

    public Array<LearningObjectiveRevisionIdentifier> getLoRevId() {
        if (loRevId == null) {
            loRevId = new Array<LearningObjectiveRevisionIdentifier>();
        }
        return this.loRevId;
    }

    public Array<LearningObjectiveRevisionRationale> getLoRevRtnle() {
        if (loRevRtnle == null) {
            loRevRtnle = new Array<LearningObjectiveRevisionRationale>();
        }
        return this.loRevRtnle;
    }

    public Array<LearningObjectiveDescription> getLoDescr() {
        if (loDescr == null) {
            loDescr = new Array<LearningObjectiveDescription>();
        }
        return this.loDescr;
    }

    public Array<LearningObjectivePerformanceStandard> getLoPerfStd() {
        if (loPerfStd == null) {
            loPerfStd = new Array<LearningObjectivePerformanceStandard>();
        }
        return this.loPerfStd;
    }

    public LearningObjectiveAssessment getLoAssmnt() {
        return loAssmnt;
    }

    public void setLoAssmnt(LearningObjectiveAssessment value) {
        this.loAssmnt = value;
    }

    public Array<LearningObjectiveRelationship> getRelLO() {
        if (relLO == null) {
            relLO = new Array<LearningObjectiveRelationship>();
        }
        return this.relLO;
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

	public LearningObjectiveRevision() {
		super("http://asd-europe.org/", "LearningObjectiveRevision");
	}

}
