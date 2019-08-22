/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Aug 22 12:47:53 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class ExternalDocumentIssue extends EcRemoteLinkedData {

    protected DocumentIssueIdentifier docIssId;
    protected DocumentIssueDate issDate;
    protected s3000l.ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public DocumentIssueIdentifier getDocIssId() {
        return docIssId;
    }

    public void setDocIssId(DocumentIssueIdentifier value) {
        this.docIssId = value;
    }

    public DocumentIssueDate getIssDate() {
        return issDate;
    }

    public void setIssDate(DocumentIssueDate value) {
        this.issDate = value;
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

	public ExternalDocumentIssue() {
		super("http://www.asd-europe.org/s-series/s3000l", "ExternalDocumentIssue");
	}

}
