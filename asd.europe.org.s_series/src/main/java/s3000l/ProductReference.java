/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class ProductReference extends EcRemoteLinkedData {

    protected ProductIdentifier prodId;
    protected Object uidRef;

    public ProductIdentifier getProdId() {
        return prodId;
    }

    public void setProdId(ProductIdentifier value) {
        this.prodId = value;
    }

    public Object getUidRef() {
        return uidRef;
    }

    public void setUidRef(Object value) {
        this.uidRef = value;
    }

	public ProductReference() {
		super("http://www.asd-europe.org/s-series/s3000l", "ProductReference");
	}

}
