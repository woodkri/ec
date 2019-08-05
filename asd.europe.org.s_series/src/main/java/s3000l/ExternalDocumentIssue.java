/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:19 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class ExternalDocumentIssue extends EcRemoteLinkedData {

    protected DocumentIssueIdentifier docIssId;
    protected DocumentIssueDate issDate;
    protected ConditionInstance.Rmks rmks;
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

	public ExternalDocumentIssue() {
		super("http://www.asd-europe.org/s-series/s3000l", "ExternalDocumentIssue");
	}

}