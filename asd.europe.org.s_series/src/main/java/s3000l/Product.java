/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class Product extends EcRemoteLinkedData {

    protected Array<ProductIdentifier> prodId;
    protected Array<ProductName> name;
    protected Array<ProductVariant> prodVar;
    protected ProductVariant.Bkdns bkdns;
    protected DownTime.OrgInfos orgInfos;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public Array<ProductIdentifier> getProdId() {
        if (prodId == null) {
            prodId = new Array<ProductIdentifier>();
        }
        return this.prodId;
    }

    public Array<ProductName> getName() {
        if (name == null) {
            name = new Array<ProductName>();
        }
        return this.name;
    }

    public Array<ProductVariant> getProdVar() {
        if (prodVar == null) {
            prodVar = new Array<ProductVariant>();
        }
        return this.prodVar;
    }

    public ProductVariant.Bkdns getBkdns() {
        return bkdns;
    }

    public void setBkdns(ProductVariant.Bkdns value) {
        this.bkdns = value;
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

	public Product() {
		super("http://www.asd-europe.org/s-series/s3000l", "Product");
	}

}
