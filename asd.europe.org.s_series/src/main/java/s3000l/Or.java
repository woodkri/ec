/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Aug 22 12:47:54 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class Or extends EcRemoteLinkedData {

    protected Array<Object> applicabilityEvaluationNonAbstractClasses;
    protected String uid;
    protected CrudCodeValues crud;

    public Array<Object> getApplicabilityEvaluationNonAbstractClasses() {
        if (applicabilityEvaluationNonAbstractClasses == null) {
            applicabilityEvaluationNonAbstractClasses = new Array<Object>();
        }
        return this.applicabilityEvaluationNonAbstractClasses;
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

	public Or() {
		super("http://www.asd-europe.org/s-series/s3000l", "Or");
	}

}
