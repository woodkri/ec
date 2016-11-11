package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/InvestmentOrDeposit
 * A type of financial product that typically requires the client to transfer funds to a financial service in return for potential beneficial financial return.
 * @author schema.org
 * @class InvestmentOrDeposit
 * @module org.schema
 * @extends FinancialProduct
 */
public class InvestmentOrDeposit extends FinancialProduct
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public InvestmentOrDeposit()
	{
		context="http://schema.org/";
		type="InvestmentOrDeposit";
	}

	/**
	 * Schema.org/amount
	 * The amount of money.
	 * @property amount
	 * @type schema,MonetaryAmount | schema,Number
	 */
	public Object amount;

}