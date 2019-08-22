/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Thu Aug 22 12:47:52 CDT 2019
 *
 **/

package s3000l;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class ApplicabilityEvaluationByAssertionOfClassInstance extends EcRemoteLinkedData {

    protected ProductVariantReference prodVarRef;
    protected HardwareElementPartRealizationReference hwElemRealRef;
    protected SoftwareElementPartRealizationReference swElemRealRef;
    protected OrganizationReference orgRef;
    protected OperatingLocationReference opLocRef;
    protected OperatingLocationTypeReference opTypeRef;
    protected MaintenanceLevelReference mlvRef;
    protected MaintenanceLocationReference mLocRef;
    protected BreakdownElementReference beRef;
    protected ProductUsagePhaseReference usagePhaseRef;
    protected ContractReference contrRef;
    protected PartAsDesignedReference partRef;
    protected AllowedProductConfigurationByConfigurationIdentifierReference prodConfRef;
    protected s3000l.ConditionInstance.Rmks rmks;
    protected String uid;
    protected CrudCodeValues crud;

    public ProductVariantReference getProdVarRef() {
        return prodVarRef;
    }

    public void setProdVarRef(ProductVariantReference value) {
        this.prodVarRef = value;
    }

    public HardwareElementPartRealizationReference getHwElemRealRef() {
        return hwElemRealRef;
    }

    public void setHwElemRealRef(HardwareElementPartRealizationReference value) {
        this.hwElemRealRef = value;
    }

    public SoftwareElementPartRealizationReference getSwElemRealRef() {
        return swElemRealRef;
    }

    public void setSwElemRealRef(SoftwareElementPartRealizationReference value) {
        this.swElemRealRef = value;
    }

    public OrganizationReference getOrgRef() {
        return orgRef;
    }

    public void setOrgRef(OrganizationReference value) {
        this.orgRef = value;
    }

    public OperatingLocationReference getOpLocRef() {
        return opLocRef;
    }

    public void setOpLocRef(OperatingLocationReference value) {
        this.opLocRef = value;
    }

    public OperatingLocationTypeReference getOpTypeRef() {
        return opTypeRef;
    }

    public void setOpTypeRef(OperatingLocationTypeReference value) {
        this.opTypeRef = value;
    }

    public MaintenanceLevelReference getMlvRef() {
        return mlvRef;
    }

    public void setMlvRef(MaintenanceLevelReference value) {
        this.mlvRef = value;
    }

    public MaintenanceLocationReference getMLocRef() {
        return mLocRef;
    }

    public void setMLocRef(MaintenanceLocationReference value) {
        this.mLocRef = value;
    }

    public BreakdownElementReference getBeRef() {
        return beRef;
    }

    public void setBeRef(BreakdownElementReference value) {
        this.beRef = value;
    }

    public ProductUsagePhaseReference getUsagePhaseRef() {
        return usagePhaseRef;
    }

    public void setUsagePhaseRef(ProductUsagePhaseReference value) {
        this.usagePhaseRef = value;
    }

    public ContractReference getContrRef() {
        return contrRef;
    }

    public void setContrRef(ContractReference value) {
        this.contrRef = value;
    }

    public PartAsDesignedReference getPartRef() {
        return partRef;
    }

    public void setPartRef(PartAsDesignedReference value) {
        this.partRef = value;
    }

    public AllowedProductConfigurationByConfigurationIdentifierReference getProdConfRef() {
        return prodConfRef;
    }

    public void setProdConfRef(AllowedProductConfigurationByConfigurationIdentifierReference value) {
        this.prodConfRef = value;
    }

    public s3000l.ConditionInstance.Rmks getRmks() {
        return rmks;
    }

    public void setRmks(s3000l.ConditionInstance.Rmks value) {
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

	public ApplicabilityEvaluationByAssertionOfClassInstance() {
		super("http://www.asd-europe.org/s-series/s3000l", "ApplicabilityEvaluationByAssertionOfClassInstance");
	}

}
