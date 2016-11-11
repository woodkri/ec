package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/WriteAction
 * The act of authoring written creative content.
 * @author schema.org
 * @class WriteAction
 * @module org.schema
 * @extends CreateAction
 */
public class WriteAction extends CreateAction
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public WriteAction()
	{
		context="http://schema.org/";
		type="WriteAction";
	}

	/**
	 * Schema.org/language
	 * A sub property of instrument. The language used on this action.
	 * @property language
	 * @type Language
	 */
	public Language language;

	/**
	 * Schema.org/inLanguage
	 * The language of the content or performance or used in an action. Please use one of the language codes from the [IETF BCP 47 standard](http://tools.ietf.org/html/bcp47). See also [[availableLanguage]].
	 * @property inLanguage
	 * @type schema,Language | schema,Text
	 */
	public Object inLanguage;

}