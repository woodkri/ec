package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/RoofingContractor
 * A roofing contractor.
 * @author schema.org
 * @module schema.org
 * @class RoofingContractor
 * @extends HomeAndConstructionBusiness
 */
public class RoofingContractor extends HomeAndConstructionBusiness
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public RoofingContractor()
	{
		context="http://schema.org/";
		type="RoofingContractor";
	}

}