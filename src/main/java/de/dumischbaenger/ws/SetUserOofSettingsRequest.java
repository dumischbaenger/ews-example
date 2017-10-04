
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SetUserOofSettingsRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SetUserOofSettingsRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schemas.microsoft.com/exchange/services/2006/types}Mailbox"/&gt;
 *         &lt;element ref="{http://schemas.microsoft.com/exchange/services/2006/types}UserOofSettings"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetUserOofSettingsRequest", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "mailbox",
    "userOofSettings"
})
public class SetUserOofSettingsRequest
    extends BaseRequestType
{

    @XmlElement(name = "Mailbox", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", required = true)
    protected EmailAddress mailbox;
    @XmlElement(name = "UserOofSettings", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", required = true)
    protected UserOofSettings userOofSettings;

    /**
     * Ruft den Wert der mailbox-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddress }
     *     
     */
    public EmailAddress getMailbox() {
        return mailbox;
    }

    /**
     * Legt den Wert der mailbox-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setMailbox(EmailAddress value) {
        this.mailbox = value;
    }

    /**
     * Ruft den Wert der userOofSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserOofSettings }
     *     
     */
    public UserOofSettings getUserOofSettings() {
        return userOofSettings;
    }

    /**
     * Legt den Wert der userOofSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserOofSettings }
     *     
     */
    public void setUserOofSettings(UserOofSettings value) {
        this.userOofSettings = value;
    }

}
