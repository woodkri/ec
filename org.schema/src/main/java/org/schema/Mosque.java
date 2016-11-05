package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/Mosque
 * A mosque.
 * @author schema.org
 * @module schema.org
 * @class Mosque
 * @extends PlaceOfWorship
 */
public class Mosque extends PlaceOfWorship
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public Mosque()
	{
		context="http://schema.org/";
		type="Mosque";
	}

}