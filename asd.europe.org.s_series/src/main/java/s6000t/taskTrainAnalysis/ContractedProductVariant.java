/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:19 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class ContractedProductVariant extends EcRemoteLinkedData {

    protected QuantityOfContractedProductVariant qty;
    protected Array<ContractedBlockOfSerializedItems> block;
    protected ProductVariantReference prodVarRef;
    protected Array<UserOfContractedProductVariant> user;
    protected Array<ContractedProductVariantAtOperatingLocationType> atOpLocType;
    protected Array<ContractedProductVariantAtOperatingLocation> atOpLoc;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Docs docs;
    protected s6000t.taskTrainAnalysis.ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public QuantityOfContractedProductVariant getQty() {
        return qty;
    }

    public void setQty(QuantityOfContractedProductVariant value) {
        this.qty = value;
    }

    public Array<ContractedBlockOfSerializedItems> getBlock() {
        if (block == null) {
            block = new Array<ContractedBlockOfSerializedItems>();
        }
        return this.block;
    }

    public ProductVariantReference getProdVarRef() {
        return prodVarRef;
    }

    public void setProdVarRef(ProductVariantReference value) {
        this.prodVarRef = value;
    }

    public Array<UserOfContractedProductVariant> getUser() {
        if (user == null) {
            user = new Array<UserOfContractedProductVariant>();
        }
        return this.user;
    }

    public Array<ContractedProductVariantAtOperatingLocationType> getAtOpLocType() {
        if (atOpLocType == null) {
            atOpLocType = new Array<ContractedProductVariantAtOperatingLocationType>();
        }
        return this.atOpLocType;
    }

    public Array<ContractedProductVariantAtOperatingLocation> getAtOpLoc() {
        if (atOpLoc == null) {
            atOpLoc = new Array<ContractedProductVariantAtOperatingLocation>();
        }
        return this.atOpLoc;
    }

    public s6000t.taskTrainAnalysis.ConditionInstance.Docs getDocs() {
        return docs;
    }

    public void setDocs(s6000t.taskTrainAnalysis.ConditionInstance.Docs value) {
        this.docs = value;
    }

    public s6000t.taskTrainAnalysis.ConditionInstance.Rmks getRmks() {
        return rmks;
    }

    public void setRmks(s6000t.taskTrainAnalysis.ConditionInstance.Rmks value) {
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

	public ContractedProductVariant() {
		super("http://asd-europe.org/", "ContractedProductVariant");
	}

}
