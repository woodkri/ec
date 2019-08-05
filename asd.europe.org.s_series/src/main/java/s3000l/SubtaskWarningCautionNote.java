/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:22 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import s6000t.AffectiveLevelOfLearningIteration;
import s6000t.CognitiveLevelOfLearningIteration;
import s6000t.PsychomotorLevelOfLearningIteration;

public class SubtaskWarningCautionNote extends EcRemoteLinkedData {

    protected WarningCautionNoteRef wcnRef;
    protected WarningCautionNote wcnDef;
    protected AffectiveLevelOfLearningIteration affecLoL;
    protected CognitiveLevelOfLearningIteration cognLoL;
    protected PsychomotorLevelOfLearningIteration psychLoL;
    protected String uid;
    protected CrudCodeValues crud;

    public WarningCautionNoteRef getWcnRef() {
        return wcnRef;
    }

    public void setWcnRef(WarningCautionNoteRef value) {
        this.wcnRef = value;
    }

    public WarningCautionNote getWcnDef() {
        return wcnDef;
    }

    public void setWcnDef(WarningCautionNote value) {
        this.wcnDef = value;
    }

    public AffectiveLevelOfLearningIteration getAffecLoL() {
        return affecLoL;
    }

    public void setAffecLoL(AffectiveLevelOfLearningIteration value) {
        this.affecLoL = value;
    }

    public CognitiveLevelOfLearningIteration getCognLoL() {
        return cognLoL;
    }

    public void setCognLoL(CognitiveLevelOfLearningIteration value) {
        this.cognLoL = value;
    }

    public PsychomotorLevelOfLearningIteration getPsychLoL() {
        return psychLoL;
    }

    public void setPsychLoL(PsychomotorLevelOfLearningIteration value) {
        this.psychLoL = value;
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

	public SubtaskWarningCautionNote() {
		super("http://www.asd-europe.org/s-series/s3000l", "SubtaskWarningCautionNote");
	}

}