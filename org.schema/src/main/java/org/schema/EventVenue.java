package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/EventVenue
 * An event venue.
 * @author schema.org
 * @class EventVenue
 * @module org.schema
 * @extends CivicStructure
 */
public class EventVenue extends CivicStructure
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public EventVenue()
	{
		context="http://schema.org/";
		type="EventVenue";
	}

}