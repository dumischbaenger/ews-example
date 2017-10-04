
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UpdateInboxRulesRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UpdateInboxRulesRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailboxSmtpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemoveOutlookRuleBlob" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Operations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRuleOperationsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInboxRulesRequestType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "mailboxSmtpAddress",
    "removeOutlookRuleBlob",
    "operations"
})
public class UpdateInboxRulesRequestType
    extends BaseRequestType
{

    @XmlElement(name = "MailboxSmtpAddress")
    protected String mailboxSmtpAddress;
    @XmlElement(name = "RemoveOutlookRuleBlob")
    protected Boolean removeOutlookRuleBlob;
    @XmlElement(name = "Operations", required = true)
    protected ArrayOfRuleOperationsType operations;

    /**
     * Ruft den Wert der mailboxSmtpAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailboxSmtpAddress() {
        return mailboxSmtpAddress;
    }

    /**
     * Legt den Wert der mailboxSmtpAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailboxSmtpAddress(String value) {
        this.mailboxSmtpAddress = value;
    }

    /**
     * Ruft den Wert der removeOutlookRuleBlob-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemoveOutlookRuleBlob() {
        return removeOutlookRuleBlob;
    }

    /**
     * Legt den Wert der removeOutlookRuleBlob-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoveOutlookRuleBlob(Boolean value) {
        this.removeOutlookRuleBlob = value;
    }

    /**
     * Ruft den Wert der operations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRuleOperationsType }
     *     
     */
    public ArrayOfRuleOperationsType getOperations() {
        return operations;
    }

    /**
     * Legt den Wert der operations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRuleOperationsType }
     *     
     */
    public void setOperations(ArrayOfRuleOperationsType value) {
        this.operations = value;
    }

}
