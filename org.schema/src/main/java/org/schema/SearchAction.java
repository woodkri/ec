package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/SearchAction
 * The act of searching for an object.\n\nRelated actions:\n\n* [[FindAction]]: SearchAction generally leads to a FindAction, but not necessarily.
 * @author schema.org
 * @module schema.org
 * @class SearchAction
 * @extends Action
 */
public class SearchAction extends Action
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public SearchAction()
	{
		context="http://schema.org/";
		type="SearchAction";
	}

	/**
	 * Schema.org/query
	 * A sub property of instrument. The query used on this action.
	 * @property query
	 * @type Text
	 */
	public String query;

}