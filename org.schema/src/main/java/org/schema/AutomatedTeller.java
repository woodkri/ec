package org.schema;

/**
 * Schema.org/AutomatedTeller
 * ATM/cash machine.
 *
 * @author schema.org
 * @class AutomatedTeller
 * @module org.schema
 * @extends FinancialService
 */
public class AutomatedTeller extends FinancialService {
	/**
	 * Constructor, automatically sets @context and @type.
	 *
	 * @constructor
	 */
	public AutomatedTeller() {
		context = "http://schema.org/";
		type = "AutomatedTeller";
	}

}