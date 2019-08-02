/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class Not extends EcRemoteLinkedData {

    protected And and;
    protected Not not;
    protected Or or;
    protected ApplicabilityEvaluationByAssertionOfClassInstance assertInst;
    protected ApplicabilityEvaluationByAssertionOfCondition assertCond;
    protected ApplicabilityEvaluationByApplicabilityStatementReference nestedApplic;
    protected ApplicabilityEvaluationByAssertionOfSerializedItems assertSi;
    protected String uid;
    protected CrudCodeValues crud;

    public And getAnd() {
        return and;
    }

    public void setAnd(And value) {
        this.and = value;
    }

    public Not getNot() {
        return not;
    }

    public void setNot(Not value) {
        this.not = value;
    }

    public Or getOr() {
        return or;
    }

    public void setOr(Or value) {
        this.or = value;
    }

    public ApplicabilityEvaluationByAssertionOfClassInstance getAssertInst() {
        return assertInst;
    }

    public void setAssertInst(ApplicabilityEvaluationByAssertionOfClassInstance value) {
        this.assertInst = value;
    }

    public ApplicabilityEvaluationByAssertionOfCondition getAssertCond() {
        return assertCond;
    }

    public void setAssertCond(ApplicabilityEvaluationByAssertionOfCondition value) {
        this.assertCond = value;
    }

    public ApplicabilityEvaluationByApplicabilityStatementReference getNestedApplic() {
        return nestedApplic;
    }

    public void setNestedApplic(ApplicabilityEvaluationByApplicabilityStatementReference value) {
        this.nestedApplic = value;
    }

    public ApplicabilityEvaluationByAssertionOfSerializedItems getAssertSi() {
        return assertSi;
    }

    public void setAssertSi(ApplicabilityEvaluationByAssertionOfSerializedItems value) {
        this.assertSi = value;
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

	public Not() {
		super("http://www.asd-europe.org/s-series/s3000l", "Not");
	}

}
