/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:18 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class BreakdownElementStructureRelationshipType extends EcRemoteLinkedData {

    protected BreakdownElementStructureRelationshipTypeCodeValues code;
    protected s6000t.taskTrainAnalysis.ProductName.Applic applic;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Docs docs;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Rmks rmks;

    public BreakdownElementStructureRelationshipTypeCodeValues getCode() {
        return code;
    }

    public void setCode(BreakdownElementStructureRelationshipTypeCodeValues value) {
        this.code = value;
    }

    public s6000t.taskTrainAnalysis.ProductName.Applic getApplic() {
        return applic;
    }

    public void setApplic(s6000t.taskTrainAnalysis.ProductName.Applic value) {
        this.applic = value;
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

	public BreakdownElementStructureRelationshipType() {
		super("http://asd-europe.org/", "BreakdownElementStructureRelationshipType");
	}

}
