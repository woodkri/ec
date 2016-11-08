package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/FinancialService
 * Financial services business.
 * @author schema.org
 * @class FinancialService
 * @module org.schema
 * @extends LocalBusiness
 */
public class FinancialService extends LocalBusiness
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public FinancialService()
	{
		context="http://schema.org/";
		type="FinancialService";
	}

	/**
	 * Schema.org/feesAndCommissionsSpecification
	 * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
	 * @property feesAndCommissionsSpecification
	 * @type schema,URL | schema,Text
	 */
	public Object feesAndCommissionsSpecification;

}