package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/ElectronicsStore
 * An electronics store.
 * @author schema.org
 * @class ElectronicsStore
 * @module org.schema
 * @extends Store
 */
public class ElectronicsStore extends Store
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public ElectronicsStore()
	{
		context="http://schema.org/";
		type="ElectronicsStore";
	}

}