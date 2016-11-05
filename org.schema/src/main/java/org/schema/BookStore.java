package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/BookStore
 * A bookstore.
 * @author schema.org
 * @module schema.org
 * @class BookStore
 * @extends Store
 */
public class BookStore extends Store
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public BookStore()
	{
		context="http://schema.org/";
		type="BookStore";
	}

}