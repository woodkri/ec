/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:22 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Date;

public class SubstanceCharacteristicsRecordingDate extends EcRemoteLinkedData {

    protected Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date value) {
        this.date = value;
    }

	public SubstanceCharacteristicsRecordingDate() {
		super("http://www.asd-europe.org/s-series/s3000l", "SubstanceCharacteristicsRecordingDate");
	}

}