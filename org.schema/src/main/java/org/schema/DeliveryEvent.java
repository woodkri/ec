package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/DeliveryEvent
 * An event involving the delivery of an item.
 * @author schema.org
 * @module schema.org
 * @class DeliveryEvent
 * @extends Event
 */
public class DeliveryEvent extends Event
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public DeliveryEvent()
	{
		context="http://schema.org/";
		type="DeliveryEvent";
	}

	/**
	 * Schema.org/accessCode
	 * Password, PIN, or access code needed for delivery (e.g. from a locker).
	 * @property accessCode
	 * @type Text
	 */
	public String accessCode;

	/**
	 * Schema.org/availableThrough
	 * After this date, the item will no longer be available for pickup.
	 * @property availableThrough
	 * @type DateTime
	 */
	public String availableThrough;

	/**
	 * Schema.org/availableFrom
	 * When the item is available for pickup from the store, locker, etc.
	 * @property availableFrom
	 * @type DateTime
	 */
	public String availableFrom;

	/**
	 * Schema.org/hasDeliveryMethod
	 * Method used for delivery or shipping.
	 * @property hasDeliveryMethod
	 * @type DeliveryMethod
	 */
	public DeliveryMethod hasDeliveryMethod;

}