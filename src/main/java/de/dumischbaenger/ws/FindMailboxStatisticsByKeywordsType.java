
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         Request type for the FindMailboxStatisticsByKeywords web method.
 *       
 * 
 * <p>Java-Klasse für FindMailboxStatisticsByKeywordsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindMailboxStatisticsByKeywordsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfUserMailboxesType"/&gt;
 *         &lt;element name="Keywords" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Senders" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSmtpAddressType" minOccurs="0"/&gt;
 *         &lt;element name="Recipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSmtpAddressType" minOccurs="0"/&gt;
 *         &lt;element name="FromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ToDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MessageTypes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSearchItemKindsType" minOccurs="0"/&gt;
 *         &lt;element name="SearchDumpster" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludePersonalArchive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeUnsearchableItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindMailboxStatisticsByKeywordsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "mailboxes",
    "keywords",
    "language",
    "senders",
    "recipients",
    "fromDate",
    "toDate",
    "messageTypes",
    "searchDumpster",
    "includePersonalArchive",
    "includeUnsearchableItems"
})
public class FindMailboxStatisticsByKeywordsType
    extends BaseRequestType
{

    @XmlElement(name = "Mailboxes", required = true)
    protected ArrayOfUserMailboxesType mailboxes;
    @XmlElement(name = "Keywords", required = true)
    protected ArrayOfStringsType keywords;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "Senders")
    protected ArrayOfSmtpAddressType senders;
    @XmlElement(name = "Recipients")
    protected ArrayOfSmtpAddressType recipients;
    @XmlElement(name = "FromDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlElement(name = "ToDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;
    @XmlElement(name = "MessageTypes")
    protected ArrayOfSearchItemKindsType messageTypes;
    @XmlElement(name = "SearchDumpster")
    protected Boolean searchDumpster;
    @XmlElement(name = "IncludePersonalArchive")
    protected Boolean includePersonalArchive;
    @XmlElement(name = "IncludeUnsearchableItems")
    protected Boolean includeUnsearchableItems;

    /**
     * Ruft den Wert der mailboxes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserMailboxesType }
     *     
     */
    public ArrayOfUserMailboxesType getMailboxes() {
        return mailboxes;
    }

    /**
     * Legt den Wert der mailboxes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserMailboxesType }
     *     
     */
    public void setMailboxes(ArrayOfUserMailboxesType value) {
        this.mailboxes = value;
    }

    /**
     * Ruft den Wert der keywords-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getKeywords() {
        return keywords;
    }

    /**
     * Legt den Wert der keywords-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setKeywords(ArrayOfStringsType value) {
        this.keywords = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Ruft den Wert der senders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public ArrayOfSmtpAddressType getSenders() {
        return senders;
    }

    /**
     * Legt den Wert der senders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public void setSenders(ArrayOfSmtpAddressType value) {
        this.senders = value;
    }

    /**
     * Ruft den Wert der recipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public ArrayOfSmtpAddressType getRecipients() {
        return recipients;
    }

    /**
     * Legt den Wert der recipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public void setRecipients(ArrayOfSmtpAddressType value) {
        this.recipients = value;
    }

    /**
     * Ruft den Wert der fromDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Legt den Wert der fromDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Ruft den Wert der toDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Legt den Wert der toDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

    /**
     * Ruft den Wert der messageTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchItemKindsType }
     *     
     */
    public ArrayOfSearchItemKindsType getMessageTypes() {
        return messageTypes;
    }

    /**
     * Legt den Wert der messageTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchItemKindsType }
     *     
     */
    public void setMessageTypes(ArrayOfSearchItemKindsType value) {
        this.messageTypes = value;
    }

    /**
     * Ruft den Wert der searchDumpster-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchDumpster() {
        return searchDumpster;
    }

    /**
     * Legt den Wert der searchDumpster-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchDumpster(Boolean value) {
        this.searchDumpster = value;
    }

    /**
     * Ruft den Wert der includePersonalArchive-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePersonalArchive() {
        return includePersonalArchive;
    }

    /**
     * Legt den Wert der includePersonalArchive-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePersonalArchive(Boolean value) {
        this.includePersonalArchive = value;
    }

    /**
     * Ruft den Wert der includeUnsearchableItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeUnsearchableItems() {
        return includeUnsearchableItems;
    }

    /**
     * Legt den Wert der includeUnsearchableItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeUnsearchableItems(Boolean value) {
        this.includeUnsearchableItems = value;
    }

}
