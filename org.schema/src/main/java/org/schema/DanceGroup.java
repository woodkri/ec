package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/DanceGroup
 * A dance group&#x2014;for example, the Alvin Ailey Dance Theater or Riverdance.
 * @author schema.org
 * @module schema.org
 * @class DanceGroup
 * @extends PerformingGroup
 */
public class DanceGroup extends PerformingGroup
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public DanceGroup()
	{
		context="http://schema.org/";
		type="DanceGroup";
	}

}