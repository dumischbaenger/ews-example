
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MailTipsResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MailTipsResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MailTips" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailTips" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailTipsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "mailTips"
})
public class MailTipsResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "MailTips")
    protected MailTips mailTips;

    /**
     * Ruft den Wert der mailTips-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MailTips }
     *     
     */
    public MailTips getMailTips() {
        return mailTips;
    }

    /**
     * Legt den Wert der mailTips-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MailTips }
     *     
     */
    public void setMailTips(MailTips value) {
        this.mailTips = value;
    }

}
