
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemResponseShapeType"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="IndexedPageItemView" type="{http://schemas.microsoft.com/exchange/services/2006/types}IndexedPageViewType"/&gt;
 *           &lt;element name="FractionalPageItemView" type="{http://schemas.microsoft.com/exchange/services/2006/types}FractionalPageViewType"/&gt;
 *           &lt;element name="SeekToConditionPageItemView" type="{http://schemas.microsoft.com/exchange/services/2006/types}SeekToConditionPageViewType"/&gt;
 *           &lt;element name="CalendarView" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarViewType"/&gt;
 *           &lt;element name="ContactsView" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContactsViewType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="GroupBy" type="{http://schemas.microsoft.com/exchange/services/2006/types}GroupByType"/&gt;
 *           &lt;element name="DistinguishedGroupBy" type="{http://schemas.microsoft.com/exchange/services/2006/types}DistinguishedGroupByType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Restriction" type="{http://schemas.microsoft.com/exchange/services/2006/types}RestrictionType" minOccurs="0"/&gt;
 *         &lt;element name="SortOrder" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfFieldOrdersType" minOccurs="0"/&gt;
 *         &lt;element name="ParentFolderIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfBaseFolderIdsType"/&gt;
 *         &lt;element name="QueryString" type="{http://schemas.microsoft.com/exchange/services/2006/messages}QueryStringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Traversal" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemQueryTraversalType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindItemType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "itemShape",
    "indexedPageItemView",
    "fractionalPageItemView",
    "seekToConditionPageItemView",
    "calendarView",
    "contactsView",
    "groupBy",
    "distinguishedGroupBy",
    "restriction",
    "sortOrder",
    "parentFolderIds",
    "queryString"
})
public class FindItemType
    extends BaseRequestType
{

    @XmlElement(name = "ItemShape", required = true)
    protected ItemResponseShapeType itemShape;
    @XmlElement(name = "IndexedPageItemView")
    protected IndexedPageViewType indexedPageItemView;
    @XmlElement(name = "FractionalPageItemView")
    protected FractionalPageViewType fractionalPageItemView;
    @XmlElement(name = "SeekToConditionPageItemView")
    protected SeekToConditionPageViewType seekToConditionPageItemView;
    @XmlElement(name = "CalendarView")
    protected CalendarViewType calendarView;
    @XmlElement(name = "ContactsView")
    protected ContactsViewType contactsView;
    @XmlElement(name = "GroupBy")
    protected GroupByType groupBy;
    @XmlElement(name = "DistinguishedGroupBy")
    protected DistinguishedGroupByType distinguishedGroupBy;
    @XmlElement(name = "Restriction")
    protected RestrictionType restriction;
    @XmlElement(name = "SortOrder")
    protected NonEmptyArrayOfFieldOrdersType sortOrder;
    @XmlElement(name = "ParentFolderIds", required = true)
    protected NonEmptyArrayOfBaseFolderIdsType parentFolderIds;
    @XmlElement(name = "QueryString")
    protected QueryStringType queryString;
    @XmlAttribute(name = "Traversal", required = true)
    protected ItemQueryTraversalType traversal;

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
     * Ruft den Wert der fractionalPageItemView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FractionalPageViewType }
     *     
     */
    public FractionalPageViewType getFractionalPageItemView() {
        return fractionalPageItemView;
    }

    /**
     * Legt den Wert der fractionalPageItemView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionalPageViewType }
     *     
     */
    public void setFractionalPageItemView(FractionalPageViewType value) {
        this.fractionalPageItemView = value;
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
     * Ruft den Wert der calendarView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CalendarViewType }
     *     
     */
    public CalendarViewType getCalendarView() {
        return calendarView;
    }

    /**
     * Legt den Wert der calendarView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarViewType }
     *     
     */
    public void setCalendarView(CalendarViewType value) {
        this.calendarView = value;
    }

    /**
     * Ruft den Wert der contactsView-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactsViewType }
     *     
     */
    public ContactsViewType getContactsView() {
        return contactsView;
    }

    /**
     * Legt den Wert der contactsView-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactsViewType }
     *     
     */
    public void setContactsView(ContactsViewType value) {
        this.contactsView = value;
    }

    /**
     * Ruft den Wert der groupBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupByType }
     *     
     */
    public GroupByType getGroupBy() {
        return groupBy;
    }

    /**
     * Legt den Wert der groupBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupByType }
     *     
     */
    public void setGroupBy(GroupByType value) {
        this.groupBy = value;
    }

    /**
     * Ruft den Wert der distinguishedGroupBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedGroupByType }
     *     
     */
    public DistinguishedGroupByType getDistinguishedGroupBy() {
        return distinguishedGroupBy;
    }

    /**
     * Legt den Wert der distinguishedGroupBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedGroupByType }
     *     
     */
    public void setDistinguishedGroupBy(DistinguishedGroupByType value) {
        this.distinguishedGroupBy = value;
    }

    /**
     * Ruft den Wert der restriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType }
     *     
     */
    public RestrictionType getRestriction() {
        return restriction;
    }

    /**
     * Legt den Wert der restriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType }
     *     
     */
    public void setRestriction(RestrictionType value) {
        this.restriction = value;
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
     * Ruft den Wert der parentFolderIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public NonEmptyArrayOfBaseFolderIdsType getParentFolderIds() {
        return parentFolderIds;
    }

    /**
     * Legt den Wert der parentFolderIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfBaseFolderIdsType }
     *     
     */
    public void setParentFolderIds(NonEmptyArrayOfBaseFolderIdsType value) {
        this.parentFolderIds = value;
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
     * Ruft den Wert der traversal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemQueryTraversalType }
     *     
     */
    public ItemQueryTraversalType getTraversal() {
        return traversal;
    }

    /**
     * Legt den Wert der traversal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemQueryTraversalType }
     *     
     */
    public void setTraversal(ItemQueryTraversalType value) {
        this.traversal = value;
    }

}
