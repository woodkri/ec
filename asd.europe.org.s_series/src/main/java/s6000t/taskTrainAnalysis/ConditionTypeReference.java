
package s6000t.taskTrainAnalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conditionTypeReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conditionTypeReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="condName" type="{http://www.asd-europe.org/s-series/s3000l}conditionTypeName"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uidRef">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.asd-europe.org/s-series/s3000l}uidRef">
 *             &lt;pattern value="condt[1-9][0-9]*"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conditionTypeReference", namespace = "http://www.asd-europe.org/s-series/s3000l", propOrder = {
    "condName"
})
public class ConditionTypeReference {

    protected ConditionTypeName condName;
    @XmlAttribute(name = "uidRef")
    @XmlIDREF
    protected Object uidRef;

    /**
     * Gets the value of the condName property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionTypeName }
     *     
     */
    public ConditionTypeName getCondName() {
        return condName;
    }

    /**
     * Sets the value of the condName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionTypeName }
     *     
     */
    public void setCondName(ConditionTypeName value) {
        this.condName = value;
    }

    /**
     * Gets the value of the uidRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUidRef() {
        return uidRef;
    }

    /**
     * Sets the value of the uidRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUidRef(Object value) {
        this.uidRef = value;
    }

}
