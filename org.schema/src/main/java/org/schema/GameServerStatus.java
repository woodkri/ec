package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/GameServerStatus
 * Status of a game server.
 * @author schema.org
 * @class GameServerStatus
 * @module org.schema
 * @extends Enumeration
 */
public class GameServerStatus extends Enumeration
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public GameServerStatus()
	{
		context="http://schema.org/";
		type="GameServerStatus";
	}

}