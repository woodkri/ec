/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Sep 12 10:06:00 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class ApplicableSerialNumberRange extends EcRemoteLinkedData {

    protected String lowBound;
    protected String uppBound;

    public String getLowBound() {
        return lowBound;
    }

    public void setLowBound(String value) {
        this.lowBound = value;
    }

    public String getUppBound() {
        return uppBound;
    }

    public void setUppBound(String value) {
        this.uppBound = value;
    }

	public ApplicableSerialNumberRange() {
		super("http://www.asd-europe.org/s-series/s3000l", "ApplicableSerialNumberRange");
	}

}
