package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/Pharmacy
 * A pharmacy or drugstore.
 * @author schema.org
 * @module schema.org
 * @class Pharmacy
 * @extends MedicalOrganization
 */
public class Pharmacy extends MedicalOrganization
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public Pharmacy()
	{
		context="http://schema.org/";
		type="Pharmacy";
	}

}