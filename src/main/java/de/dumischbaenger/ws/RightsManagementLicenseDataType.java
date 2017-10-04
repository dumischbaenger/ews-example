
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RightsManagementLicenseDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RightsManagementLicenseDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RightsManagedMessageDecryptionStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RmsTemplateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TemplateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EditAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReplyAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ReplyAllAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForwardAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ModifyRecipientsAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExtractAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrintAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExportAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProgrammaticAccessAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ContentOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContentExpiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RightsManagementLicenseDataType", propOrder = {
    "rightsManagedMessageDecryptionStatus",
    "rmsTemplateId",
    "templateName",
    "templateDescription",
    "editAllowed",
    "replyAllowed",
    "replyAllAllowed",
    "forwardAllowed",
    "modifyRecipientsAllowed",
    "extractAllowed",
    "printAllowed",
    "exportAllowed",
    "programmaticAccessAllowed",
    "isOwner",
    "contentOwner",
    "contentExpiryDate"
})
public class RightsManagementLicenseDataType {

    @XmlElement(name = "RightsManagedMessageDecryptionStatus")
    protected Integer rightsManagedMessageDecryptionStatus;
    @XmlElement(name = "RmsTemplateId")
    protected String rmsTemplateId;
    @XmlElement(name = "TemplateName")
    protected String templateName;
    @XmlElement(name = "TemplateDescription")
    protected String templateDescription;
    @XmlElement(name = "EditAllowed")
    protected Boolean editAllowed;
    @XmlElement(name = "ReplyAllowed")
    protected Boolean replyAllowed;
    @XmlElement(name = "ReplyAllAllowed")
    protected Boolean replyAllAllowed;
    @XmlElement(name = "ForwardAllowed")
    protected Boolean forwardAllowed;
    @XmlElement(name = "ModifyRecipientsAllowed")
    protected Boolean modifyRecipientsAllowed;
    @XmlElement(name = "ExtractAllowed")
    protected Boolean extractAllowed;
    @XmlElement(name = "PrintAllowed")
    protected Boolean printAllowed;
    @XmlElement(name = "ExportAllowed")
    protected Boolean exportAllowed;
    @XmlElement(name = "ProgrammaticAccessAllowed")
    protected Boolean programmaticAccessAllowed;
    @XmlElement(name = "IsOwner")
    protected Boolean isOwner;
    @XmlElement(name = "ContentOwner")
    protected String contentOwner;
    @XmlElement(name = "ContentExpiryDate")
    protected String contentExpiryDate;

    /**
     * Ruft den Wert der rightsManagedMessageDecryptionStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRightsManagedMessageDecryptionStatus() {
        return rightsManagedMessageDecryptionStatus;
    }

    /**
     * Legt den Wert der rightsManagedMessageDecryptionStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRightsManagedMessageDecryptionStatus(Integer value) {
        this.rightsManagedMessageDecryptionStatus = value;
    }

    /**
     * Ruft den Wert der rmsTemplateId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmsTemplateId() {
        return rmsTemplateId;
    }

    /**
     * Legt den Wert der rmsTemplateId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmsTemplateId(String value) {
        this.rmsTemplateId = value;
    }

    /**
     * Ruft den Wert der templateName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Legt den Wert der templateName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Ruft den Wert der templateDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    /**
     * Legt den Wert der templateDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateDescription(String value) {
        this.templateDescription = value;
    }

    /**
     * Ruft den Wert der editAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditAllowed() {
        return editAllowed;
    }

    /**
     * Legt den Wert der editAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditAllowed(Boolean value) {
        this.editAllowed = value;
    }

    /**
     * Ruft den Wert der replyAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplyAllowed() {
        return replyAllowed;
    }

    /**
     * Legt den Wert der replyAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplyAllowed(Boolean value) {
        this.replyAllowed = value;
    }

    /**
     * Ruft den Wert der replyAllAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplyAllAllowed() {
        return replyAllAllowed;
    }

    /**
     * Legt den Wert der replyAllAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplyAllAllowed(Boolean value) {
        this.replyAllAllowed = value;
    }

    /**
     * Ruft den Wert der forwardAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForwardAllowed() {
        return forwardAllowed;
    }

    /**
     * Legt den Wert der forwardAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForwardAllowed(Boolean value) {
        this.forwardAllowed = value;
    }

    /**
     * Ruft den Wert der modifyRecipientsAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModifyRecipientsAllowed() {
        return modifyRecipientsAllowed;
    }

    /**
     * Legt den Wert der modifyRecipientsAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModifyRecipientsAllowed(Boolean value) {
        this.modifyRecipientsAllowed = value;
    }

    /**
     * Ruft den Wert der extractAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtractAllowed() {
        return extractAllowed;
    }

    /**
     * Legt den Wert der extractAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtractAllowed(Boolean value) {
        this.extractAllowed = value;
    }

    /**
     * Ruft den Wert der printAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintAllowed() {
        return printAllowed;
    }

    /**
     * Legt den Wert der printAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintAllowed(Boolean value) {
        this.printAllowed = value;
    }

    /**
     * Ruft den Wert der exportAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExportAllowed() {
        return exportAllowed;
    }

    /**
     * Legt den Wert der exportAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExportAllowed(Boolean value) {
        this.exportAllowed = value;
    }

    /**
     * Ruft den Wert der programmaticAccessAllowed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProgrammaticAccessAllowed() {
        return programmaticAccessAllowed;
    }

    /**
     * Legt den Wert der programmaticAccessAllowed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProgrammaticAccessAllowed(Boolean value) {
        this.programmaticAccessAllowed = value;
    }

    /**
     * Ruft den Wert der isOwner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOwner() {
        return isOwner;
    }

    /**
     * Legt den Wert der isOwner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOwner(Boolean value) {
        this.isOwner = value;
    }

    /**
     * Ruft den Wert der contentOwner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentOwner() {
        return contentOwner;
    }

    /**
     * Legt den Wert der contentOwner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentOwner(String value) {
        this.contentOwner = value;
    }

    /**
     * Ruft den Wert der contentExpiryDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentExpiryDate() {
        return contentExpiryDate;
    }

    /**
     * Legt den Wert der contentExpiryDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentExpiryDate(String value) {
        this.contentExpiryDate = value;
    }

}
