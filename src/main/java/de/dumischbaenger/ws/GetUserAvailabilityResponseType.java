
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetUserAvailabilityResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetUserAvailabilityResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreeBusyResponseArray" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ArrayOfFreeBusyResponse" minOccurs="0"/&gt;
 *         &lt;element name="SuggestionsResponse" type="{http://schemas.microsoft.com/exchange/services/2006/messages}SuggestionsResponseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserAvailabilityResponseType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "freeBusyResponseArray",
    "suggestionsResponse"
})
public class GetUserAvailabilityResponseType {

    @XmlElement(name = "FreeBusyResponseArray")
    protected ArrayOfFreeBusyResponse freeBusyResponseArray;
    @XmlElement(name = "SuggestionsResponse")
    protected SuggestionsResponseType suggestionsResponse;

    /**
     * Ruft den Wert der freeBusyResponseArray-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFreeBusyResponse }
     *     
     */
    public ArrayOfFreeBusyResponse getFreeBusyResponseArray() {
        return freeBusyResponseArray;
    }

    /**
     * Legt den Wert der freeBusyResponseArray-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFreeBusyResponse }
     *     
     */
    public void setFreeBusyResponseArray(ArrayOfFreeBusyResponse value) {
        this.freeBusyResponseArray = value;
    }

    /**
     * Ruft den Wert der suggestionsResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SuggestionsResponseType }
     *     
     */
    public SuggestionsResponseType getSuggestionsResponse() {
        return suggestionsResponse;
    }

    /**
     * Legt den Wert der suggestionsResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestionsResponseType }
     *     
     */
    public void setSuggestionsResponse(SuggestionsResponseType value) {
        this.suggestionsResponse = value;
    }

}
