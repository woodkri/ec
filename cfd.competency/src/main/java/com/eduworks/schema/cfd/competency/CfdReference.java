package com.eduworks.schema.cfd.competency;

import org.cassproject.ebac.repository.EcEncryptedValue;
import org.cassproject.ebac.repository.EcRepository;
import org.cassproject.schema.general.EcRemoteLinkedData;
import org.schema.CreativeWork;
import org.stjs.javascript.Array;
import org.stjs.javascript.Global;
import org.stjs.javascript.JSCollections;
import org.stjs.javascript.JSObjectAdapter;
import org.stjs.javascript.functions.Callback1;

/**
 * Competency is Under construction.
 * <p>
 * Working model of competency with CFD Reference extension.
 *
 * @author debbie.brown@eduworks.com
 * @author devlin.junker@eduworks.com
 * @class CfdReference
 * @module com.eduworks
 * @extends org.schema.CreativeWork
 */
public class CfdReference extends CreativeWork {

	public static final String myType = "http://schema.org/CreativeWork";

	public static final String edUse = "Reference";

	public CfdReference() {
		super();
		educationalUse = edUse;
	}

	/**
	 * Retrieves the alignment specified with the ID from the server
	 *
	 * @param {String}                 id
	 *                                 ID of the alignment to retrieve
	 * @param {Callback1<EcAlignment>} success
	 *                                 Callback triggered on successfully retrieving the alignment,
	 *                                 returns the alignment
	 * @param {Callback1<String>}      [failure]
	 *                                 Callback triggered if error while retrieving alignment
	 * @memberOf CfdReference
	 * @method get
	 * @static
	 */
	public static void get(String id, final Callback1<CfdReference> success, final Callback1<String> failure) {
		EcRepository.get(id, new Callback1<EcRemoteLinkedData>() {
			@Override
			public void $invoke(EcRemoteLinkedData p1) {
				if (p1 instanceof CfdReference)
					if (success != null) {
						success.$invoke((CfdReference) p1);
						return;
					}

				CfdReference reference = new CfdReference();

				if (p1.isA(EcEncryptedValue.myType)) {
					EcEncryptedValue encrypted = new EcEncryptedValue();
					encrypted.copyFrom(p1);
					p1 = encrypted.decryptIntoObject();
				}
				if (p1.isAny(reference.getTypes())) {
					reference.copyFrom(p1);

					if (EcRepository.caching) {
						JSObjectAdapter.$put(EcRepository.cache, reference.shortId(), reference);
						JSObjectAdapter.$put(EcRepository.cache, reference.id, reference);
					}
					if (success != null)
						success.$invoke(reference);
				} else {
					String msg = "Resultant object is not a reference.";
					if (failure != null)
						failure.$invoke(msg);
					else
						Global.console.error(msg);
				}

			}
		}, failure);
	}

	/**
	 * Retrieves an alignment from it's server synchronously, the call
	 * blocks until it is successful or an error occurs
	 *
	 * @param {String} id
	 *                 ID of the alignment to retrieve
	 * @return EcAlignment
	 * The alignment retrieved
	 * @memberOf CfdReference
	 * @method getBlocking
	 * @static
	 */
	public static CfdReference getBlocking(String id) {
		EcRemoteLinkedData p1 = EcRepository.getBlocking(id);
		if (p1 instanceof CfdReference)
			return (CfdReference) p1;

		CfdReference reference = new CfdReference();

		if (p1.isA(EcEncryptedValue.myType)) {
			EcEncryptedValue encrypted = new EcEncryptedValue();
			encrypted.copyFrom(p1);
			p1 = encrypted.decryptIntoObject();

			EcEncryptedValue.encryptOnSave(p1.id, true);
		}
		if (p1.isAny(reference.getTypes())) {
			reference.copyFrom(p1);
			if (EcRepository.caching) {
				JSObjectAdapter.$put(EcRepository.cache, reference.shortId(), reference);
				JSObjectAdapter.$put(EcRepository.cache, reference.id, reference);
			}
			return reference;
		} else {
			String msg = "Retrieved object was not a reference";
			Global.console.error(msg);
			return null;
		}
	}

	/**
	 * Searches the repository using the query and optional parameters provided
	 *
	 * @param {EcRepository}                  repo
	 *                                        Repository to search using the query provided
	 * @param {String}                        query
	 *                                        The query to send to the search
	 * @param {Callback1<Array<EcAlignment>>} success
	 *                                        Callback triggered on successful search return
	 * @param {Callback1<String>}             [failure]
	 *                                        Callback triggered if error searching
	 * @param {Object}                        [paramObj]
	 *                                        Parameters to include in the search
	 * @param start
	 * @param size
	 * @memberOf CfdReference
	 * @method search
	 * @static
	 */
	public static void search(EcRepository repo, String query, final Callback1<Array<CfdReference>> success, Callback1<String> failure, Object paramObj) {
		String queryAdd = new CfdReference().getSearchStringByType();

		if (query == null || query == "")
			query = queryAdd;
		else
			query = "(" + query + ") AND educationalUse:\"" + edUse + "\" AND " + queryAdd;

		repo.searchWithParams(query, paramObj, null, new Callback1<Array<EcRemoteLinkedData>>() {

			@Override
			public void $invoke(Array<EcRemoteLinkedData> p1) {
				if (success != null) {
					Array<CfdReference> ret = JSCollections.$array();
					for (int i = 0; i < p1.$length(); i++) {
						CfdReference reference = new CfdReference();
						if (p1.$get(i).isAny(reference.getTypes())) {
							reference.copyFrom(p1.$get(i));
						} else if (p1.$get(i).isA(EcEncryptedValue.myType)) {
							EcEncryptedValue val = new EcEncryptedValue();
							val.copyFrom(p1.$get(i));
							if (val.isAnEncrypted(CfdReference.myType)) {
								EcRemoteLinkedData obj = val.decryptIntoObject();
								reference.copyFrom(obj);
							}
						}

						ret.$set(i, reference);
					}

					success.$invoke(ret);
				}
			}

		}, failure);
	}

