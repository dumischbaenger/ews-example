
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UpdateItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UpdateItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SavedItemFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType" minOccurs="0"/&gt;
 *         &lt;element name="ItemChanges" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfItemChangesType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ConflictResolution" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConflictResolutionType" /&gt;
 *       &lt;attribute name="MessageDisposition" type="{http://schemas.microsoft.com/exchange/services/2006/types}MessageDispositionType" /&gt;
 *       &lt;attribute name="SendMeetingInvitationsOrCancellations" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarItemUpdateOperationType" /&gt;
 *       &lt;attribute name="SuppressReadReceipts" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateItemType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "savedItemFolderId",
    "itemChanges"
})
public class UpdateItemType
    extends BaseRequestType
{

    @XmlElement(name = "SavedItemFolderId")
    protected TargetFolderIdType savedItemFolderId;
    @XmlElement(name = "ItemChanges", required = true)
    protected NonEmptyArrayOfItemChangesType itemChanges;
    @XmlAttribute(name = "ConflictResolution", required = true)
    protected ConflictResolutionType conflictResolution;
    @XmlAttribute(name = "MessageDisposition")
    protected MessageDispositionType messageDisposition;
    @XmlAttribute(name = "SendMeetingInvitationsOrCancellations")
    protected CalendarItemUpdateOperationType sendMeetingInvitationsOrCancellations;
    @XmlAttribute(name = "SuppressReadReceipts")
    protected Boolean suppressReadReceipts;

    /**
     * Ruft den Wert der savedItemFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TargetFolderIdType }
     *     
     */
    public TargetFolderIdType getSavedItemFolderId() {
        return savedItemFolderId;
    }

    /**
     * Legt den Wert der savedItemFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetFolderIdType }
     *     
     */
    public void setSavedItemFolderId(TargetFolderIdType value) {
        this.savedItemFolderId = value;
    }

    /**
     * Ruft den Wert der itemChanges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfItemChangesType }
     *     
     */
    public NonEmptyArrayOfItemChangesType getItemChanges() {
        return itemChanges;
    }

    /**
     * Legt den Wert der itemChanges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfItemChangesType }
     *     
     */
    public void setItemChanges(NonEmptyArrayOfItemChangesType value) {
        this.itemChanges = value;
    }

    /**
     * Ruft den Wert der conflictResolution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConflictResolutionType }
     *     
     */
    public ConflictResolutionType getConflictResolution() {
        return conflictResolution;
    }

    /**
     * Legt den Wert der conflictResolution-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConflictResolutionType }
     *     
     */
    public void setConflictResolution(ConflictResolutionType value) {
        this.conflictResolution = value;
    }

    /**
     * Ruft den Wert der messageDisposition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MessageDispositionType }
     *     
     */
    public MessageDispositionType getMessageDisposition() {
        return messageDisposition;
    }

    /**
     * Legt den Wert der messageDisposition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDispositionType }
     *     
     */
    public void setMessageDisposition(MessageDispositionType value) {
        this.messageDisposition = value;
    }

    /**
     * Ruft den Wert der sendMeetingInvitationsOrCancellations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarItemUpdateOperationType }
     *     
     */
    public CalendarItemUpdateOperationType getSendMeetingInvitationsOrCancellations() {
        return sendMeetingInvitationsOrCancellations;
    }

    /**
     * Legt den Wert der sendMeetingInvitationsOrCancellations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarItemUpdateOperationType }
     *     
     */
    public void setSendMeetingInvitationsOrCancellations(CalendarItemUpdateOperationType value) {
        this.sendMeetingInvitationsOrCancellations = value;
    }

    /**
     * Ruft den Wert der suppressReadReceipts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuppressReadReceipts() {
        return suppressReadReceipts;
    }

    /**
     * Legt den Wert der suppressReadReceipts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressReadReceipts(Boolean value) {
        this.suppressReadReceipts = value;
    }

}
