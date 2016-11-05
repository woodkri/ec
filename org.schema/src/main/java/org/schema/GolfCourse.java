package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/GolfCourse
 * A golf course.
 * @author schema.org
 * @module schema.org
 * @class GolfCourse
 * @extends SportsActivityLocation
 */
public class GolfCourse extends SportsActivityLocation
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public GolfCourse()
	{
		context="http://schema.org/";
		type="GolfCourse";
	}

}