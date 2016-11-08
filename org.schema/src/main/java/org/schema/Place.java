package org.schema;

import org.stjs.javascript.Date;
import org.cassproject.schema.general.EcRemoteLinkedData;

/**
 * Schema.org/Place
 * Entities that have a somewhat fixed, physical extension.
 * @author schema.org
 * @class Place
 * @module org.schema
 * @extends Thing
 */
public class Place extends Thing
{
	/**
	 * Constructor, automatically sets @context and @type.
	 * @constructor
	 */
	public Place()
	{
		context="http://schema.org/";
		type="Place";
	}

	/**
	 * Schema.org/reviews
	 * Review of the item.
	 * @property reviews
	 * @type Review
	 */
	public Review reviews;

	/**
	 * Schema.org/amenityFeature
	 * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
	 * @property amenityFeature
	 * @type LocationFeatureSpecification
	 */
	public LocationFeatureSpecification amenityFeature;

	/**
	 * Schema.org/additionalProperty
	 * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.\n\nNote: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.

	 * @property additionalProperty
	 * @type PropertyValue
	 */
	public PropertyValue additionalProperty;

	/**
	 * Schema.org/isicV4
	 * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
	 * @property isicV4
	 * @type Text
	 */
	public String isicV4;

	/**
	 * Schema.org/events
	 * Upcoming or past events associated with this place or organization.
	 * @property events
	 * @type Event
	 */
	public Event events;

	/**
	 * Schema.org/containsPlace
	 * The basic containment relation between a place and another that it contains.
	 * @property containsPlace
	 * @type Place
	 */
	public Place containsPlace;

	/**
	 * Schema.org/event
	 * Upcoming or past event associated with this place, organization, or action.
	 * @property event
	 * @type Event
	 */
	public Event event;

	/**
	 * Schema.org/maps
	 * A URL to a map of the place.
	 * @property maps
	 * @type URL
	 */
	public String maps;

	/**
	 * Schema.org/containedIn
	 * The basic containment relation between a place and one that contains it.
	 * @property containedIn
	 * @type Place
	 */
	public Place containedIn;

	/**
	 * Schema.org/review
	 * A review of the item.
	 * @property review
	 * @type Review
	 */
	public Review review;

	/**
	 * Schema.org/containedInPlace
	 * The basic containment relation between a place and one that contains it.
	 * @property containedInPlace
	 * @type Place
	 */
	public Place containedInPlace;

	/**
	 * Schema.org/photo
	 * A photograph of this place.
	 * @property photo
	 * @type schema,ImageObject | schema,Photograph
	 */
	public Object photo;

	/**
	 * Schema.org/address
	 * Physical address of the item.
	 * @property address
	 * @type schema,PostalAddress | schema,Text
	 */
	public Object address;

	/**
	 * Schema.org/geo
	 * The geo coordinates of the place.
	 * @property geo
	 * @type schema,GeoShape | schema,GeoCoordinates
	 */
	public Object geo;

	/**
	 * Schema.org/openingHoursSpecification
	 * The opening hours of a certain place.
	 * @property openingHoursSpecification
	 * @type OpeningHoursSpecification
	 */
	public OpeningHoursSpecification openingHoursSpecification;

	/**
	 * Schema.org/photos
	 * Photographs of this place.
	 * @property photos
	 * @type schema,ImageObject | schema,Photograph
	 */
	public Object photos;

	/**
	 * Schema.org/map
	 * A URL to a map of the place.
	 * @property map
	 * @type URL
	 */
	public String map;

	/**
	 * Schema.org/hasMap
	 * A URL to a map of the place.
	 * @property hasMap
	 * @type schema,Map | schema,URL
	 */
	public Object hasMap;

	/**
	 * Schema.org/faxNumber
	 * The fax number.
	 * @property faxNumber
	 * @type Text
	 */
	public String faxNumber;

	/**
	 * Schema.org/smokingAllowed
	 * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
	 * @property smokingAllowed
	 * @type Boolean
	 */
	public Boolean smokingAllowed;

	/**
	 * Schema.org/telephone
	 * The telephone number.
	 * @property telephone
	 * @type Text
	 */
	public String telephone;

	/**
	 * Schema.org/aggregateRating
	 * The overall rating, based on a collection of reviews or ratings, of the item.
	 * @property aggregateRating
	 * @type AggregateRating
	 */
	public AggregateRating aggregateRating;

	/**
	 * Schema.org/specialOpeningHoursSpecification
	 * The special opening hours of a certain place.\n\nUse this to explicitly override general opening hours brought in scope by [[openingHoursSpecification]] or [[openingHours]].
      
	 * @property specialOpeningHoursSpecification
	 * @type OpeningHoursSpecification
	 */
	public OpeningHoursSpecification specialOpeningHoursSpecification;

	/**
	 * Schema.org/branchCode
	 * A short textual code (also called "store code") that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.\n\nFor example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code "3047" is a branchCode for a particular branch.
      
	 * @property branchCode
	 * @type Text
	 */
	public String branchCode;

	/**
	 * Schema.org/logo
	 * An associated logo.
	 * @property logo
	 * @type schema,ImageObject | schema,URL
	 */
	public Object logo;

	/**
	 * Schema.org/globalLocationNumber
	 * The [Global Location Number](http://www.gs1.org/gln) (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
	 * @property globalLocationNumber
	 * @type Text
	 */
	public String globalLocationNumber;

}