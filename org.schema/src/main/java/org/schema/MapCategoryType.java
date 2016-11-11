package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/MapCategoryType
 * An enumeration of several kinds of Map.
 * @author schema.org
 * @class MapCategoryType
 * @module org.schema
 * @extends Enumeration
 */
public class MapCategoryType extends Enumeration
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public MapCategoryType()
	{
		context="http://schema.org/";
		type="MapCategoryType";
	}

}