/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Aug 22 12:47:53 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class FailureModeReference extends EcRemoteLinkedData {

    protected FailureModeIdentifier fmId;
    protected Object uidRef;

    public FailureModeIdentifier getFmId() {
        return fmId;
    }

    public void setFmId(FailureModeIdentifier value) {
        this.fmId = value;
    }

    public Object getUidRef() {
        return uidRef;
    }

    public void setUidRef(Object value) {
        this.uidRef = value;
    }

	public FailureModeReference() {
		super("http://www.asd-europe.org/s-series/s3000l", "FailureModeReference");
	}

}
