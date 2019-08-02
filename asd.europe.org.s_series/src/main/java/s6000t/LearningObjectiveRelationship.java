/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:20 CDT 2019
 *
 **/

package s6000t;

import org.cassproject.schema.general.EcRemoteLinkedData;
import s3000l.*;

public class LearningObjectiveRelationship extends EcRemoteLinkedData {

    protected LearningObjectiveRelationshipType relType;
    protected LearningObjectiveRef loRef;
    protected DownTime.OrgInfos orgInfos;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;
    protected String uid;
    protected String uri;
    protected CrudCodeValues crud;

    public LearningObjectiveRelationshipType getRelType() {
        return relType;
    }

    public void setRelType(LearningObjectiveRelationshipType value) {
        this.relType = value;
    }

    public LearningObjectiveRef getLoRef() {
        return loRef;
    }

    public void setLoRef(LearningObjectiveRef value) {
        this.loRef = value;
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

	public LearningObjectiveRelationship() {
		super("http://www.asd-europe.org/s-series/s6000t", "LearningObjectiveRelationship");
	}

}
