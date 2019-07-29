/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:19 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class ConditionType extends EcRemoteLinkedData {

    protected ConditionTypeName condName;
    protected ConditionTypeDescription condDescr;
    protected Array<Object> conditionTypeValueNonAbstractClasses;
    protected Array<ConditionInstance> condInst;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public ConditionTypeName getCondName() {
        return condName;
    }

    public void setCondName(ConditionTypeName value) {
        this.condName = value;
    }

    public ConditionTypeDescription getCondDescr() {
        return condDescr;
    }

    public void setCondDescr(ConditionTypeDescription value) {
        this.condDescr = value;
    }

    public Array<Object> getConditionTypeValueNonAbstractClasses() {
        if (conditionTypeValueNonAbstractClasses == null) {
            conditionTypeValueNonAbstractClasses = new Array<Object>();
        }
        return this.conditionTypeValueNonAbstractClasses;
    }

    public Array<ConditionInstance> getCondInst() {
        if (condInst == null) {
            condInst = new Array<ConditionInstance>();
        }
        return this.condInst;
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

	public ConditionType() {
		super("http://asd-europe.org/", "ConditionType");
	}

}
