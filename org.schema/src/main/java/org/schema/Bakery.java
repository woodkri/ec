package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/Bakery
 * A bakery.
 * @author schema.org
 * @module schema.org
 * @class Bakery
 * @extends FoodEstablishment
 */
public class Bakery extends FoodEstablishment
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public Bakery()
	{
		context="http://schema.org/";
		type="Bakery";
	}

}