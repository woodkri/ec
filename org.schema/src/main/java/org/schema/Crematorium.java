package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/Crematorium
 * A crematorium.
 * @author schema.org
 * @class Crematorium
 * @module org.schema
 * @extends CivicStructure
 */
public class Crematorium extends CivicStructure
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public Crematorium()
	{
		context="http://schema.org/";
		type="Crematorium";
	}

}