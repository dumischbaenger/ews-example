
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindMeetingTimesLocationConstraints complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindMeetingTimesLocationConstraints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationEntries" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfLocationConstraintItems" minOccurs="0"/&gt;
 *         &lt;element name="IsRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SuggestLocation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindMeetingTimesLocationConstraints", propOrder = {
    "locationEntries",
    "isRequired",
    "suggestLocation"
})
public class FindMeetingTimesLocationConstraints {

    @XmlElement(name = "LocationEntries")
    protected ArrayOfLocationConstraintItems locationEntries;
    @XmlElement(name = "IsRequired")
    protected Boolean isRequired;
    @XmlElement(name = "SuggestLocation")
    protected Boolean suggestLocation;

    /**
     * Ruft den Wert der locationEntries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocationConstraintItems }
     *     
     */
    public ArrayOfLocationConstraintItems getLocationEntries() {
        return locationEntries;
    }

    /**
     * Legt den Wert der locationEntries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocationConstraintItems }
     *     
     */
    public void setLocationEntries(ArrayOfLocationConstraintItems value) {
        this.locationEntries = value;
    }

    /**
     * Ruft den Wert der isRequired-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequired() {
        return isRequired;
    }

    /**
     * Legt den Wert der isRequired-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequired(Boolean value) {
        this.isRequired = value;
    }

    /**
     * Ruft den Wert der suggestLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuggestLocation() {
        return suggestLocation;
    }

    /**
     * Legt den Wert der suggestLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuggestLocation(Boolean value) {
        this.suggestLocation = value;
    }

}
