/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:19 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class CircuitBreakerReference extends EcRemoteLinkedData {

    protected CircuitBreakerIdentifier cbId;
    protected Object uidRef;

    public CircuitBreakerIdentifier getCbId() {
        return cbId;
    }

    public void setCbId(CircuitBreakerIdentifier value) {
        this.cbId = value;
    }

    public Object getUidRef() {
        return uidRef;
    }

    public void setUidRef(Object value) {
        this.uidRef = value;
    }

	public CircuitBreakerReference() {
		super("http://www.asd-europe.org/s-series/s3000l", "CircuitBreakerReference");
	}

}
