
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für InsightItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InsightItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/&gt;
 *         &lt;element name="InsightId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartTimeUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndTimeUtc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.microsoft.com/exchange/services/2006/types}InsightStatusType" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Context" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfInsightContextItem" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationsIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="SuggestedActions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AppContexts" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsightItemType", propOrder = {
    "itemId",
    "insightId",
    "type",
    "startTimeUtc",
    "endTimeUtc",
    "status",
    "version",
    "context",
    "text",
    "applicationsIds",
    "suggestedActions",
    "appContexts"
})
public class InsightItemType {

    @XmlElement(name = "ItemId", required = true)
    protected ItemIdType itemId;
    @XmlElement(name = "InsightId", required = true)
    protected String insightId;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "StartTimeUtc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTimeUtc;
    @XmlElement(name = "EndTimeUtc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTimeUtc;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected InsightStatusType status;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Context")
    protected ArrayOfInsightContextItem context;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "ApplicationsIds")
    protected ArrayOfStringsType applicationsIds;
    @XmlElement(name = "SuggestedActions")
    protected String suggestedActions;
    @XmlElement(name = "AppContexts")
    protected ArrayOfStringsType appContexts;

    /**
     * Ruft den Wert der itemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getItemId() {
        return itemId;
    }

    /**
     * Legt den Wert der itemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setItemId(ItemIdType value) {
        this.itemId = value;
    }

    /**
     * Ruft den Wert der insightId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsightId() {
        return insightId;
    }

    /**
     * Legt den Wert der insightId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsightId(String value) {
        this.insightId = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der startTimeUtc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimeUtc() {
        return startTimeUtc;
    }

    /**
     * Legt den Wert der startTimeUtc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimeUtc(XMLGregorianCalendar value) {
        this.startTimeUtc = value;
    }

    /**
     * Ruft den Wert der endTimeUtc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTimeUtc() {
        return endTimeUtc;
    }

    /**
     * Legt den Wert der endTimeUtc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTimeUtc(XMLGregorianCalendar value) {
        this.endTimeUtc = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InsightStatusType }
     *     
     */
    public InsightStatusType getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InsightStatusType }
     *     
     */
    public void setStatus(InsightStatusType value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der context-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInsightContextItem }
     *     
     */
    public ArrayOfInsightContextItem getContext() {
        return context;
    }

    /**
     * Legt den Wert der context-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInsightContextItem }
     *     
     */
    public void setContext(ArrayOfInsightContextItem value) {
        this.context = value;
    }

    /**
     * Ruft den Wert der text-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Legt den Wert der text-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Ruft den Wert der applicationsIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getApplicationsIds() {
        return applicationsIds;
    }

    /**
     * Legt den Wert der applicationsIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setApplicationsIds(ArrayOfStringsType value) {
        this.applicationsIds = value;
    }

    /**
     * Ruft den Wert der suggestedActions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuggestedActions() {
        return suggestedActions;
    }

    /**
     * Legt den Wert der suggestedActions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuggestedActions(String value) {
        this.suggestedActions = value;
    }

    /**
     * Ruft den Wert der appContexts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getAppContexts() {
        return appContexts;
    }

    /**
     * Legt den Wert der appContexts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setAppContexts(ArrayOfStringsType value) {
        this.appContexts = value;
    }

}
