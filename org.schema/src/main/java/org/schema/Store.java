package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/Store
 * A retail good store.
 * @author schema.org
 * @class Store
 * @module org.schema
 * @extends LocalBusiness
 */
public class Store extends LocalBusiness
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public Store()
	{
		context="http://schema.org/";
		type="Store";
	}

}