	/**
	 * Searches the repository for references with the framework and optional parameters provided
	 *
	 * @param {EcRepository}                  repo
	 *                                        Repository to search using the query provided
	 * @param {String}                        Framework
	 *                                        The Framework to search for References with EducationalAlignments too
	 * @param {Callback1<Array<EcAlignment>>} success
	 *                                        Callback triggered on successful search return
	 * @param {Callback1<String>}             [failure]
	 *                                        Callback triggered if error searching
	 * @param {Object}                        [paramObj]
	 *                                        Parameters to include in the search
	 * @param start
	 * @param size
	 * @memberOf CfdReference
	 * @method search
	 * @static
	 */
	public static void searchWithFramework(EcRepository repo, String framework, final Callback1<Array<CfdReference>> success, Callback1<String> failure, Object paramObj) {
		String query = new CfdReference().getSearchStringByType();
		query = "(" + query + ") AND educationalUse:\"" + edUse + "\" AND educationalAlignment.educationalFramework:\"" + framework + "\"";

		repo.searchWithParams(query, paramObj, null, new Callback1<Array<EcRemoteLinkedData>>() {

			@Override
			public void $invoke(Array<EcRemoteLinkedData> p1) {
				if (success != null) {
					Array<CfdReference> ret = JSCollections.$array();
					for (int i = 0; i < p1.$length(); i++) {
						CfdReference reference = new CfdReference();
						if (p1.$get(i).isAny(reference.getTypes())) {
							reference.copyFrom(p1.$get(i));
						} else if (p1.$get(i).isA(EcEncryptedValue.myType)) {
							EcEncryptedValue val = new EcEncryptedValue();
							val.copyFrom(p1.$get(i));
							if (val.isAnEncrypted(CfdReference.myType)) {
								EcRemoteLinkedData obj = val.decryptIntoObject();
								reference.copyFrom(obj);
							}
						}

						ret.$set(i, reference);
					}

					success.$invoke(ret);
				}
			}

		}, failure);
	}

	/**
	 * Returns the name of the reference
	 *
	 * @return {String}
	 * name of reference
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the Name of the reference
	 *
	 * @param {String} name
	 *                 name of the reference
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the URL of the reference
	 *
	 * @return {String}
	 * URL of reference
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Sets the URL of the reference
	 *
	 * @param {String} URL
	 *                 URL the reference is pointing at
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the educational alignment of the reference
	 *
	 * @return {CfdAlignment}
	 * Educational Alignment for reference
	 */
	public CfdAlignment getEducationalAlignment() {
		return (CfdAlignment) educationalAlignment;
	}

	/**
	 * Sets the educational alignment of the reference
	 *
	 * @param {CfdAlignment} alignment
	 *                       Educational alignment for reference
	 */
	public void setEducationalAlignment(CfdAlignment alignment) {
		educationalAlignment = alignment;
	}

	/**
	 * Returns the Educational Use of the reference (Should be Reference)
	 *
	 * @return {String}
	 * educational use
	 */
	public String getEducationalUse() {
		return educationalUse;
	}

	/**
	 * Saves this alignment details on the server corresponding to its ID
	 *
	 * @param {Callback1<String>} success
	 *                            Callback triggered on successfully saving the alignment
	 * @param {Callback1<String>} [failure]
	 *                            Callback triggered if error while saving alignment
	 * @memberOf CfdReference
	 * @method save
	 */
	public void save(Callback1<String> success, Callback1<String> failure) {
		if (name == null || name == "") {
			String msg = "Name cannot be missing";
			if (failure != null)
				failure.$invoke(msg);
			else
				Global.console.error(msg);
			return;
		}

		if (url == null || url == "") {
			String msg = "Url cannot be missing";
			if (failure != null)
				failure.$invoke(msg);
			else
				Global.console.error(msg);
			return;
		}

		if (educationalAlignment == null) {
			String msg = "Educational Alignment cannot be missing";
			if (failure != null)
				failure.$invoke(msg);
			else
				Global.console.error(msg);
			return;
		}

		EcRepository.save(this, success, failure);
	}

	/**
	 * Deletes the alignment from the server corresponding to its ID
	 *
	 * @param {Callback1<String>} success
	 *                            Callback triggered on successfully deleting the alignment
	 * @param {Callback1<String>} [failure]
	 *                            Callback triggered if error while deleting alignment
	 * @memberOf CfdReference
	 * @method _delete
	 */
	public void _delete(Callback1<String> success, Callback1<String> failure) {
		EcRepository.DELETE(this, success, failure);
	}
}
