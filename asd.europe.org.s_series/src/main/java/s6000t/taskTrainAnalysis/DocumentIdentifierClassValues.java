
package s6000t.taskTrainAnalysis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentIdentifierClassValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="documentIdentifierClassValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DOCID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "documentIdentifierClassValues", namespace = "http://www.asd-europe.org/spec/validValues")
@XmlEnum
public enum DocumentIdentifierClassValues {

    DOCID;

    public String value() {
        return name();
    }

    public static DocumentIdentifierClassValues fromValue(String v) {
        return valueOf(v);
    }

}
