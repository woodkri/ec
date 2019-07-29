/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:22 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class TaskPersonnelResourceCompetence extends EcRemoteLinkedData {

    protected Array<TaskPersonnelResourceCompetence.AddTrain> addTrain;
    protected TradeReference tradeRef;
    protected SkillLevelReference skillLevelRef;
    protected SkillReference skillRef;
    protected s6000t.taskTrainAnalysis.ProductName.Applic applic;
    protected String uid;
    protected CrudCodeValues crud;

    public Array<TaskPersonnelResourceCompetence.AddTrain> getAddTrain() {
        if (addTrain == null) {
            addTrain = new Array<TaskPersonnelResourceCompetence.AddTrain>();
        }
        return this.addTrain;
    }

    public TradeReference getTradeRef() {
        return tradeRef;
    }

    public void setTradeRef(TradeReference value) {
        this.tradeRef = value;
    }

    public SkillLevelReference getSkillLevelRef() {
        return skillLevelRef;
    }

    public void setSkillLevelRef(SkillLevelReference value) {
        this.skillLevelRef = value;
    }

    public SkillReference getSkillRef() {
        return skillRef;
    }

    public void setSkillRef(SkillReference value) {
        this.skillRef = value;
    }

    public s6000t.taskTrainAnalysis.ProductName.Applic getApplic() {
        return applic;
    }

    public void setApplic(s6000t.taskTrainAnalysis.ProductName.Applic value) {
        this.applic = value;
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

    public static class AddTrain {

        protected AdditionalTrainingRequirementDescription trainDescr;
        protected TrainingMethod trainMeth;
        protected s6000t.taskTrainAnalysis.ConditionInstance.Docs docs;
        protected s6000t.taskTrainAnalysis.ConditionInstance.Rmks rmks;

        public AdditionalTrainingRequirementDescription getTrainDescr() {
            return trainDescr;
        }

        public void setTrainDescr(AdditionalTrainingRequirementDescription value) {
            this.trainDescr = value;
        }

        public TrainingMethod getTrainMeth() {
            return trainMeth;
        }

        public void setTrainMeth(TrainingMethod value) {
            this.trainMeth = value;
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

    }

	public TaskPersonnelResourceCompetence() {
		super("http://asd-europe.org/", "TaskPersonnelResourceCompetence");
	}

}
