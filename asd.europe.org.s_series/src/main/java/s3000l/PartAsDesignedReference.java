/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class PartAsDesignedReference extends EcRemoteLinkedData {

    protected PartIdentifier partId;
    protected Object uidRef;

    public PartIdentifier getPartId() {
        return partId;
    }

    public void setPartId(PartIdentifier value) {
        this.partId = value;
    }

    public Object getUidRef() {
        return uidRef;
    }

    public void setUidRef(Object value) {
        this.uidRef = value;
    }

	public PartAsDesignedReference() {
		super("http://www.asd-europe.org/s-series/s3000l", "PartAsDesignedReference");
	}

}
