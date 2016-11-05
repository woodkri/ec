package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/GamePlayMode
 * Indicates whether this game is multi-player, co-op or single-player.
 * @author schema.org
 * @module schema.org
 * @class GamePlayMode
 * @extends Enumeration
 */
public class GamePlayMode extends Enumeration
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public GamePlayMode()
	{
		context="http://schema.org/";
		type="GamePlayMode";
	}

}