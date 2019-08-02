/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:18 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class BreakdownElementRevisionRelationship extends EcRemoteLinkedData {

    protected BreakdownElementRelationshipType relType;
    protected BreakdownElementRevisionReference beRef;
    protected ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public BreakdownElementRelationshipType getRelType() {
        return relType;
    }

    public void setRelType(BreakdownElementRelationshipType value) {
        this.relType = value;
    }

    public BreakdownElementRevisionReference getBeRef() {
        return beRef;
    }

    public void setBeRef(BreakdownElementRevisionReference value) {
        this.beRef = value;
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

	public BreakdownElementRevisionRelationship() {
		super("http://www.asd-europe.org/s-series/s3000l", "BreakdownElementRevisionRelationship");
	}

}
