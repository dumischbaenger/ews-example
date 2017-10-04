
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Rule actions
 * 
 * <p>Java-Klasse für RuleActionsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RuleActionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssignCategories" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="CopyToFolder" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType" minOccurs="0"/&gt;
 *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForwardAsAttachmentToRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressesType" minOccurs="0"/&gt;
 *         &lt;element name="ForwardToRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressesType" minOccurs="0"/&gt;
 *         &lt;element name="MarkImportance" type="{http://schemas.microsoft.com/exchange/services/2006/types}ImportanceChoicesType" minOccurs="0"/&gt;
 *         &lt;element name="MarkAsRead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MoveToFolder" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType" minOccurs="0"/&gt;
 *         &lt;element name="PermanentDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RedirectToRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressesType" minOccurs="0"/&gt;
 *         &lt;element name="SendSMSAlertToRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEmailAddressesType" minOccurs="0"/&gt;
 *         &lt;element name="ServerReplyWithMessage" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/&gt;
 *         &lt;element name="StopProcessingRules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleActionsType", propOrder = {
    "assignCategories",
    "copyToFolder",
    "delete",
    "forwardAsAttachmentToRecipients",
    "forwardToRecipients",
    "markImportance",
    "markAsRead",
    "moveToFolder",
    "permanentDelete",
    "redirectToRecipients",
    "sendSMSAlertToRecipients",
    "serverReplyWithMessage",
    "stopProcessingRules"
})
public class RuleActionsType {

    @XmlElement(name = "AssignCategories")
    protected ArrayOfStringsType assignCategories;
    @XmlElement(name = "CopyToFolder")
    protected TargetFolderIdType copyToFolder;
    @XmlElement(name = "Delete")
    protected Boolean delete;
    @XmlElement(name = "ForwardAsAttachmentToRecipients")
    protected ArrayOfEmailAddressesType forwardAsAttachmentToRecipients;
    @XmlElement(name = "ForwardToRecipients")
    protected ArrayOfEmailAddressesType forwardToRecipients;
    @XmlElement(name = "MarkImportance")
    @XmlSchemaType(name = "string")
    protected ImportanceChoicesType markImportance;
    @XmlElement(name = "MarkAsRead")
    protected Boolean markAsRead;
    @XmlElement(name = "MoveToFolder")
    protected TargetFolderIdType moveToFolder;
    @XmlElement(name = "PermanentDelete")
    protected Boolean permanentDelete;
    @XmlElement(name = "RedirectToRecipients")
    protected ArrayOfEmailAddressesType redirectToRecipients;
    @XmlElement(name = "SendSMSAlertToRecipients")
    protected ArrayOfEmailAddressesType sendSMSAlertToRecipients;
    @XmlElement(name = "ServerReplyWithMessage")
    protected ItemIdType serverReplyWithMessage;
    @XmlElement(name = "StopProcessingRules")
    protected Boolean stopProcessingRules;

    /**
     * Ruft den Wert der assignCategories-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getAssignCategories() {
        return assignCategories;
    }

    /**
     * Legt den Wert der assignCategories-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setAssignCategories(ArrayOfStringsType value) {
        this.assignCategories = value;
    }

    /**
     * Ruft den Wert der copyToFolder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TargetFolderIdType }
     *     
     */
    public TargetFolderIdType getCopyToFolder() {
        return copyToFolder;
    }

    /**
     * Legt den Wert der copyToFolder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetFolderIdType }
     *     
     */
    public void setCopyToFolder(TargetFolderIdType value) {
        this.copyToFolder = value;
    }

    /**
     * Ruft den Wert der delete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelete() {
        return delete;
    }

    /**
     * Legt den Wert der delete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelete(Boolean value) {
        this.delete = value;
    }

    /**
     * Ruft den Wert der forwardAsAttachmentToRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public ArrayOfEmailAddressesType getForwardAsAttachmentToRecipients() {
        return forwardAsAttachmentToRecipients;
    }

    /**
     * Legt den Wert der forwardAsAttachmentToRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public void setForwardAsAttachmentToRecipients(ArrayOfEmailAddressesType value) {
        this.forwardAsAttachmentToRecipients = value;
    }

    /**
     * Ruft den Wert der forwardToRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public ArrayOfEmailAddressesType getForwardToRecipients() {
        return forwardToRecipients;
    }

    /**
     * Legt den Wert der forwardToRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public void setForwardToRecipients(ArrayOfEmailAddressesType value) {
        this.forwardToRecipients = value;
    }

    /**
     * Ruft den Wert der markImportance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ImportanceChoicesType }
     *     
     */
    public ImportanceChoicesType getMarkImportance() {
        return markImportance;
    }

    /**
     * Legt den Wert der markImportance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ImportanceChoicesType }
     *     
     */
    public void setMarkImportance(ImportanceChoicesType value) {
        this.markImportance = value;
    }

    /**
     * Ruft den Wert der markAsRead-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarkAsRead() {
        return markAsRead;
    }

    /**
     * Legt den Wert der markAsRead-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkAsRead(Boolean value) {
        this.markAsRead = value;
    }

    /**
     * Ruft den Wert der moveToFolder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TargetFolderIdType }
     *     
     */
    public TargetFolderIdType getMoveToFolder() {
        return moveToFolder;
    }

    /**
     * Legt den Wert der moveToFolder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetFolderIdType }
     *     
     */
    public void setMoveToFolder(TargetFolderIdType value) {
        this.moveToFolder = value;
    }

    /**
     * Ruft den Wert der permanentDelete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermanentDelete() {
        return permanentDelete;
    }

    /**
     * Legt den Wert der permanentDelete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermanentDelete(Boolean value) {
        this.permanentDelete = value;
    }

    /**
     * Ruft den Wert der redirectToRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public ArrayOfEmailAddressesType getRedirectToRecipients() {
        return redirectToRecipients;
    }

    /**
     * Legt den Wert der redirectToRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public void setRedirectToRecipients(ArrayOfEmailAddressesType value) {
        this.redirectToRecipients = value;
    }

    /**
     * Ruft den Wert der sendSMSAlertToRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public ArrayOfEmailAddressesType getSendSMSAlertToRecipients() {
        return sendSMSAlertToRecipients;
    }

    /**
     * Legt den Wert der sendSMSAlertToRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmailAddressesType }
     *     
     */
    public void setSendSMSAlertToRecipients(ArrayOfEmailAddressesType value) {
        this.sendSMSAlertToRecipients = value;
    }

    /**
     * Ruft den Wert der serverReplyWithMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getServerReplyWithMessage() {
        return serverReplyWithMessage;
    }

    /**
     * Legt den Wert der serverReplyWithMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setServerReplyWithMessage(ItemIdType value) {
        this.serverReplyWithMessage = value;
    }

    /**
     * Ruft den Wert der stopProcessingRules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStopProcessingRules() {
        return stopProcessingRules;
    }

    /**
     * Legt den Wert der stopProcessingRules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopProcessingRules(Boolean value) {
        this.stopProcessingRules = value;
    }

}
