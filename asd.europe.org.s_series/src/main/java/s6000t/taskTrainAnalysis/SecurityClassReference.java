/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class SecurityClassReference extends EcRemoteLinkedData {

    protected SecurityClass scc;
    protected Object uidRef;

    public SecurityClass getScc() {
        return scc;
    }

    public void setScc(SecurityClass value) {
        this.scc = value;
    }

    public Object getUidRef() {
        return uidRef;
    }

    public void setUidRef(Object value) {
        this.uidRef = value;
    }

	public SecurityClassReference() {
		super("http://asd-europe.org/", "SecurityClassReference");
	}

}
