
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für MeetingMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetingMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}MessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssociatedCalendarItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/&gt;
 *         &lt;element name="IsDelegated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOutOfDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HasBeenProcessed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ResponseType" type="{http://schemas.microsoft.com/exchange/services/2006/types}ResponseTypeType" minOccurs="0"/&gt;
 *         &lt;element name="UID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RecurrenceId" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DateTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsOrganizer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingMessageType", propOrder = {
    "associatedCalendarItemId",
    "isDelegated",
    "isOutOfDate",
    "hasBeenProcessed",
    "responseType",
    "uid",
    "recurrenceId",
    "dateTimeStamp",
    "isOrganizer"
})
@XmlSeeAlso({
    MeetingRequestMessageType.class,
    MeetingResponseMessageType.class,
    MeetingCancellationMessageType.class
})
public class MeetingMessageType
    extends MessageType
{

    @XmlElement(name = "AssociatedCalendarItemId")
    protected ItemIdType associatedCalendarItemId;
    @XmlElement(name = "IsDelegated")
    protected Boolean isDelegated;
    @XmlElement(name = "IsOutOfDate")
    protected Boolean isOutOfDate;
    @XmlElement(name = "HasBeenProcessed")
    protected Boolean hasBeenProcessed;
    @XmlElement(name = "ResponseType")
    @XmlSchemaType(name = "string")
    protected ResponseTypeType responseType;
    @XmlElement(name = "UID")
    protected String uid;
    @XmlElement(name = "RecurrenceId")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recurrenceId;
    @XmlElement(name = "DateTimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeStamp;
    @XmlElement(name = "IsOrganizer")
    protected Boolean isOrganizer;

    /**
     * Ruft den Wert der associatedCalendarItemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getAssociatedCalendarItemId() {
        return associatedCalendarItemId;
    }

    /**
     * Legt den Wert der associatedCalendarItemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setAssociatedCalendarItemId(ItemIdType value) {
        this.associatedCalendarItemId = value;
    }

    /**
     * Ruft den Wert der isDelegated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDelegated() {
        return isDelegated;
    }

    /**
     * Legt den Wert der isDelegated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDelegated(Boolean value) {
        this.isDelegated = value;
    }

    /**
     * Ruft den Wert der isOutOfDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOutOfDate() {
        return isOutOfDate;
    }

    /**
     * Legt den Wert der isOutOfDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOutOfDate(Boolean value) {
        this.isOutOfDate = value;
    }

    /**
     * Ruft den Wert der hasBeenProcessed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasBeenProcessed() {
        return hasBeenProcessed;
    }

    /**
     * Legt den Wert der hasBeenProcessed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasBeenProcessed(Boolean value) {
        this.hasBeenProcessed = value;
    }

    /**
     * Ruft den Wert der responseType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseTypeType }
     *     
     */
    public ResponseTypeType getResponseType() {
        return responseType;
    }

    /**
     * Legt den Wert der responseType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseTypeType }
     *     
     */
    public void setResponseType(ResponseTypeType value) {
        this.responseType = value;
    }

    /**
     * Ruft den Wert der uid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Legt den Wert der uid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * Ruft den Wert der recurrenceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecurrenceId() {
        return recurrenceId;
    }

    /**
     * Legt den Wert der recurrenceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecurrenceId(XMLGregorianCalendar value) {
        this.recurrenceId = value;
    }

    /**
     * Ruft den Wert der dateTimeStamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Legt den Wert der dateTimeStamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeStamp(XMLGregorianCalendar value) {
        this.dateTimeStamp = value;
    }

    /**
     * Ruft den Wert der isOrganizer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOrganizer() {
        return isOrganizer;
    }

    /**
     * Legt den Wert der isOrganizer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOrganizer(Boolean value) {
        this.isOrganizer = value;
    }

}
