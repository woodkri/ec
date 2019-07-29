/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class SoftwareElement extends EcRemoteLinkedData {

    protected Array<BreakdownElementIdentifier> beId;
    protected Array<BreakdownElementName> name;
    protected BreakdownElementEssentiality esc;
    protected SoftwareElementType beType;
    protected Array<SoftwareElementRevision> beRev;
    protected s6000t.taskTrainAnalysis.OperationalTask.Secs secs;
    protected s6000t.taskTrainAnalysis.DownTime.OrgInfos orgInfos;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Docs docs;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public Array<BreakdownElementIdentifier> getBeId() {
        if (beId == null) {
            beId = new Array<BreakdownElementIdentifier>();
        }
        return this.beId;
    }

    public Array<BreakdownElementName> getName() {
        if (name == null) {
            name = new Array<BreakdownElementName>();
        }
        return this.name;
    }

    public BreakdownElementEssentiality getEsc() {
        return esc;
    }

    public void setEsc(BreakdownElementEssentiality value) {
        this.esc = value;
    }

    public SoftwareElementType getBeType() {
        return beType;
    }

    public void setBeType(SoftwareElementType value) {
        this.beType = value;
    }

    public Array<SoftwareElementRevision> getBeRev() {
        if (beRev == null) {
            beRev = new Array<SoftwareElementRevision>();
        }
        return this.beRev;
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

	public SoftwareElement() {
		super("http://asd-europe.org/", "SoftwareElement");
	}

}
