/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:21 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class OrderedSubtaskCircuitBreakerSettings extends EcRemoteLinkedData {

    protected Array<s6000t.taskTrainAnalysis.RandomSubtaskCircuitBreakerSettings.Cb> cb;
    protected SubtaskCircuitBreakerSettingsTimeline precCb;
    protected s6000t.taskTrainAnalysis.ProductName.Applic applic;
    protected String uid;
    protected CrudCodeValues crud;

    public Array<s6000t.taskTrainAnalysis.RandomSubtaskCircuitBreakerSettings.Cb> getCb() {
        if (cb == null) {
            cb = new Array<s6000t.taskTrainAnalysis.RandomSubtaskCircuitBreakerSettings.Cb>();
        }
        return this.cb;
    }

    public SubtaskCircuitBreakerSettingsTimeline getPrecCb() {
        return precCb;
    }

    public void setPrecCb(SubtaskCircuitBreakerSettingsTimeline value) {
        this.precCb = value;
    }

    public s6000t.taskTrainAnalysis.ProductName.Applic getApplic() {
        return applic;
    }

    public void setApplic(s6000t.taskTrainAnalysis.ProductName.Applic value) {
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
		super("http://asd-europe.org/", "OrderedSubtaskCircuitBreakerSettings");
	}

}
