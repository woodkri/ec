package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/ScholarlyArticle
 * A scholarly article.
 * @author schema.org
 * @class ScholarlyArticle
 * @module org.schema
 * @extends Article
 */
public class ScholarlyArticle extends Article
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public ScholarlyArticle()
	{
		context="http://schema.org/";
		type="ScholarlyArticle";
	}

}