/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:20 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class MessageSender extends EcRemoteLinkedData {

    protected OrganizationReference orgRef;
    protected String uid;
    protected CrudCodeValues crud;

    public OrganizationReference getOrgRef() {
        return orgRef;
    }

    public void setOrgRef(OrganizationReference value) {
        this.orgRef = value;
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

	public MessageSender() {
		super("http://www.asd-europe.org/s-series/s3000l", "MessageSender");
	}

}
