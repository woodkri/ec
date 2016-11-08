package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/FireStation
 * A fire station. With firemen.
 * @author schema.org
 * @class FireStation
 * @module org.schema
 * @extends EmergencyService
 */
public class FireStation extends EmergencyService
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public FireStation()
	{
		context="http://schema.org/";
		type="FireStation";
	}

}