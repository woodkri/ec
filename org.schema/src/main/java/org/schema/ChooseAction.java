package org.schema;

/**
 * Schema.org/ChooseAction
 * The act of expressing a preference from a set of options or a large or unbounded set of choices/options.
 * @author schema.org
 * @class ChooseAction
 * @module org.schema
 * @extends AssessAction
 */
public class ChooseAction extends AssessAction
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public ChooseAction()
	{
		context="http://schema.org/";
		type="ChooseAction";
	}

	/**
	 * Schema.org/actionOption
	 * A sub property of object. The options subject to this action.
	 * @property actionOption
	 * @type schema,Text | schema,Thing
	 */
	public Object actionOption;

	/**
	 * Schema.org/option
	 * A sub property of object. The options subject to this action.
	 * @property option
	 * @type schema,Text | schema,Thing
	 */
	public Object option;

}