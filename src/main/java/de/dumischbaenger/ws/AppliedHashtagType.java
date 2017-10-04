
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AppliedHashtagType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AppliedHashtagType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CreatedBy" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressExtendedType"/&gt;
 *         &lt;element name="CreatedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServerCreatedDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeepLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsAutoTagged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsInlined" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppliedHashtagType", propOrder = {
    "id",
    "createdBy",
    "createdDateTime",
    "serverCreatedDateTime",
    "deepLink",
    "application",
    "tag",
    "isAutoTagged",
    "isInlined"
})
public class AppliedHashtagType {

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
    @XmlElement(name = "Tag", required = true)
    protected String tag;
    @XmlElement(name = "IsAutoTagged")
    protected boolean isAutoTagged;
    @XmlElement(name = "IsInlined")
    protected boolean isInlined;

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
     * Ruft den Wert der tag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Legt den Wert der tag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Ruft den Wert der isAutoTagged-Eigenschaft ab.
     * 
     */
    public boolean isIsAutoTagged() {
        return isAutoTagged;
    }

    /**
     * Legt den Wert der isAutoTagged-Eigenschaft fest.
     * 
     */
    public void setIsAutoTagged(boolean value) {
        this.isAutoTagged = value;
    }

    /**
     * Ruft den Wert der isInlined-Eigenschaft ab.
     * 
     */
    public boolean isIsInlined() {
        return isInlined;
    }

    /**
     * Legt den Wert der isInlined-Eigenschaft fest.
     * 
     */
    public void setIsInlined(boolean value) {
        this.isInlined = value;
    }

}
