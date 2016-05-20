package org.cassproject.schema.general;



import org.json.ld.EcLinkedData;
import org.stjs.javascript.Array;
import org.stjs.javascript.Date;
import org.stjs.javascript.JSGlobal;
import org.stjs.javascript.JSObjectAdapter;

import com.eduworks.ec.crypto.EcPk;
import com.eduworks.ec.crypto.EcPpk;
import com.eduworks.ec.crypto.EcRsaOaep;
import com.eduworks.ec.random.EcRandom;

/**
 * Data wrapper to represent remotely hosted data. Includes necessary fields for
 * permission controls, signing, and identification of the object.
 * 
 * @author fritz.ray@eduworks.com
 *
 */
public class EcRemoteLinkedData extends EcLinkedData
{
	// An owner has write privileges according to a repository.
	// These owners are in PEM format.
	/**
	 * PEM encoded public keys of the owner of the object. A repository, upon
	 * receiving a write operation, will ensure either the data did not
	 * previously exist, or that an owner has provided a signature authorizing
	 * the replacement of the old data with the new data.
	 */
	public Array<String> owner;

	/**
	 * Signatures of the object. The signing method is as follows: Remove the
	 * signature field. Encode the object and its fields in ascii-sort order
	 * JSON-LD using a space-free, tab-free encoding. Sign the aforementioned
	 * string.
	 */
	public Array<String> signature;
	
	/**
	 * URL/URI used to retrieve and store the object, plus identify the object.
	 */
	public String id;
	
	public boolean privateEncrypted;
	
	/**
	 * PEM encoded public keys of identities authorized to view the object. A
	 * repository will ignore write operations from these identities, but will
	 * allow them to read the object.
	 */
	public Array<String> reader;

	/**
	 * Array of EbacEncryptedSecret objects encoded in Base-64, encrypted using
	 * RSA public keys of owners or readers (or unknown parties) to allow them
	 * access to the payload.
	 */
	public Array<String> secret;
	
	public EcRemoteLinkedData(String schema, String type)
	{
		super(schema, type);
	}

	/**
	 * Will generate an identifier using the server URL provided (usually from
	 * an EcRepository).
	 * 
	 * @param server
	 *            Base URL of the server's repository functionality.
	 */
	public void generateId(String server)
	{
		id = server;
		if (!id.endsWith("/"))
			id += "/";
		id += "data/";
		id += type.replace("http://", "").replaceAll("/", ".");
		id += "/";
		id += EcRandom.generateUUID();
		id += "/";
		id += new Date().getTime();
	}

	/**
	 * Determines if the object has pk as an owner. Homogenizes the PEM strings
	 * for comparison.
	 * 
	 * @param pk
	 * @return True if owner is represented by the PK, false otherwise.
	 */
	public boolean hasOwner(EcPk pk)
	{
		if(owner == null)
			return false;
		
		String pkPem = pk.toPem();
		for (int i = 0; i < owner.$length(); i++)
			// Homogenizing the owner's PEM string.
			if (pkPem.equals(EcPk.fromPem(owner.$get(i)).toPem()))
				return true;
		return false;
	}

	/**
	 * Determines if the object has pk as an owner. Homogenizes the PEM strings
	 * for comparison.
	 * 
	 * @param pk
	 * @return True if owner is represented by the PK, false otherwise.
	 */
	public boolean canEdit(EcPk pk)
	{
		if (owner == null || owner.$length() == 0)
			return true;
		return hasOwner(pk);
	}

	/**
	 * Encodes the object in a form where it is ready to be signed.
	 * 
	 * @return ASCII-sort order encoded space-free and tab-free JSON-LD.
	 */
	public String toSignableJson()
	{
		EcLinkedData d = (EcLinkedData) JSGlobal.JSON.parse(toJson());
		JSObjectAdapter.$properties(d).$delete("@signature");
		JSObjectAdapter.$properties(d).$delete("@owner");
		JSObjectAdapter.$properties(d).$delete("@reader");
		JSObjectAdapter.$properties(d).$delete("@id");

		EcLinkedData e = new EcLinkedData(d.schema, d.type);
		e.copyFrom(d);
		return e.toJson();
	}

