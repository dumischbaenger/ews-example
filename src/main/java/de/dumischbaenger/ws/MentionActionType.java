
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MentionActionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MentionActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CreatedBy" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressExtendedType"/&gt;
 *         &lt;element name="CreatedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServerCreatedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeepLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mentioned" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressExtendedType"/&gt;
 *         &lt;element name="MentionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClientReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MentionActionType", propOrder = {
    "id",
    "createdBy",
    "createdDateTime",
    "serverCreatedDateTime",
    "deepLink",
    "application",
    "mentioned",
    "mentionText",
    "clientReference"
})
public class MentionActionType {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "CreatedBy", required = true)
    protected EmailAddressExtendedType createdBy;
    @XmlElement(name = "CreatedDateTime")
    protected String createdDateTime;
    @XmlElement(name = "ServerCreatedDateTime")
    protected String serverCreatedDateTime;
    @XmlElement(name = "DeepLink")
    protected String deepLink;
    @XmlElement(name = "Application")
    protected String application;
    @XmlElement(name = "Mentioned", required = true)
    protected EmailAddressExtendedType mentioned;
    @XmlElement(name = "MentionText")
    protected String mentionText;
    @XmlElement(name = "ClientReference")
    protected String clientReference;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der createdBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressExtendedType }
     *     
     */
    public EmailAddressExtendedType getCreatedBy() {
        return createdBy;
    }

    /**
     * Legt den Wert der createdBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressExtendedType }
     *     
     */
    public void setCreatedBy(EmailAddressExtendedType value) {
        this.createdBy = value;
    }

    /**
     * Ruft den Wert der createdDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Legt den Wert der createdDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDateTime(String value) {
        this.createdDateTime = value;
    }

    /**
     * Ruft den Wert der serverCreatedDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerCreatedDateTime() {
        return serverCreatedDateTime;
    }

    /**
     * Legt den Wert der serverCreatedDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerCreatedDateTime(String value) {
        this.serverCreatedDateTime = value;
    }

    /**
     * Ruft den Wert der deepLink-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeepLink() {
        return deepLink;
    }

    /**
     * Legt den Wert der deepLink-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeepLink(String value) {
        this.deepLink = value;
    }

    /**
     * Ruft den Wert der application-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Legt den Wert der application-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Ruft den Wert der mentioned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressExtendedType }
     *     
     */
    public EmailAddressExtendedType getMentioned() {
        return mentioned;
    }

    /**
     * Legt den Wert der mentioned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressExtendedType }
     *     
     */
    public void setMentioned(EmailAddressExtendedType value) {
        this.mentioned = value;
    }

    /**
     * Ruft den Wert der mentionText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMentionText() {
        return mentionText;
    }

    /**
     * Legt den Wert der mentionText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMentionText(String value) {
        this.mentionText = value;
    }

    /**
     * Ruft den Wert der clientReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientReference() {
        return clientReference;
    }

    /**
     * Legt den Wert der clientReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientReference(String value) {
        this.clientReference = value;
    }

}
