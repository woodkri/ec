/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Aug 22 12:47:53 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class ContractReference extends EcRemoteLinkedData {

    protected ContractIdentifier contrId;
    protected Object uidRef;

    public ContractIdentifier getContrId() {
        return contrId;
    }

    public void setContrId(ContractIdentifier value) {
        this.contrId = value;
    }

    public Object getUidRef() {
        return uidRef;
    }

    public void setUidRef(Object value) {
        this.uidRef = value;
    }

	public ContractReference() {
		super("http://www.asd-europe.org/s-series/s3000l", "ContractReference");
	}

}