	/**
	 * Sign this object with a private key.
	 * 
	 * @param ppk
	 */
	public void signWith(EcPpk ppk)
	{
		String signableJson = toSignableJson();
		String signed = EcRsaOaep.sign(ppk, signableJson);
		if (signature != null)
		{
			for (int i = 0; i < signature.$length(); i++)
				if (signature.$get(i).equals(signed))
					return;
		}
		else
		{
			signature = new Array<String>();
		}
		signature.push(signed);
	}

	/**
	 * Verify's the object's signatures
	 * 
	 * @return true if all of the signatures could be verified, false if they
	 *         could not
	 */
	public boolean verify()
	{
		if (signature != null)
		{
			for (int i = 0; i < signature.$length();)
			{
				boolean works = false;
				String sig = signature.$get(i);
				if (owner != null)
				{
					for (int j = 0; j < owner.$length(); j++)
					{
						String own = owner.$get(j);
						EcPk pk = EcPk.fromPem(own);
						Boolean verify = false;
						try
						{
							verify = EcRsaOaep.verify(pk, toSignableJson(), sig);
						}
						catch (Exception ex)
						{
						}
						if (verify)
						{
							works = true;
							break;
						}
					}
				}
				if (!works)
					return false;
				else
					i++;
			}
			
			if (signature.$length() == 0)
				return false;
			
			return true;
		}

		return false;
	}

	/**
	 * Adds an owner to the object, if the owner does not exist.
	 * 
	 * @param newOwner
	 *            PK of the new owner.
	 */
	public void addOwner(EcPk newOwner)
	{
		String pem = newOwner.toPem();
		if (owner == null)
			owner = new Array<String>();
		for (int i = 0; i < owner.$length(); i++)
			if (owner.$get(i).equals(pem))
				return;
		owner.push(pem);
	}

	/**
	 * Removes an owner from the object, if the owner does exist.
	 * 
	 * @param owner
	 *            PK of the new owner.
	 */
	public void removeOwner(EcPk oldOwner)
	{
		String pem = oldOwner.toPem();
		if (owner == null)
			owner = new Array<String>();
		for (int i = 0; i < owner.$length(); i++)
			if (owner.$get(i).equals(pem))
				owner.splice(i, 1);
	}
	
	/**
	 * Adds a reader to the object, if the reader does not exist.
	 * 
	 * @param newReader
	 *            PK of the new reader.
	 */
	public void addReader(EcPk newReader)
	{
		String pem = newReader.toPem();
		if (reader == null)
			reader = new Array<String>();
		for (int i = 0; i < reader.$length(); i++)
			if (reader.$get(i).equals(pem))
				return;
		reader.push(pem);
	}

	/**
	 * Removes a reader from the object, if the reader does exist.
	 * 
	 * @param oldReader
	 *            PK of the old reader.
	 */
	public void removeReader(EcPk oldReader)
	{
		String pem = oldReader.toPem();
		if (reader == null)
			reader = new Array<String>();
		for (int i = 0; i < reader.$length(); i++)
			if (reader.$get(i).equals(pem))
				reader.splice(i, 1);
	}
	
	
	/**
	 * Determines if the object will survive and be retreivable from a server,
	 * should it be written.
	 * 
	 * @return True if the object is NOT VALID for storage, false otherwise.
	 */
	public boolean invalid()
	{
		if (id == null)
			return true;
		if (id.contains("http://") == false && id.contains("https://") == false)
			return true;
		if (schema == null)
			return true;
		if (getFullType() == null)
			return true;
		if (getFullType().contains("http://") == false && getFullType().contains("https://") == false )
			return true;
		return false;
	}

	public void updateTimestamp()
	{
		String rawId = id.substring(0, id.lastIndexOf("/"));
		if (rawId.endsWith("/") == false)
			rawId += "/";
		rawId += new Date().getTime();
		id = rawId;
	}

	public boolean isId(String id)
	{
		return trimVersionFromUrl(this.id).equals(trimVersionFromUrl(id));
	}

	public static String trimVersionFromUrl(String id)
	{
		if (id == null)
			return null;
		if (id.substring(id.lastIndexOf("/")).contains("-"))
			return id;
		String rawId = id.substring(0, id.lastIndexOf("/"));
		if (rawId.endsWith("/"))
			rawId = rawId.substring(0, rawId.length() - 1);
		return rawId;
	}

	public String shortId()
	{
		return trimVersionFromUrl(id);
	}
}
