
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für AttendeeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AttendeeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mailbox" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType"/&gt;
 *         &lt;element name="ResponseType" type="{http://schemas.microsoft.com/exchange/services/2006/types}ResponseTypeType" minOccurs="0"/&gt;
 *         &lt;element name="LastResponseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ProposedStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ProposedEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttendeeType", propOrder = {
    "mailbox",
    "responseType",
    "lastResponseTime",
    "proposedStart",
    "proposedEnd"
})
public class AttendeeType {

    @XmlElement(name = "Mailbox", required = true)
    protected EmailAddressType mailbox;
    @XmlElement(name = "ResponseType")
    @XmlSchemaType(name = "string")
    protected ResponseTypeType responseType;
    @XmlElement(name = "LastResponseTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastResponseTime;
    @XmlElement(name = "ProposedStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar proposedStart;
    @XmlElement(name = "ProposedEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar proposedEnd;

    /**
     * Ruft den Wert der mailbox-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getMailbox() {
        return mailbox;
    }

    /**
     * Legt den Wert der mailbox-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setMailbox(EmailAddressType value) {
        this.mailbox = value;
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
     * Ruft den Wert der lastResponseTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastResponseTime() {
        return lastResponseTime;
    }

    /**
     * Legt den Wert der lastResponseTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastResponseTime(XMLGregorianCalendar value) {
        this.lastResponseTime = value;
    }

    /**
     * Ruft den Wert der proposedStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProposedStart() {
        return proposedStart;
    }

    /**
     * Legt den Wert der proposedStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProposedStart(XMLGregorianCalendar value) {
        this.proposedStart = value;
    }

    /**
     * Ruft den Wert der proposedEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProposedEnd() {
        return proposedEnd;
    }

    /**
     * Legt den Wert der proposedEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProposedEnd(XMLGregorianCalendar value) {
        this.proposedEnd = value;
    }

}
