package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/ScheduleAction
 * Scheduling future actions, events, or tasks.\n\nRelated actions:\n\n* [[ReserveAction]]: Unlike ReserveAction, ScheduleAction allocates future actions (e.g. an event, a task, etc) towards a time slot / spatial allocation.
 * @author schema.org
 * @module schema.org
 * @class ScheduleAction
 * @extends PlanAction
 */
public class ScheduleAction extends PlanAction
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public ScheduleAction()
	{
		context="http://schema.org/";
		type="ScheduleAction";
	}

}