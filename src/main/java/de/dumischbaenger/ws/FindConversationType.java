
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindConversationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindConversationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="IndexedPageItemView" type="{http://schemas.microsoft.com/exchange/services/2006/types}IndexedPageViewType"/&gt;
 *           &lt;element name="SeekToConditionPageItemView" type="{http://schemas.microsoft.com/exchange/services/2006/types}SeekToConditionPageViewType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="SortOrder" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfFieldOrdersType" minOccurs="0"/&gt;
 *         &lt;element name="ParentFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType"/&gt;
 *         &lt;element name="MailboxScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxSearchLocationType" minOccurs="0"/&gt;
 *         &lt;element name="QueryString" type="{http://schemas.microsoft.com/exchange/services/2006/messages}QueryStringType" minOccurs="0"/&gt;
 *         &lt;element name="ConversationShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationResponseShapeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Traversal" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationQueryTraversalType" /&gt;
 *       &lt;attribute name="ViewFilter" type="{http://schemas.microsoft.com/exchange/services/2006/types}ViewFilterType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindConversationType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "indexedPageItemView",
    "seekToConditionPageItemView",
    "sortOrder",
    "parentFolderId",
    "mailboxScope",
    "queryString",
    "conversationShape"
})
public class FindConversationType
    extends BaseRequestType
{

    @XmlElement(name = "IndexedPageItemView")
    protected IndexedPageViewType indexedPageItemView;
    @XmlElement(name = "SeekToConditionPageItemView")
    protected SeekToConditionPageViewType seekToConditionPageItemView;
    @XmlElement(name = "SortOrder")
    protected NonEmptyArrayOfFieldOrdersType sortOrder;
    @XmlElement(name = "ParentFolderId", required = true)
    protected TargetFolderIdType parentFolderId;
    @XmlElement(name = "MailboxScope")
    @XmlSchemaType(name = "string")
    protected MailboxSearchLocationType mailboxScope;
    @XmlElement(name = "QueryString")
    protected QueryStringType queryString;
    @XmlElement(name = "ConversationShape")
    protected ConversationResponseShapeType conversationShape;
    @XmlAttribute(name = "Traversal")
    protected ConversationQueryTraversalType traversal;
    @XmlAttribute(name = "ViewFilter")
    protected ViewFilterType viewFilter;

    /**
     * Ruft den Wert der indexedPageItemView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndexedPageViewType }
     *     
     */
    public IndexedPageViewType getIndexedPageItemView() {
        return indexedPageItemView;
    }

    /**
     * Legt den Wert der indexedPageItemView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexedPageViewType }
     *     
     */
    public void setIndexedPageItemView(IndexedPageViewType value) {
        this.indexedPageItemView = value;
    }

    /**
     * Ruft den Wert der seekToConditionPageItemView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SeekToConditionPageViewType }
     *     
     */
    public SeekToConditionPageViewType getSeekToConditionPageItemView() {
        return seekToConditionPageItemView;
    }

    /**
     * Legt den Wert der seekToConditionPageItemView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SeekToConditionPageViewType }
     *     
     */
    public void setSeekToConditionPageItemView(SeekToConditionPageViewType value) {
        this.seekToConditionPageItemView = value;
    }

    /**
     * Ruft den Wert der sortOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfFieldOrdersType }
     *     
     */
    public NonEmptyArrayOfFieldOrdersType getSortOrder() {
        return sortOrder;
    }

    /**
     * Legt den Wert der sortOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfFieldOrdersType }
     *     
     */
    public void setSortOrder(NonEmptyArrayOfFieldOrdersType value) {
        this.sortOrder = value;
    }

    /**
     * Ruft den Wert der parentFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TargetFolderIdType }
     *     
     */
    public TargetFolderIdType getParentFolderId() {
        return parentFolderId;
    }

    /**
     * Legt den Wert der parentFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetFolderIdType }
     *     
     */
    public void setParentFolderId(TargetFolderIdType value) {
        this.parentFolderId = value;
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
     * Ruft den Wert der queryString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QueryStringType }
     *     
     */
    public QueryStringType getQueryString() {
        return queryString;
    }

    /**
     * Legt den Wert der queryString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryStringType }
     *     
     */
    public void setQueryString(QueryStringType value) {
        this.queryString = value;
    }

    /**
     * Ruft den Wert der conversationShape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConversationResponseShapeType }
     *     
     */
    public ConversationResponseShapeType getConversationShape() {
        return conversationShape;
    }

    /**
     * Legt den Wert der conversationShape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversationResponseShapeType }
     *     
     */
    public void setConversationShape(ConversationResponseShapeType value) {
        this.conversationShape = value;
    }

    /**
     * Ruft den Wert der traversal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConversationQueryTraversalType }
     *     
     */
    public ConversationQueryTraversalType getTraversal() {
        return traversal;
    }

    /**
     * Legt den Wert der traversal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversationQueryTraversalType }
     *     
     */
    public void setTraversal(ConversationQueryTraversalType value) {
        this.traversal = value;
    }

    /**
     * Ruft den Wert der viewFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ViewFilterType }
     *     
     */
    public ViewFilterType getViewFilter() {
        return viewFilter;
    }

    /**
     * Legt den Wert der viewFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewFilterType }
     *     
     */
    public void setViewFilter(ViewFilterType value) {
        this.viewFilter = value;
    }

}
