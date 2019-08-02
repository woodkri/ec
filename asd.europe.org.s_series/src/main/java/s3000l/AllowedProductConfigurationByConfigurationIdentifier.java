/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:18 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class AllowedProductConfigurationByConfigurationIdentifier extends EcRemoteLinkedData {

    protected AllowedProductConfigurationIdentifier prodConfId;
    protected AuthorityToOperate authToOp;
    protected Array<NestedAllowedProductConfigurationRelationship> nestedPC;
    protected DownTime.OrgInfos orgInfos;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public AllowedProductConfigurationIdentifier getProdConfId() {
        return prodConfId;
    }

    public void setProdConfId(AllowedProductConfigurationIdentifier value) {
        this.prodConfId = value;
    }

    public AuthorityToOperate getAuthToOp() {
        return authToOp;
    }

    public void setAuthToOp(AuthorityToOperate value) {
        this.authToOp = value;
    }

    public Array<NestedAllowedProductConfigurationRelationship> getNestedPC() {
        if (nestedPC == null) {
            nestedPC = new Array<NestedAllowedProductConfigurationRelationship>();
        }
        return this.nestedPC;
    }

    public DownTime.OrgInfos getOrgInfos() {
        return orgInfos;
    }

    public void setOrgInfos(DownTime.OrgInfos value) {
        this.orgInfos = value;
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

	public AllowedProductConfigurationByConfigurationIdentifier() {
		super("http://www.asd-europe.org/s-series/s3000l", "AllowedProductConfigurationByConfigurationIdentifier");
	}

}
