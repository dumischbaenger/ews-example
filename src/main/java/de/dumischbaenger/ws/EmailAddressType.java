
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifier for a fully resolved email address
 * 
 * <p>Java-Klasse für EmailAddressType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EmailAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseEmailAddressType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="RoutingType" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType" minOccurs="0"/&gt;
 *         &lt;element name="MailboxType" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxTypeType" minOccurs="0"/&gt;
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/&gt;
 *         &lt;element name="OriginalDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailAddressType", propOrder = {
    "name",
    "emailAddress",
    "routingType",
    "mailboxType",
    "itemId",
    "originalDisplayName"
})
@XmlSeeAlso({
    EmailAddressExtendedType.class
})
public class EmailAddressType
    extends BaseEmailAddressType
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "RoutingType")
    protected String routingType;
    @XmlElement(name = "MailboxType")
    @XmlSchemaType(name = "string")
    protected MailboxTypeType mailboxType;
    @XmlElement(name = "ItemId")
    protected ItemIdType itemId;
    @XmlElement(name = "OriginalDisplayName")
    protected String originalDisplayName;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der emailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Legt den Wert der emailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Ruft den Wert der routingType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingType() {
        return routingType;
    }

    /**
     * Legt den Wert der routingType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingType(String value) {
        this.routingType = value;
    }

    /**
     * Ruft den Wert der mailboxType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MailboxTypeType }
     *     
     */
    public MailboxTypeType getMailboxType() {
        return mailboxType;
    }

    /**
     * Legt den Wert der mailboxType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxTypeType }
     *     
     */
    public void setMailboxType(MailboxTypeType value) {
        this.mailboxType = value;
    }

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
     * Ruft den Wert der originalDisplayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalDisplayName() {
        return originalDisplayName;
    }

    /**
     * Legt den Wert der originalDisplayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalDisplayName(String value) {
        this.originalDisplayName = value;
    }

}
