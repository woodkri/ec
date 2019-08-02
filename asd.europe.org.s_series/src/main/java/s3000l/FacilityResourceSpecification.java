/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:19 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;
import org.stjs.javascript.Array;

public class FacilityResourceSpecification extends EcRemoteLinkedData {

    protected ResourceSpecificationIdentifier resSpecId;
    protected ResourceSpecificationName name;
    protected ResourceSpecificationDescription resDescr;
    protected Array<ResourceRealization> partReal;
    protected DownTime.OrgInfos orgInfos;
    protected ConditionInstance.Docs docs;
    protected ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public ResourceSpecificationIdentifier getResSpecId() {
        return resSpecId;
    }

    public void setResSpecId(ResourceSpecificationIdentifier value) {
        this.resSpecId = value;
    }

    public ResourceSpecificationName getName() {
        return name;
    }

    public void setName(ResourceSpecificationName value) {
        this.name = value;
    }

    public ResourceSpecificationDescription getResDescr() {
        return resDescr;
    }

    public void setResDescr(ResourceSpecificationDescription value) {
        this.resDescr = value;
    }

    public Array<ResourceRealization> getPartReal() {
        if (partReal == null) {
            partReal = new Array<ResourceRealization>();
        }
        return this.partReal;
    }

    public DownTime.OrgInfos getOrgInfos() {
        return orgInfos;
    }

    public void setOrgInfos(DownTime.OrgInfos value) {
        this.orgInfos = value;
    }

    public ConditionInstance.Docs getDocs() {
        return docs;
    }

    public void setDocs(ConditionInstance.Docs value) {
        this.docs = value;
    }

    public ConditionInstance.Rmks getRmks() {
        return rmks;
    }

    public void setRmks(ConditionInstance.Rmks value) {
        this.rmks = value;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String value) {
        this.uid = value;
    }

    public CrudCodeValues getCrud() {
        if (crud == null) {
            return CrudCodeValues.I;
        } else {
            return crud;
        }
    }

    public void setCrud(CrudCodeValues value) {
        this.crud = value;
    }

	public FacilityResourceSpecification() {
		super("http://www.asd-europe.org/s-series/s3000l", "FacilityResourceSpecification");
	}

}
