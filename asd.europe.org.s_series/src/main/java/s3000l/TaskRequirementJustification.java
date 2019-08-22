/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Aug 22 12:47:55 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class TaskRequirementJustification extends EcRemoteLinkedData {

    protected SpecialEventReference sEvntRef;
    protected FailureModeReference fmRef;
    protected DamageReference dmgRef;
    protected CandidateItemAnalysisActivityReference analysisRef;
    protected FunctionalFailureReference funcFailRef;
    protected s3000l.ConditionInstance.Docs docs;
    protected s3000l.ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public SpecialEventReference getSEvntRef() {
        return sEvntRef;
    }

    public void setSEvntRef(SpecialEventReference value) {
        this.sEvntRef = value;
    }

    public FailureModeReference getFmRef() {
        return fmRef;
    }

    public void setFmRef(FailureModeReference value) {
        this.fmRef = value;
    }

    public DamageReference getDmgRef() {
        return dmgRef;
    }

    public void setDmgRef(DamageReference value) {
        this.dmgRef = value;
    }

    public CandidateItemAnalysisActivityReference getAnalysisRef() {
        return analysisRef;
    }

    public void setAnalysisRef(CandidateItemAnalysisActivityReference value) {
        this.analysisRef = value;
    }

    public FunctionalFailureReference getFuncFailRef() {
        return funcFailRef;
    }

    public void setFuncFailRef(FunctionalFailureReference value) {
        this.funcFailRef = value;
    }

    public s3000l.ConditionInstance.Docs getDocs() {
        return docs;
    }

    public void setDocs(s3000l.ConditionInstance.Docs value) {
        this.docs = value;
    }

    public s3000l.ConditionInstance.Rmks getRmks() {
        return rmks;
    }

    public void setRmks(s3000l.ConditionInstance.Rmks value) {
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

	public TaskRequirementJustification() {
		super("http://www.asd-europe.org/s-series/s3000l", "TaskRequirementJustification");
	}

}
