/**
 *
 * Generated by JaxbToStjsAssimilater.
 * Assimilation Date: Mon Jul 29 11:33:18 CDT 2019
 *
 **/

package s6000t.taskTrainAnalysis;

import org.cassproject.schema.general.EcRemoteLinkedData;

public class AuthorityToOperateIdentifier extends EcRemoteLinkedData {

    protected AuthorityToOperateIdentifierClassValues clazz;
    protected OrganizationReference setBy;

    public AuthorityToOperateIdentifierClassValues getClazz() {
        return clazz;
    }

    public void setClazz(AuthorityToOperateIdentifierClassValues value) {
        this.clazz = value;
    }

    public OrganizationReference getSetBy() {
        return setBy;
    }

    public void setSetBy(OrganizationReference value) {
        this.setBy = value;
    }

	public AuthorityToOperateIdentifier() {
		super("http://asd-europe.org/", "AuthorityToOperateIdentifier");
	}

}
