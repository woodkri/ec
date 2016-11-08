package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/OrganizationRole
 * A subclass of Role used to describe roles within organizations.
 * @author schema.org
 * @class OrganizationRole
 * @module org.schema
 * @extends Role
 */
public class OrganizationRole extends Role
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public OrganizationRole()
	{
		context="http://schema.org/";
		type="OrganizationRole";
	}

	/**
	 * Schema.org/numberedPosition
	 * A number associated with a role in an organization, for example, the number on an athlete's jersey.
	 * @property numberedPosition
	 * @type Number
	 */
	public Double numberedPosition;

}