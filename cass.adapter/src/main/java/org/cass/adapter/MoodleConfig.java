package org.cass.adapter;

import com.eduworks.ec.remote.EcRemote;
import com.eduworks.ec.remote.FormData;
import org.cassproject.ebac.identity.EcIdentityManager;
import org.json.ld.EcLinkedData;
import org.stjs.javascript.Global;
import org.stjs.javascript.functions.Callback1;

/**
 * Object that holds the Moodle Adapter configuration values returned 
 * from the server and provides methods for saving new config values 
 * 
 * @module org.cassproject
 * @class MoodleConfig
 * @constructor
 * 
 * @author devlin.junker@eduworks.com
 *
 */
public class MoodleConfig extends EcLinkedData {

	public boolean enabled;
	
	public String moodleEndpoint;
	public String moodleToken;
	
	public MoodleConfig() {
		super(null, null);
	}
	
	/**
	 * Saves this config Objects configuration values to the server specified
	 * 
	 * @memberOf MoodleConfig
	 * @method save
	 * @param {String} serverUrl
	 * 			URL of server to save configuration values to
	 * @param {Callback1<Object>} success
	 * 			Callback triggered on successfully saving config values to server
	 * @param {Callback1<String>} failure
	 * 			Callback triggered if an error occurs while saving the config values
	 */
	public void save(final String serverUrl, final Callback1<Object> success, final Callback1<String> failure){
		final FormData fd = new FormData();
		fd.append("config", Global.JSON.stringify(this));
		EcIdentityManager.signatureSheetAsync(60000, serverUrl, new Callback1<String>()
		{
			@Override
			public void $invoke(String signatureSheet)
			{
				fd.append("signatureSheet", signatureSheet);
				EcRemote.postExpectingObject(serverUrl, "adapter/moodle/config/set", fd, success, failure);
			}
		});
	}
	
	/**
	 * Retrieves the Moodle adapter configuration values from the server
	 * 
	 * @memberOf MoodleConfig
	 * @method get
	 * @static
	 * @param {String} serverUrl
	 * 			URL of server to save configuration values to
	 * @param {Callback1<Object>} success
	 * 			Callback triggered on successfully retrieving config values to server
	 * @param {Callback1<String>} failure
	 * 			Callback triggered if an error occurs while getting the config values
	 */
	public static void get(final String serverUrl, final Callback1<Object> success, final Callback1<String> failure){
		final FormData fd = new FormData();
		EcIdentityManager.signatureSheetAsync(60000, serverUrl,new Callback1<String>()
		{
			@Override
			public void $invoke(String signatureSheet)
			{
				fd.append("signatureSheet", signatureSheet);
				EcRemote.postExpectingObject(serverUrl, "adapter/moodle/config/get", fd, success, failure);
			}
		});
	}
	
	
	/**
	 * Retrieves the Moodle adapter Encryption Key from the server to share frameworks with
	 * 
	 * @memberOf MoodleConfig
	 * @method get
	 * @static
	 * @param {String} serverUrl
	 * 			URL of server to save configuration values to
	 * @param {Callback1<String>} success
	 * 			Callback triggered on successfully retrieving config values to server
	 * @param {Callback1<String>} failure
	 * 			Callback triggered if an error occurs while getting the config values
	 */
	public static void getMoodleKey(final String serverUrl, final Callback1<String> success, final Callback1<String> failure){
		final FormData fd = new FormData();
		EcIdentityManager.signatureSheetAsync(60000, serverUrl,new Callback1<String>()
		{
			@Override
			public void $invoke(String signatureSheet)
			{
				fd.append("signatureSheet", signatureSheet);
				EcRemote.postExpectingString(serverUrl, "adapter/moodle/config/key", fd, success, failure);
			}
		});
	}
	
	
	public static void syncCassToMoodle(final String serverUrl, Callback1<String> success, final Callback1<String> failure){
		EcRemote.postExpectingString(serverUrl, "moodle/cassToMoodle", new FormData(), success, failure);
	}
	
	public static void syncMoodleToCass(final String serverUrl, Callback1<String> success, final Callback1<String> failure){
		EcRemote.postExpectingString(serverUrl, "moodle/moodleToCass", new FormData(), success, failure);
	}

}
