/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:20 CDT 2019
 *
 **/

package s6000t;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;
import s3000l.*;

public class LearningObjective extends EcRemoteLinkedData {

    protected Array<LearningObjectiveIdentifier> loId;
    protected LearningObjectiveType loType;
    protected LearningObjectiveTitle title;
    protected Array<LearningObjectiveRevision> loRev;
    protected DownTime.OrgInfos orgInfos;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;
    protected String uid;
    protected String uri;
    protected CrudCodeValues crud;

    public Array<LearningObjectiveIdentifier> getLoId() {
        if (loId == null) {
            loId = new Array<LearningObjectiveIdentifier>();
        }
        return this.loId;
    }

    public LearningObjectiveType getLoType() {
        return loType;
    }

    public void setLoType(LearningObjectiveType value) {
        this.loType = value;
    }

    public LearningObjectiveTitle getTitle() {
        return title;
    }

    public void setTitle(LearningObjectiveTitle value) {
        this.title = value;
    }

    public Array<LearningObjectiveRevision> getLoRev() {
        if (loRev == null) {
            loRev = new Array<LearningObjectiveRevision>();
        }
        return this.loRev;
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

	public LearningObjective() {
		super("http://www.asd-europe.org/s-series/s6000t", "LearningObjective");
	}

}
