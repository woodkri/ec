package org.schema;

/**
 * Schema.org/FlightReservation
 * A reservation for air travel.\n\nNote: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use [[Offer]].
 *
 * @author schema.org
 * @class FlightReservation
 * @module org.schema
 * @extends Reservation
 */
public class FlightReservation extends Reservation {
	/**
	 * Schema.org/passengerSequenceNumber
	 * The passenger's sequence number as assigned by the airline.
	 *
	 * @property passengerSequenceNumber
	 * @type Text
	 */
	public String passengerSequenceNumber;
	/**
	 * Schema.org/securityScreening
	 * The type of security screening the passenger is subject to.
	 *
	 * @property securityScreening
	 * @type Text
	 */
	public String securityScreening;
	/**
	 * Schema.org/passengerPriorityStatus
	 * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
	 *
	 * @property passengerPriorityStatus
	 * @type QualitativeValue
	 */
	public QualitativeValue passengerPriorityStatus;
	/**
	 * Schema.org/boardingGroup
	 * The airline-specific indicator of boarding order / preference.
	 *
	 * @property boardingGroup
	 * @type Text
	 */
	public String boardingGroup;

	/**
	 * Constructor, automatically sets @context and @type.
	 *
	 * @constructor
	 */
	public FlightReservation() {
		context = "http://schema.org/";
		type = "FlightReservation";
	}

}