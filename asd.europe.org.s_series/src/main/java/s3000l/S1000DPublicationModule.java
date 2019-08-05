/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class S1000DPublicationModule extends EcRemoteLinkedData {

    protected PublicationModuleCode pmc;
    protected PublicationModuleTitle pmTitle;
    protected Array<S1000DPublicationModuleIssue> pmIss;
    protected DownTime.OrgInfos orgInfos;
    protected ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public PublicationModuleCode getPmc() {
        return pmc;
    }

    public void setPmc(PublicationModuleCode value) {
        this.pmc = value;
    }

    public PublicationModuleTitle getPmTitle() {
        return pmTitle;
    }

    public void setPmTitle(PublicationModuleTitle value) {
        this.pmTitle = value;
    }

    public Array<S1000DPublicationModuleIssue> getPmIss() {
        if (pmIss == null) {
            pmIss = new Array<S1000DPublicationModuleIssue>();
        }
        return this.pmIss;
    }

    public DownTime.OrgInfos getOrgInfos() {
        return orgInfos;
    }

    public void setOrgInfos(DownTime.OrgInfos value) {
        this.orgInfos = value;
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

	public S1000DPublicationModule() {
		super("http://www.asd-europe.org/s-series/s3000l", "S1000DPublicationModule");
	}

}