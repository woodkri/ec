package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/GasStation
 * A gas station.
 * @author schema.org
 * @class GasStation
 * @module org.schema
 * @extends AutomotiveBusiness
 */
public class GasStation extends AutomotiveBusiness
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public GasStation()
	{
		context="http://schema.org/";
		type="GasStation";
	}

}