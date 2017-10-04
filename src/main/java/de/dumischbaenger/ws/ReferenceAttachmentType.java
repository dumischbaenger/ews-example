
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ReferenceAttachmentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReferenceAttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}AttachmentType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttachLongPathName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProviderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProviderEndpointUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentThumbnailUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentPreviewUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PermissionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OriginalPermissionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentIsFolder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceAttachmentType", propOrder = {
    "attachLongPathName",
    "providerType",
    "providerEndpointUrl",
    "attachmentThumbnailUrl",
    "attachmentPreviewUrl",
    "permissionType",
    "originalPermissionType",
    "attachmentIsFolder"
})
public class ReferenceAttachmentType
    extends AttachmentType
{

    @XmlElement(name = "AttachLongPathName")
    protected String attachLongPathName;
    @XmlElement(name = "ProviderType")
    protected String providerType;
    @XmlElement(name = "ProviderEndpointUrl")
    protected String providerEndpointUrl;
    @XmlElement(name = "AttachmentThumbnailUrl")
    protected String attachmentThumbnailUrl;
    @XmlElement(name = "AttachmentPreviewUrl")
    protected String attachmentPreviewUrl;
    @XmlElement(name = "PermissionType")
    protected Integer permissionType;
    @XmlElement(name = "OriginalPermissionType")
    protected Integer originalPermissionType;
    @XmlElement(name = "AttachmentIsFolder")
    protected Boolean attachmentIsFolder;

    /**
     * Ruft den Wert der attachLongPathName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachLongPathName() {
        return attachLongPathName;
    }

    /**
     * Legt den Wert der attachLongPathName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachLongPathName(String value) {
        this.attachLongPathName = value;
    }

    /**
     * Ruft den Wert der providerType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     * Legt den Wert der providerType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderType(String value) {
        this.providerType = value;
    }

    /**
     * Ruft den Wert der providerEndpointUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderEndpointUrl() {
        return providerEndpointUrl;
    }

    /**
     * Legt den Wert der providerEndpointUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderEndpointUrl(String value) {
        this.providerEndpointUrl = value;
    }

    /**
     * Ruft den Wert der attachmentThumbnailUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentThumbnailUrl() {
        return attachmentThumbnailUrl;
    }

    /**
     * Legt den Wert der attachmentThumbnailUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentThumbnailUrl(String value) {
        this.attachmentThumbnailUrl = value;
    }

    /**
     * Ruft den Wert der attachmentPreviewUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentPreviewUrl() {
        return attachmentPreviewUrl;
    }

    /**
     * Legt den Wert der attachmentPreviewUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentPreviewUrl(String value) {
        this.attachmentPreviewUrl = value;
    }

    /**
     * Ruft den Wert der permissionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPermissionType() {
        return permissionType;
    }

    /**
     * Legt den Wert der permissionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPermissionType(Integer value) {
        this.permissionType = value;
    }

    /**
     * Ruft den Wert der originalPermissionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginalPermissionType() {
        return originalPermissionType;
    }

    /**
     * Legt den Wert der originalPermissionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginalPermissionType(Integer value) {
        this.originalPermissionType = value;
    }

    /**
     * Ruft den Wert der attachmentIsFolder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttachmentIsFolder() {
        return attachmentIsFolder;
    }

    /**
     * Legt den Wert der attachmentIsFolder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttachmentIsFolder(Boolean value) {
        this.attachmentIsFolder = value;
    }

}
