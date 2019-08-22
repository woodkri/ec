/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Aug 22 12:47:54 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class OrderedSubtaskCircuitBreakerSettings extends EcRemoteLinkedData {

    protected Array<s3000l.RandomSubtaskCircuitBreakerSettings.Cb> cb;
    protected SubtaskCircuitBreakerSettingsTimeline precCb;
    protected s3000l.ProductName.Applic applic;
    protected String uid;
    protected CrudCodeValues crud;

    public Array<s3000l.RandomSubtaskCircuitBreakerSettings.Cb> getCb() {
        if (cb == null) {
            cb = new Array<s3000l.RandomSubtaskCircuitBreakerSettings.Cb>();
        }
        return this.cb;
    }

    public SubtaskCircuitBreakerSettingsTimeline getPrecCb() {
        return precCb;
    }

    public void setPrecCb(SubtaskCircuitBreakerSettingsTimeline value) {
        this.precCb = value;
    }

    public s3000l.ProductName.Applic getApplic() {
        return applic;
    }

    public void setApplic(s3000l.ProductName.Applic value) {
        this.applic = value;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String value) {
        this.uid = value;
    }

    public CrudCodeValues getCrud() {
        if (crud == null) {
            return CrudCodeValues.I;
        } else {
            return crud;
        }
    }

    public void setCrud(CrudCodeValues value) {
        this.crud = value;
    }

	public OrderedSubtaskCircuitBreakerSettings() {
		super("http://www.asd-europe.org/s-series/s3000l", "OrderedSubtaskCircuitBreakerSettings");
	}

}
