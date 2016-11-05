package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/Continent
 * One of the continents (for example, Europe or Africa).
 * @author schema.org
 * @module schema.org
 * @class Continent
 * @extends Landform
 */
public class Continent extends Landform
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public Continent()
	{
		context="http://schema.org/";
		type="Continent";
	}

}