
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SetTeamMailboxRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SetTeamMailboxRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmailAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType"/&gt;
 *         &lt;element name="SharePointSiteUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="State" type="{http://schemas.microsoft.com/exchange/services/2006/types}TeamMailboxLifecycleStateType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTeamMailboxRequestType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "emailAddress",
    "sharePointSiteUrl",
    "state"
})
public class SetTeamMailboxRequestType
    extends BaseRequestType
{

    @XmlElement(name = "EmailAddress", required = true)
    protected EmailAddressType emailAddress;
    @XmlElement(name = "SharePointSiteUrl", required = true)
    protected String sharePointSiteUrl;
    @XmlElement(name = "State", required = true)
    @XmlSchemaType(name = "string")
    protected TeamMailboxLifecycleStateType state;

    /**
     * Ruft den Wert der emailAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getEmailAddress() {
        return emailAddress;
    }

    /**
     * Legt den Wert der emailAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setEmailAddress(EmailAddressType value) {
        this.emailAddress = value;
    }

    /**
     * Ruft den Wert der sharePointSiteUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharePointSiteUrl() {
        return sharePointSiteUrl;
    }

    /**
     * Legt den Wert der sharePointSiteUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharePointSiteUrl(String value) {
        this.sharePointSiteUrl = value;
    }

    /**
     * Ruft den Wert der state-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TeamMailboxLifecycleStateType }
     *     
     */
    public TeamMailboxLifecycleStateType getState() {
        return state;
    }

    /**
     * Legt den Wert der state-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TeamMailboxLifecycleStateType }
     *     
     */
    public void setState(TeamMailboxLifecycleStateType value) {
        this.state = value;
    }

}
