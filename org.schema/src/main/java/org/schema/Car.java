package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/Car
 * A car is a wheeled, self-powered motor vehicle used for transportation.
 * @author schema.org
 * @module schema.org
 * @class Car
 * @extends Vehicle
 */
public class Car extends Vehicle
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public Car()
	{
		context="http://schema.org/";
		type="Car";
	}

}