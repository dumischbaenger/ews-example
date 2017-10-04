
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für SuggestionDayResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SuggestionDayResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DayQuality" type="{http://schemas.microsoft.com/exchange/services/2006/types}SuggestionQuality"/&gt;
 *         &lt;element name="SuggestionArray" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSuggestion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestionDayResult", propOrder = {
    "date",
    "dayQuality",
    "suggestionArray"
})
public class SuggestionDayResult {

    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "DayQuality", required = true)
    @XmlSchemaType(name = "string")
    protected SuggestionQuality dayQuality;
    @XmlElement(name = "SuggestionArray")
    protected ArrayOfSuggestion suggestionArray;

    /**
     * Ruft den Wert der date-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Ruft den Wert der dayQuality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SuggestionQuality }
     *     
     */
    public SuggestionQuality getDayQuality() {
        return dayQuality;
    }

    /**
     * Legt den Wert der dayQuality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestionQuality }
     *     
     */
    public void setDayQuality(SuggestionQuality value) {
        this.dayQuality = value;
    }

    /**
     * Ruft den Wert der suggestionArray-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSuggestion }
     *     
     */
    public ArrayOfSuggestion getSuggestionArray() {
        return suggestionArray;
    }

    /**
     * Legt den Wert der suggestionArray-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSuggestion }
     *     
     */
    public void setSuggestionArray(ArrayOfSuggestion value) {
        this.suggestionArray = value;
    }

}
