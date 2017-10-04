
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Response message type for the GetHoldOnMailboxes web method.
 *         
 * 
 * <p>Java-Klasse für GetHoldOnMailboxesResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetHoldOnMailboxesResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailboxHoldResult" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxHoldResultType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetHoldOnMailboxesResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "mailboxHoldResult"
})
public class GetHoldOnMailboxesResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "MailboxHoldResult")
    protected MailboxHoldResultType mailboxHoldResult;

    /**
     * Ruft den Wert der mailboxHoldResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MailboxHoldResultType }
     *     
     */
    public MailboxHoldResultType getMailboxHoldResult() {
        return mailboxHoldResult;
    }

    /**
     * Legt den Wert der mailboxHoldResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxHoldResultType }
     *     
     */
    public void setMailboxHoldResult(MailboxHoldResultType value) {
        this.mailboxHoldResult = value;
    }

}
