/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Aug 22 12:47:52 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class AllowedProductConfigurationByConfigurationIdentifierReference extends EcRemoteLinkedData {

    protected ProductIdentifier prodId;
    protected ProductVariantIdentifier prodVarId;
    protected AllowedProductConfigurationIdentifier prodConfId;
    protected Object uidRef;

    public ProductIdentifier getProdId() {
        return prodId;
    }

    public void setProdId(ProductIdentifier value) {
        this.prodId = value;
    }

    public ProductVariantIdentifier getProdVarId() {
        return prodVarId;
    }

    public void setProdVarId(ProductVariantIdentifier value) {
        this.prodVarId = value;
    }

    public AllowedProductConfigurationIdentifier getProdConfId() {
        return prodConfId;
    }

    public void setProdConfId(AllowedProductConfigurationIdentifier value) {
        this.prodConfId = value;
    }

    public Object getUidRef() {
        return uidRef;
    }

    public void setUidRef(Object value) {
        this.uidRef = value;
    }

	public AllowedProductConfigurationByConfigurationIdentifierReference() {
		super("http://www.asd-europe.org/s-series/s3000l", "AllowedProductConfigurationByConfigurationIdentifierReference");
	}

}
