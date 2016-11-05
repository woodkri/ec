package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/LikeAction
 * The act of expressing a positive sentiment about the object. An agent likes an object (a proposition, topic or theme) with participants.
 * @author schema.org
 * @module schema.org
 * @class LikeAction
 * @extends ReactAction
 */
public class LikeAction extends ReactAction
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public LikeAction()
	{
		context="http://schema.org/";
		type="LikeAction";
	}

}