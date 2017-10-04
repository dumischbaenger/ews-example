
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetMailTipsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetMailTipsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SendingAs" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType"/&gt;
 *         &lt;element name="Recipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRecipientsType"/&gt;
 *         &lt;element name="MailTipsRequested" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailTipTypes"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMailTipsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "sendingAs",
    "recipients",
    "mailTipsRequested"
})
public class GetMailTipsType
    extends BaseRequestType
{

    @XmlElement(name = "SendingAs", required = true)
    protected EmailAddressType sendingAs;
    @XmlElement(name = "Recipients", required = true)
    protected ArrayOfRecipientsType recipients;
    @XmlList
    @XmlElement(name = "MailTipsRequested", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> mailTipsRequested;

    /**
     * Ruft den Wert der sendingAs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getSendingAs() {
        return sendingAs;
    }

    /**
     * Legt den Wert der sendingAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setSendingAs(EmailAddressType value) {
        this.sendingAs = value;
    }

    /**
     * Ruft den Wert der recipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public ArrayOfRecipientsType getRecipients() {
        return recipients;
    }

    /**
     * Legt den Wert der recipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRecipientsType }
     *     
     */
    public void setRecipients(ArrayOfRecipientsType value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the mailTipsRequested property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mailTipsRequested property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMailTipsRequested().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMailTipsRequested() {
        if (mailTipsRequested == null) {
            mailTipsRequested = new ArrayList<String>();
        }
        return this.mailTipsRequested;
    }

}
