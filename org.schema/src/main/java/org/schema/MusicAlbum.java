package org.schema;

/**
 * Schema.org/MusicAlbum
 * A collection of music tracks.
 *
 * @author schema.org
 * @class MusicAlbum
 * @module org.schema
 * @extends MusicPlaylist
 */
public class MusicAlbum extends MusicPlaylist {
	/**
	 * Schema.org/albumProductionType
	 * Classification of the album by it's type of content: soundtrack, live album, studio album, etc.
	 *
	 * @property albumProductionType
	 * @type MusicAlbumProductionType
	 */
	public MusicAlbumProductionType albumProductionType;
	/**
	 * Schema.org/albumReleaseType
	 * The kind of release which this album is: single, EP or album.
	 *
	 * @property albumReleaseType
	 * @type MusicAlbumReleaseType
	 */
	public MusicAlbumReleaseType albumReleaseType;
	/**
	 * Schema.org/byArtist
	 * The artist that performed this album or recording.
	 *
	 * @property byArtist
	 * @type MusicGroup
	 */
	public MusicGroup byArtist;
	/**
	 * Schema.org/albumRelease
	 * A release of this album.
	 *
	 * @property albumRelease
	 * @type MusicRelease
	 */
	public MusicRelease albumRelease;

	/**
	 * Constructor, automatically sets @context and @type.
	 *
	 * @constructor
	 */
	public MusicAlbum() {
		context = "http://schema.org/";
		type = "MusicAlbum";
	}

}