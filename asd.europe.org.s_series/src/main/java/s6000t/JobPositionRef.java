/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Aug 22 12:47:53 CDT 2019
 *
 **/

package s6000t;

import org.cassproject.schema.general.EcRemoteLinkedData;
import s6000t.JobPositionName;

public class JobPositionRef extends EcRemoteLinkedData {

    protected JobPositionName jobPosName;
    protected Object uidRef;
    protected String uriRef;

    public JobPositionName getJobPosName() {
        return jobPosName;
    }

    public void setJobPosName(JobPositionName value) {
        this.jobPosName = value;
    }

    public Object getUidRef() {
        return uidRef;
    }

    public void setUidRef(Object value) {
        this.uidRef = value;
    }

    public String getUriRef() {
        return uriRef;
    }

    public void setUriRef(String value) {
        this.uriRef = value;
    }

	public JobPositionRef() {
		super("http://www.asd-europe.org/s-series/s6000t", "JobPositionRef");
	}

}
