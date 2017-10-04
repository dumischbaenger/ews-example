
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetConversationItemsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetConversationItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemResponseShapeType"/&gt;
 *         &lt;element name="FoldersToIgnore" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseFolderIdsType" minOccurs="0"/&gt;
 *         &lt;element name="MaxItemsToReturn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SortOrder" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationNodeSortOrder" minOccurs="0"/&gt;
 *         &lt;element name="MailboxScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxSearchLocationType" minOccurs="0"/&gt;
 *         &lt;element name="Conversations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfConversationRequestsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetConversationItemsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "itemShape",
    "foldersToIgnore",
    "maxItemsToReturn",
    "sortOrder",
    "mailboxScope",
    "conversations"
})
public class GetConversationItemsType
    extends BaseRequestType
{

    @XmlElement(name = "ItemShape", required = true)
    protected ItemResponseShapeType itemShape;
    @XmlElement(name = "FoldersToIgnore")
    protected NonEmptyArrayOfBaseFolderIdsType foldersToIgnore;
    @XmlElement(name = "MaxItemsToReturn")
    protected Integer maxItemsToReturn;
    @XmlElement(name = "SortOrder")
    @XmlSchemaType(name = "string")
    protected ConversationNodeSortOrder sortOrder;
    @XmlElement(name = "MailboxScope")
    @XmlSchemaType(name = "string")
    protected MailboxSearchLocationType mailboxScope;
    @XmlElement(name = "Conversations", required = true)
    protected ArrayOfConversationRequestsType conversations;

    /**
     * Ruft den Wert der itemShape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemResponseShapeType }
     *     
     */
    public ItemResponseShapeType getItemShape() {
        return itemShape;
    }

    /**
     * Legt den Wert der itemShape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemResponseShapeType }
     *     
     */
    public void setItemShape(ItemResponseShapeType value) {
        this.itemShape = value;
    }

    /**
     * Ruft den Wert der foldersToIgnore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public NonEmptyArrayOfBaseFolderIdsType getFoldersToIgnore() {
        return foldersToIgnore;
    }

    /**
     * Legt den Wert der foldersToIgnore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public void setFoldersToIgnore(NonEmptyArrayOfBaseFolderIdsType value) {
        this.foldersToIgnore = value;
    }

    /**
     * Ruft den Wert der maxItemsToReturn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxItemsToReturn() {
        return maxItemsToReturn;
    }

    /**
     * Legt den Wert der maxItemsToReturn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxItemsToReturn(Integer value) {
        this.maxItemsToReturn = value;
    }

    /**
     * Ruft den Wert der sortOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConversationNodeSortOrder }
     *     
     */
    public ConversationNodeSortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * Legt den Wert der sortOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversationNodeSortOrder }
     *     
     */
    public void setSortOrder(ConversationNodeSortOrder value) {
        this.sortOrder = value;
    }

    /**
     * Ruft den Wert der mailboxScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MailboxSearchLocationType }
     *     
     */
    public MailboxSearchLocationType getMailboxScope() {
        return mailboxScope;
    }

    /**
     * Legt den Wert der mailboxScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MailboxSearchLocationType }
     *     
     */
    public void setMailboxScope(MailboxSearchLocationType value) {
        this.mailboxScope = value;
    }

    /**
     * Ruft den Wert der conversations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConversationRequestsType }
     *     
     */
    public ArrayOfConversationRequestsType getConversations() {
        return conversations;
    }

    /**
     * Legt den Wert der conversations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConversationRequestsType }
     *     
     */
    public void setConversations(ArrayOfConversationRequestsType value) {
        this.conversations = value;
    }

}
