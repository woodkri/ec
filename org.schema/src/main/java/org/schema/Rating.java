package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/Rating
 * A rating is an evaluation on a numeric scale, such as 1 to 5 stars.
 * @author schema.org
 * @module schema.org
 * @class Rating
 * @extends Intangible
 */
public class Rating extends Intangible
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public Rating()
	{
		context="http://schema.org/";
		type="Rating";
	}

	/**
	 * Schema.org/bestRating
	 * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
	 * @property bestRating
	 * @type schema,Text | schema,Number	 */
	public Object bestRating;

	/**
	 * Schema.org/ratingValue
	 * The rating for the content.
	 * @property ratingValue
	 * @type schema,Text | schema,Number	 */
	public Object ratingValue;

	/**
	 * Schema.org/worstRating
	 * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
	 * @property worstRating
	 * @type schema,Text | schema,Number	 */
	public Object worstRating;

	/**
	 * Schema.org/author
	 * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
	 * @property author
	 * @type schema,Organization | schema,Person	 */
	public Object author;

}