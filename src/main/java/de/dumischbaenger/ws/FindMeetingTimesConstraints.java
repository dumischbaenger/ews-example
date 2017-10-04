
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindMeetingTimesConstraints complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindMeetingTimesConstraints"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaxCandidates" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsOrganizerOptional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReturnSuggestionHints" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindMeetingTimesConstraints", propOrder = {
    "maxCandidates",
    "isOrganizerOptional",
    "returnSuggestionHints"
})
public class FindMeetingTimesConstraints {

    @XmlElement(name = "MaxCandidates")
    protected Integer maxCandidates;
    @XmlElement(name = "IsOrganizerOptional")
    protected Boolean isOrganizerOptional;
    @XmlElement(name = "ReturnSuggestionHints")
    protected Boolean returnSuggestionHints;

    /**
     * Ruft den Wert der maxCandidates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCandidates() {
        return maxCandidates;
    }

    /**
     * Legt den Wert der maxCandidates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCandidates(Integer value) {
        this.maxCandidates = value;
    }

    /**
     * Ruft den Wert der isOrganizerOptional-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOrganizerOptional() {
        return isOrganizerOptional;
    }

    /**
     * Legt den Wert der isOrganizerOptional-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOrganizerOptional(Boolean value) {
        this.isOrganizerOptional = value;
    }

    /**
     * Ruft den Wert der returnSuggestionHints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnSuggestionHints() {
        return returnSuggestionHints;
    }

    /**
     * Legt den Wert der returnSuggestionHints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnSuggestionHints(Boolean value) {
        this.returnSuggestionHints = value;
    }

}
