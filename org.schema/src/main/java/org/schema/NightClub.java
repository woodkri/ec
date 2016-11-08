package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/NightClub
 * A nightclub or discotheque.
 * @author schema.org
 * @class NightClub
 * @module org.schema
 * @extends EntertainmentBusiness
 */
public class NightClub extends EntertainmentBusiness
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public NightClub()
	{
		context="http://schema.org/";
		type="NightClub";
	}

}