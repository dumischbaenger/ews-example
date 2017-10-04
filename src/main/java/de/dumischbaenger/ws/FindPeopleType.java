
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r FindPeopleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindPeopleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonaShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaResponseShapeType" minOccurs="0"/&gt;
 *         &lt;element name="IndexedPageItemView" type="{http://schemas.microsoft.com/exchange/services/2006/types}IndexedPageViewType"/&gt;
 *         &lt;element name="Restriction" type="{http://schemas.microsoft.com/exchange/services/2006/types}RestrictionType" minOccurs="0"/&gt;
 *         &lt;element name="AggregationRestriction" type="{http://schemas.microsoft.com/exchange/services/2006/types}RestrictionType" minOccurs="0"/&gt;
 *         &lt;element name="SortOrder" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfFieldOrdersType" minOccurs="0"/&gt;
 *         &lt;element name="ParentFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType" minOccurs="0"/&gt;
 *         &lt;element name="QueryString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SearchPeopleSuggestionIndex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TopicQueryString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Context" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfContextProperty" minOccurs="0"/&gt;
 *         &lt;element name="QuerySources" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPeopleQuerySource" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindPeopleType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "personaShape",
    "indexedPageItemView",
    "restriction",
    "aggregationRestriction",
    "sortOrder",
    "parentFolderId",
    "queryString",
    "searchPeopleSuggestionIndex",
    "topicQueryString",
    "context",
    "querySources"
})
public class FindPeopleType
    extends BaseRequestType
{

    @XmlElement(name = "PersonaShape")
    protected PersonaResponseShapeType personaShape;
    @XmlElement(name = "IndexedPageItemView", required = true)
    protected IndexedPageViewType indexedPageItemView;
    @XmlElement(name = "Restriction")
    protected RestrictionType restriction;
    @XmlElement(name = "AggregationRestriction")
    protected RestrictionType aggregationRestriction;
    @XmlElement(name = "SortOrder")
    protected NonEmptyArrayOfFieldOrdersType sortOrder;
    @XmlElement(name = "ParentFolderId")
    protected TargetFolderIdType parentFolderId;
    @XmlElement(name = "QueryString")
    protected String queryString;
    @XmlElement(name = "SearchPeopleSuggestionIndex")
    protected Boolean searchPeopleSuggestionIndex;
    @XmlElement(name = "TopicQueryString")
    protected String topicQueryString;
    @XmlElement(name = "Context")
    protected ArrayOfContextProperty context;
    @XmlElement(name = "QuerySources")
    protected ArrayOfPeopleQuerySource querySources;

    /**
     * Ruft den Wert der personaShape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonaResponseShapeType }
     *     
     */
    public PersonaResponseShapeType getPersonaShape() {
        return personaShape;
    }

    /**
     * Legt den Wert der personaShape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaResponseShapeType }
     *     
     */
    public void setPersonaShape(PersonaResponseShapeType value) {
        this.personaShape = value;
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
     * Ruft den Wert der aggregationRestriction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType }
     *     
     */
    public RestrictionType getAggregationRestriction() {
        return aggregationRestriction;
    }

    /**
     * Legt den Wert der aggregationRestriction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType }
     *     
     */
    public void setAggregationRestriction(RestrictionType value) {
        this.aggregationRestriction = value;
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
     * Ruft den Wert der queryString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * Legt den Wert der queryString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryString(String value) {
        this.queryString = value;
    }

    /**
     * Ruft den Wert der searchPeopleSuggestionIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchPeopleSuggestionIndex() {
        return searchPeopleSuggestionIndex;
    }

    /**
     * Legt den Wert der searchPeopleSuggestionIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchPeopleSuggestionIndex(Boolean value) {
        this.searchPeopleSuggestionIndex = value;
    }

    /**
     * Ruft den Wert der topicQueryString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopicQueryString() {
        return topicQueryString;
    }

    /**
     * Legt den Wert der topicQueryString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopicQueryString(String value) {
        this.topicQueryString = value;
    }

    /**
     * Ruft den Wert der context-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContextProperty }
     *     
     */
    public ArrayOfContextProperty getContext() {
        return context;
    }

    /**
     * Legt den Wert der context-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContextProperty }
     *     
     */
    public void setContext(ArrayOfContextProperty value) {
        this.context = value;
    }

    /**
     * Ruft den Wert der querySources-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPeopleQuerySource }
     *     
     */
    public ArrayOfPeopleQuerySource getQuerySources() {
        return querySources;
    }

    /**
     * Legt den Wert der querySources-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPeopleQuerySource }
     *     
     */
    public void setQuerySources(ArrayOfPeopleQuerySource value) {
        this.querySources = value;
    }

}
