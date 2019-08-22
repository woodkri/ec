/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Aug 22 12:47:53 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class ContractedProductVariantAtOperatingLocationType extends EcRemoteLinkedData {

    protected QuantityOfProductVariantAtOperatingLocationType qty;
    protected OperatingRequirementAtOperatingLocationType opReq;
    protected OperatingLocationTypeReference theaterOfOp;
    protected s3000l.ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public QuantityOfProductVariantAtOperatingLocationType getQty() {
        return qty;
    }

    public void setQty(QuantityOfProductVariantAtOperatingLocationType value) {
        this.qty = value;
    }

    public OperatingRequirementAtOperatingLocationType getOpReq() {
        return opReq;
    }

    public void setOpReq(OperatingRequirementAtOperatingLocationType value) {
        this.opReq = value;
    }

    public OperatingLocationTypeReference getTheaterOfOp() {
        return theaterOfOp;
    }

    public void setTheaterOfOp(OperatingLocationTypeReference value) {
        this.theaterOfOp = value;
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

	public ContractedProductVariantAtOperatingLocationType() {
		super("http://www.asd-europe.org/s-series/s3000l", "ContractedProductVariantAtOperatingLocationType");
	}

}
