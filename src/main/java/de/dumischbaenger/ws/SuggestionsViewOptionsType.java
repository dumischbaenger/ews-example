
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für SuggestionsViewOptionsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SuggestionsViewOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GoodThreshold" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaximumResultsByDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaximumNonWorkHourResultsByDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MeetingDurationInMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MinimumSuggestionQuality" type="{http://schemas.microsoft.com/exchange/services/2006/types}SuggestionQuality" minOccurs="0"/&gt;
 *         &lt;element name="DetailedSuggestionsWindow" type="{http://schemas.microsoft.com/exchange/services/2006/types}Duration"/&gt;
 *         &lt;element name="CurrentMeetingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="GlobalObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestionsViewOptionsType", propOrder = {
    "goodThreshold",
    "maximumResultsByDay",
    "maximumNonWorkHourResultsByDay",
    "meetingDurationInMinutes",
    "minimumSuggestionQuality",
    "detailedSuggestionsWindow",
    "currentMeetingTime",
    "globalObjectId"
})
public class SuggestionsViewOptionsType {

    @XmlElement(name = "GoodThreshold")
    protected Integer goodThreshold;
    @XmlElement(name = "MaximumResultsByDay")
    protected Integer maximumResultsByDay;
    @XmlElement(name = "MaximumNonWorkHourResultsByDay")
    protected Integer maximumNonWorkHourResultsByDay;
    @XmlElement(name = "MeetingDurationInMinutes")
    protected Integer meetingDurationInMinutes;
    @XmlElement(name = "MinimumSuggestionQuality")
    @XmlSchemaType(name = "string")
    protected SuggestionQuality minimumSuggestionQuality;
    @XmlElement(name = "DetailedSuggestionsWindow", required = true)
    protected Duration detailedSuggestionsWindow;
    @XmlElement(name = "CurrentMeetingTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentMeetingTime;
    @XmlElement(name = "GlobalObjectId")
    protected String globalObjectId;

    /**
     * Ruft den Wert der goodThreshold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGoodThreshold() {
        return goodThreshold;
    }

    /**
     * Legt den Wert der goodThreshold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGoodThreshold(Integer value) {
        this.goodThreshold = value;
    }

    /**
     * Ruft den Wert der maximumResultsByDay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumResultsByDay() {
        return maximumResultsByDay;
    }

    /**
     * Legt den Wert der maximumResultsByDay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumResultsByDay(Integer value) {
        this.maximumResultsByDay = value;
    }

    /**
     * Ruft den Wert der maximumNonWorkHourResultsByDay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumNonWorkHourResultsByDay() {
        return maximumNonWorkHourResultsByDay;
    }

    /**
     * Legt den Wert der maximumNonWorkHourResultsByDay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumNonWorkHourResultsByDay(Integer value) {
        this.maximumNonWorkHourResultsByDay = value;
    }

    /**
     * Ruft den Wert der meetingDurationInMinutes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMeetingDurationInMinutes() {
        return meetingDurationInMinutes;
    }

    /**
     * Legt den Wert der meetingDurationInMinutes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMeetingDurationInMinutes(Integer value) {
        this.meetingDurationInMinutes = value;
    }

    /**
     * Ruft den Wert der minimumSuggestionQuality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SuggestionQuality }
     *     
     */
    public SuggestionQuality getMinimumSuggestionQuality() {
        return minimumSuggestionQuality;
    }

    /**
     * Legt den Wert der minimumSuggestionQuality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestionQuality }
     *     
     */
    public void setMinimumSuggestionQuality(SuggestionQuality value) {
        this.minimumSuggestionQuality = value;
    }

    /**
     * Ruft den Wert der detailedSuggestionsWindow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDetailedSuggestionsWindow() {
        return detailedSuggestionsWindow;
    }

    /**
     * Legt den Wert der detailedSuggestionsWindow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDetailedSuggestionsWindow(Duration value) {
        this.detailedSuggestionsWindow = value;
    }

    /**
     * Ruft den Wert der currentMeetingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentMeetingTime() {
        return currentMeetingTime;
    }

    /**
     * Legt den Wert der currentMeetingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentMeetingTime(XMLGregorianCalendar value) {
        this.currentMeetingTime = value;
    }

    /**
     * Ruft den Wert der globalObjectId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalObjectId() {
        return globalObjectId;
    }

    /**
     * Legt den Wert der globalObjectId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalObjectId(String value) {
        this.globalObjectId = value;
    }

}
