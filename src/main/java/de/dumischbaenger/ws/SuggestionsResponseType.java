
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SuggestionsResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SuggestionsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseMessage" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType" minOccurs="0"/&gt;
 *         &lt;element name="SuggestionDayResultArray" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSuggestionDayResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestionsResponseType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "responseMessage",
    "suggestionDayResultArray"
})
public class SuggestionsResponseType {

    @XmlElement(name = "ResponseMessage")
    protected ResponseMessageType responseMessage;
    @XmlElement(name = "SuggestionDayResultArray")
    protected ArrayOfSuggestionDayResult suggestionDayResultArray;

    /**
     * Ruft den Wert der responseMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMessageType }
     *     
     */
    public ResponseMessageType getResponseMessage() {
        return responseMessage;
    }

    /**
     * Legt den Wert der responseMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMessageType }
     *     
     */
    public void setResponseMessage(ResponseMessageType value) {
        this.responseMessage = value;
    }

    /**
     * Ruft den Wert der suggestionDayResultArray-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSuggestionDayResult }
     *     
     */
    public ArrayOfSuggestionDayResult getSuggestionDayResultArray() {
        return suggestionDayResultArray;
    }

    /**
     * Legt den Wert der suggestionDayResultArray-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSuggestionDayResult }
     *     
     */
    public void setSuggestionDayResultArray(ArrayOfSuggestionDayResult value) {
        this.suggestionDayResultArray = value;
    }

}
