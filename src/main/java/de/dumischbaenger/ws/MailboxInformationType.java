
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MailboxInformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MailboxInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="MailboxGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/&gt;
 *           &lt;element name="MailboxAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}SmtpAddressType"/&gt;
 *           &lt;element name="MailboxDisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxInformationType", propOrder = {
    "mailboxGuid",
    "mailboxAddress",
    "mailboxDisplayName"
})
public class MailboxInformationType {

    @XmlElement(name = "MailboxGuid", required = true)
    protected String mailboxGuid;
    @XmlElement(name = "MailboxAddress", required = true)
    protected SmtpAddressType mailboxAddress;
    @XmlElement(name = "MailboxDisplayName", required = true)
    protected String mailboxDisplayName;

    /**
     * Ruft den Wert der mailboxGuid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailboxGuid() {
        return mailboxGuid;
    }

    /**
     * Legt den Wert der mailboxGuid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailboxGuid(String value) {
        this.mailboxGuid = value;
    }

    /**
     * Ruft den Wert der mailboxAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmtpAddressType }
     *     
     */
    public SmtpAddressType getMailboxAddress() {
        return mailboxAddress;
    }

    /**
     * Legt den Wert der mailboxAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmtpAddressType }
     *     
     */
    public void setMailboxAddress(SmtpAddressType value) {
        this.mailboxAddress = value;
    }

    /**
     * Ruft den Wert der mailboxDisplayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailboxDisplayName() {
        return mailboxDisplayName;
    }

    /**
     * Legt den Wert der mailboxDisplayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailboxDisplayName(String value) {
        this.mailboxDisplayName = value;
    }

}
