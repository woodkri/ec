
package s6000t.taskTrainAnalysis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for breakdownElementRevisionReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="breakdownElementRevisionReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="beId" type="{http://www.asd-europe.org/s-series/s3000l}breakdownElementIdentifier"/>
 *         &lt;element name="beRevId" type="{http://www.asd-europe.org/s-series/s3000l}breakdownElementRevisionIdentifier"/>
 *       &lt;/sequence>
 *       &lt;attribute name="uidRef">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.asd-europe.org/s-series/s3000l}uidRef">
 *             &lt;pattern value="ber[1-9][0-9]*"/>
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
@XmlType(name = "breakdownElementRevisionReference", namespace = "http://www.asd-europe.org/s-series/s3000l", propOrder = {
    "beId",
    "beRevId"
})
public class BreakdownElementRevisionReference {

    protected BreakdownElementIdentifier beId;
    protected BreakdownElementRevisionIdentifier beRevId;
    @XmlAttribute(name = "uidRef")
    @XmlIDREF
    protected Object uidRef;

    /**
     * Gets the value of the beId property.
     * 
     * @return
     *     possible object is
     *     {@link BreakdownElementIdentifier }
     *     
     */
    public BreakdownElementIdentifier getBeId() {
        return beId;
    }

    /**
     * Sets the value of the beId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakdownElementIdentifier }
     *     
     */
    public void setBeId(BreakdownElementIdentifier value) {
        this.beId = value;
    }

    /**
     * Gets the value of the beRevId property.
     * 
     * @return
     *     possible object is
     *     {@link BreakdownElementRevisionIdentifier }
     *     
     */
    public BreakdownElementRevisionIdentifier getBeRevId() {
        return beRevId;
    }

    /**
     * Sets the value of the beRevId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakdownElementRevisionIdentifier }
     *     
     */
    public void setBeRevId(BreakdownElementRevisionIdentifier value) {
        this.beRevId = value;
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
