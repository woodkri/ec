package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/AutoWash
 * A car wash business.
 * @author schema.org
 * @module schema.org
 * @class AutoWash
 * @extends AutomotiveBusiness
 */
public class AutoWash extends AutomotiveBusiness
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public AutoWash()
	{
		context="http://schema.org/";
		type="AutoWash";
	}

}