package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/CheckInAction
 * The act of an agent communicating (service provider, social media, etc) their arrival by registering/confirming for a previously reserved service (e.g. flight check in) or at a place (e.g. hotel), possibly resulting in a result (boarding pass, etc).\n\nRelated actions:\n\n* [[CheckOutAction]]: The antonym of CheckInAction.\n* [[ArriveAction]]: Unlike ArriveAction, CheckInAction implies that the agent is informing/confirming the start of a previously reserved service.\n* [[ConfirmAction]]: Unlike ConfirmAction, CheckInAction implies that the agent is informing/confirming the *start* of a previously reserved service rather than its validity/existence.
 * @author schema.org
 * @class CheckInAction
 * @module org.schema
 * @extends CommunicateAction
 */
public class CheckInAction extends CommunicateAction
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public CheckInAction()
	{
		context="http://schema.org/";
		type="CheckInAction";
	}

}