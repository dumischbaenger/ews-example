
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für EmailAddressDictionaryEntryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EmailAddressDictionaryEntryType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="Key" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressKeyType" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RoutingType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MailboxType" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxTypeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailAddressDictionaryEntryType", propOrder = {
    "value"
})
public class EmailAddressDictionaryEntryType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Key", required = true)
    protected EmailAddressKeyType key;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "RoutingType")
    protected String routingType;
    @XmlAttribute(name = "MailboxType")
    protected MailboxTypeType mailboxType;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der key-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressKeyType }
     *     
     */
    public EmailAddressKeyType getKey() {
        return key;
    }

    /**
     * Legt den Wert der key-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressKeyType }
     *     
     */
    public void setKey(EmailAddressKeyType value) {
        this.key = value;
    }

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

}
