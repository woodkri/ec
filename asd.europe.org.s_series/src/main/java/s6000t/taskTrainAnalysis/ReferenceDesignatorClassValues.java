
package s6000t.taskTrainAnalysis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for referenceDesignatorClassValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="referenceDesignatorClassValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RFD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "referenceDesignatorClassValues", namespace = "http://www.asd-europe.org/spec/validValues")
@XmlEnum
public enum ReferenceDesignatorClassValues {

    RFD;

    public String value() {
        return name();
    }

    public static ReferenceDesignatorClassValues fromValue(String v) {
        return valueOf(v);
    }

}
