
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CreateItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CreateItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SavedItemFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType" minOccurs="0"/&gt;
 *         &lt;element name="Items" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfAllItemsType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MessageDisposition" type="{http://schemas.microsoft.com/exchange/services/2006/types}MessageDispositionType" /&gt;
 *       &lt;attribute name="SendMeetingInvitations" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarItemCreateOrDeleteOperationType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateItemType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "savedItemFolderId",
    "items"
})
public class CreateItemType
    extends BaseRequestType
{

    @XmlElement(name = "SavedItemFolderId")
    protected TargetFolderIdType savedItemFolderId;
    @XmlElement(name = "Items", required = true)
    protected NonEmptyArrayOfAllItemsType items;
    @XmlAttribute(name = "MessageDisposition")
    protected MessageDispositionType messageDisposition;
    @XmlAttribute(name = "SendMeetingInvitations")
    protected CalendarItemCreateOrDeleteOperationType sendMeetingInvitations;

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
     * Ruft den Wert der items-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfAllItemsType }
     *     
     */
    public NonEmptyArrayOfAllItemsType getItems() {
        return items;
    }

    /**
     * Legt den Wert der items-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfAllItemsType }
     *     
     */
    public void setItems(NonEmptyArrayOfAllItemsType value) {
        this.items = value;
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
     * Ruft den Wert der sendMeetingInvitations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarItemCreateOrDeleteOperationType }
     *     
     */
    public CalendarItemCreateOrDeleteOperationType getSendMeetingInvitations() {
        return sendMeetingInvitations;
    }

    /**
     * Legt den Wert der sendMeetingInvitations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarItemCreateOrDeleteOperationType }
     *     
     */
    public void setSendMeetingInvitations(CalendarItemCreateOrDeleteOperationType value) {
        this.sendMeetingInvitations = value;
    }

}
