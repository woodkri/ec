/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:18 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class BreakdownElementInZoneRelationship extends EcRemoteLinkedData {

    protected BreakdownElementUsageInBreakdownReference zoneRef;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public BreakdownElementUsageInBreakdownReference getZoneRef() {
        return zoneRef;
    }

    public void setZoneRef(BreakdownElementUsageInBreakdownReference value) {
        this.zoneRef = value;
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

	public BreakdownElementInZoneRelationship() {
		super("http://www.asd-europe.org/s-series/s3000l", "BreakdownElementInZoneRelationship");
	}

}
