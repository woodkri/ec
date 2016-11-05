package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/SingleFamilyResidence
 * Residence type: Single-family home.
 * @author schema.org
 * @module schema.org
 * @class SingleFamilyResidence
 * @extends House
 */
public class SingleFamilyResidence extends House
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public SingleFamilyResidence()
	{
		context="http://schema.org/";
		type="SingleFamilyResidence";
	}

	/**
	 * Schema.org/numberOfRooms
	 * The number of rooms (excluding bathrooms and closets) of the acccommodation or lodging business.
Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue.
	 * @property numberOfRooms
	 * @type schema,QuantitativeValue | schema,Number	 */
	public Object numberOfRooms;

	/**
	 * Schema.org/occupancy
	 * The allowed total occupancy for the accommodation in persons (including infants etc). For individual accommodations, this is not necessarily the legal maximum but defines the permitted usage as per the contractual agreement (e.g. a double room used by a single person).
Typical unit code(s): C62 for person
	 * @property occupancy
	 * @type QuantitativeValue
	 */
	public QuantitativeValue occupancy;

}