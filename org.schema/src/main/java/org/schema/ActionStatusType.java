package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/ActionStatusType
 * The status of an Action.
 * @author schema.org
 * @class ActionStatusType
 * @module org.schema
 * @extends Enumeration
 */
public class ActionStatusType extends Enumeration
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public ActionStatusType()
	{
		context="http://schema.org/";
		type="ActionStatusType";
	}

}