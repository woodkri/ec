package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/DrinkAction
 * The act of swallowing liquids.
 * @author schema.org
 * @module schema.org
 * @class DrinkAction
 * @extends ConsumeAction
 */
public class DrinkAction extends ConsumeAction
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public DrinkAction()
	{
		context="http://schema.org/";
		type="DrinkAction";
	}

}