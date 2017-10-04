
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExecuteSearch complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExecuteSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicationId" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchApplicationIdType"/&gt;
 *         &lt;element name="Scenario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SearchSessionId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/&gt;
 *         &lt;element name="SearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSearchScopeType"/&gt;
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AnalyzedQuery" type="{http://schemas.microsoft.com/exchange/services/2006/types}AnalyzedQuery" minOccurs="0"/&gt;
 *         &lt;element name="ResultRowCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ResultRowOffset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MaxResultsCountHint" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="MaxPreviewLength" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="SearchRefiners" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SearchRefiner" type="{http://schemas.microsoft.com/exchange/services/2006/types}DynamicRefinerQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExtendedKeywords" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ExtendedKeywordDefinition" type="{http://schemas.microsoft.com/exchange/services/2006/types}ExtendedKeywordDefinitionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RetrieveRefiners" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MaxRefinersCountPerRefinerType" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IdFormat" type="{http://schemas.microsoft.com/exchange/services/2006/types}IdFormatType" minOccurs="0"/&gt;
 *         &lt;element name="ItemTypes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemTypesFilterType"/&gt;
 *         &lt;element name="PropertySetName" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchResultsPropertySetNameType" minOccurs="0"/&gt;
 *         &lt;element name="SearchRestrictions" type="{http://schemas.microsoft.com/exchange/services/2006/types}RestrictionType" minOccurs="0"/&gt;
 *         &lt;element name="IncludeDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SortOrder" type="{http://schemas.microsoft.com/exchange/services/2006/types}ExecuteSearchSortOrderType" minOccurs="0"/&gt;
 *         &lt;element name="KeywordMatchOption" type="{http://schemas.microsoft.com/exchange/services/2006/types}MatchOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="ReturnAdditionalIds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteSearch", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "applicationId",
    "scenario",
    "searchSessionId",
    "searchScope",
    "query",
    "analyzedQuery",
    "resultRowCount",
    "resultRowOffset",
    "maxResultsCountHint",
    "maxPreviewLength",
    "searchRefiners",
    "extendedKeywords",
    "retrieveRefiners",
    "maxRefinersCountPerRefinerType",
    "idFormat",
    "itemTypes",
    "propertySetName",
    "searchRestrictions",
    "includeDeleted",
    "sortOrder",
    "keywordMatchOption",
    "returnAdditionalIds"
})
public class ExecuteSearch
    extends BaseRequestType
{

    @XmlElement(name = "ApplicationId", required = true)
    @XmlSchemaType(name = "string")
    protected SearchApplicationIdType applicationId;
    @XmlElement(name = "Scenario", required = true)
    protected String scenario;
    @XmlElement(name = "SearchSessionId", required = true)
    protected String searchSessionId;
    @XmlElement(name = "SearchScope", required = true)
    protected ArrayOfSearchScopeType searchScope;
    @XmlElement(name = "Query", required = true)
    protected String query;
    @XmlElement(name = "AnalyzedQuery")
    protected AnalyzedQuery analyzedQuery;
    @XmlElement(name = "ResultRowCount")
    protected Long resultRowCount;
    @XmlElement(name = "ResultRowOffset")
    protected Long resultRowOffset;
    @XmlElement(name = "MaxResultsCountHint")
    protected Long maxResultsCountHint;
    @XmlElement(name = "MaxPreviewLength")
    protected Long maxPreviewLength;
    @XmlElement(name = "SearchRefiners")
    protected ExecuteSearch.SearchRefiners searchRefiners;
    @XmlElement(name = "ExtendedKeywords")
    protected ExecuteSearch.ExtendedKeywords extendedKeywords;
    @XmlElement(name = "RetrieveRefiners")
    protected Boolean retrieveRefiners;
    @XmlElement(name = "MaxRefinersCountPerRefinerType")
    protected Long maxRefinersCountPerRefinerType;
    @XmlElement(name = "IdFormat")
    @XmlSchemaType(name = "string")
    protected IdFormatType idFormat;
    @XmlList
    @XmlElement(name = "ItemTypes", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> itemTypes;
    @XmlElement(name = "PropertySetName")
    @XmlSchemaType(name = "string")
    protected SearchResultsPropertySetNameType propertySetName;
    @XmlElement(name = "SearchRestrictions")
    protected RestrictionType searchRestrictions;
    @XmlElement(name = "IncludeDeleted")
    protected Boolean includeDeleted;
    @XmlElement(name = "SortOrder")
    @XmlSchemaType(name = "string")
    protected ExecuteSearchSortOrderType sortOrder;
    @XmlElement(name = "KeywordMatchOption", defaultValue = "Prefix")
    @XmlSchemaType(name = "string")
    protected MatchOptionsType keywordMatchOption;
    @XmlElement(name = "ReturnAdditionalIds")
    protected Boolean returnAdditionalIds;

    /**
     * Ruft den Wert der applicationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchApplicationIdType }
     *     
     */
    public SearchApplicationIdType getApplicationId() {
        return applicationId;
    }

    /**
     * Legt den Wert der applicationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchApplicationIdType }
     *     
     */
    public void setApplicationId(SearchApplicationIdType value) {
        this.applicationId = value;
    }

    /**
     * Ruft den Wert der scenario-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScenario() {
        return scenario;
    }

    /**
     * Legt den Wert der scenario-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScenario(String value) {
        this.scenario = value;
    }

    /**
     * Ruft den Wert der searchSessionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchSessionId() {
        return searchSessionId;
    }

    /**
     * Legt den Wert der searchSessionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchSessionId(String value) {
        this.searchSessionId = value;
    }

    /**
     * Ruft den Wert der searchScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchScopeType }
     *     
     */
    public ArrayOfSearchScopeType getSearchScope() {
        return searchScope;
    }

    /**
     * Legt den Wert der searchScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchScopeType }
     *     
     */
    public void setSearchScope(ArrayOfSearchScopeType value) {
        this.searchScope = value;
    }

    /**
     * Ruft den Wert der query-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Legt den Wert der query-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Ruft den Wert der analyzedQuery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnalyzedQuery }
     *     
     */
    public AnalyzedQuery getAnalyzedQuery() {
        return analyzedQuery;
    }

    /**
     * Legt den Wert der analyzedQuery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalyzedQuery }
     *     
     */
    public void setAnalyzedQuery(AnalyzedQuery value) {
        this.analyzedQuery = value;
    }

    /**
     * Ruft den Wert der resultRowCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResultRowCount() {
        return resultRowCount;
    }

    /**
     * Legt den Wert der resultRowCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResultRowCount(Long value) {
        this.resultRowCount = value;
    }

    /**
     * Ruft den Wert der resultRowOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getResultRowOffset() {
        return resultRowOffset;
    }

    /**
     * Legt den Wert der resultRowOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setResultRowOffset(Long value) {
        this.resultRowOffset = value;
    }

    /**
     * Ruft den Wert der maxResultsCountHint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxResultsCountHint() {
        return maxResultsCountHint;
    }

    /**
     * Legt den Wert der maxResultsCountHint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxResultsCountHint(Long value) {
        this.maxResultsCountHint = value;
    }

    /**
     * Ruft den Wert der maxPreviewLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxPreviewLength() {
        return maxPreviewLength;
    }

    /**
     * Legt den Wert der maxPreviewLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxPreviewLength(Long value) {
        this.maxPreviewLength = value;
    }

    /**
     * Ruft den Wert der searchRefiners-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteSearch.SearchRefiners }
     *     
     */
    public ExecuteSearch.SearchRefiners getSearchRefiners() {
        return searchRefiners;
    }

    /**
     * Legt den Wert der searchRefiners-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteSearch.SearchRefiners }
     *     
     */
    public void setSearchRefiners(ExecuteSearch.SearchRefiners value) {
        this.searchRefiners = value;
    }

    /**
     * Ruft den Wert der extendedKeywords-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteSearch.ExtendedKeywords }
     *     
     */
    public ExecuteSearch.ExtendedKeywords getExtendedKeywords() {
        return extendedKeywords;
    }

    /**
     * Legt den Wert der extendedKeywords-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteSearch.ExtendedKeywords }
     *     
     */
    public void setExtendedKeywords(ExecuteSearch.ExtendedKeywords value) {
        this.extendedKeywords = value;
    }

    /**
     * Ruft den Wert der retrieveRefiners-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveRefiners() {
        return retrieveRefiners;
    }

    /**
     * Legt den Wert der retrieveRefiners-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveRefiners(Boolean value) {
        this.retrieveRefiners = value;
    }

    /**
     * Ruft den Wert der maxRefinersCountPerRefinerType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxRefinersCountPerRefinerType() {
        return maxRefinersCountPerRefinerType;
    }

    /**
     * Legt den Wert der maxRefinersCountPerRefinerType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxRefinersCountPerRefinerType(Long value) {
        this.maxRefinersCountPerRefinerType = value;
    }

    /**
     * Ruft den Wert der idFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdFormatType }
     *     
     */
    public IdFormatType getIdFormat() {
        return idFormat;
    }

    /**
     * Legt den Wert der idFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdFormatType }
     *     
     */
    public void setIdFormat(IdFormatType value) {
        this.idFormat = value;
    }

    /**
     * Gets the value of the itemTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getItemTypes() {
        if (itemTypes == null) {
            itemTypes = new ArrayList<String>();
        }
        return this.itemTypes;
    }

    /**
     * Ruft den Wert der propertySetName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultsPropertySetNameType }
     *     
     */
    public SearchResultsPropertySetNameType getPropertySetName() {
        return propertySetName;
    }

    /**
     * Legt den Wert der propertySetName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultsPropertySetNameType }
     *     
     */
    public void setPropertySetName(SearchResultsPropertySetNameType value) {
        this.propertySetName = value;
    }

    /**
     * Ruft den Wert der searchRestrictions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType }
     *     
     */
    public RestrictionType getSearchRestrictions() {
        return searchRestrictions;
    }

    /**
     * Legt den Wert der searchRestrictions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType }
     *     
     */
    public void setSearchRestrictions(RestrictionType value) {
        this.searchRestrictions = value;
    }

    /**
     * Ruft den Wert der includeDeleted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDeleted() {
        return includeDeleted;
    }

    /**
     * Legt den Wert der includeDeleted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDeleted(Boolean value) {
        this.includeDeleted = value;
    }

    /**
     * Ruft den Wert der sortOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteSearchSortOrderType }
     *     
     */
    public ExecuteSearchSortOrderType getSortOrder() {
        return sortOrder;
    }

    /**
     * Legt den Wert der sortOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteSearchSortOrderType }
     *     
     */
    public void setSortOrder(ExecuteSearchSortOrderType value) {
        this.sortOrder = value;
    }

    /**
     * Ruft den Wert der keywordMatchOption-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MatchOptionsType }
     *     
     */
    public MatchOptionsType getKeywordMatchOption() {
        return keywordMatchOption;
    }

    /**
     * Legt den Wert der keywordMatchOption-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchOptionsType }
     *     
     */
    public void setKeywordMatchOption(MatchOptionsType value) {
        this.keywordMatchOption = value;
    }

    /**
     * Ruft den Wert der returnAdditionalIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnAdditionalIds() {
        return returnAdditionalIds;
    }

    /**
     * Legt den Wert der returnAdditionalIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnAdditionalIds(Boolean value) {
        this.returnAdditionalIds = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ExtendedKeywordDefinition" type="{http://schemas.microsoft.com/exchange/services/2006/types}ExtendedKeywordDefinitionType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "extendedKeywordDefinition"
    })
    public static class ExtendedKeywords {

        @XmlElement(name = "ExtendedKeywordDefinition", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages")
        protected List<ExtendedKeywordDefinitionType> extendedKeywordDefinition;

        /**
         * Gets the value of the extendedKeywordDefinition property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the extendedKeywordDefinition property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExtendedKeywordDefinition().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExtendedKeywordDefinitionType }
         * 
         * 
         */
        public List<ExtendedKeywordDefinitionType> getExtendedKeywordDefinition() {
            if (extendedKeywordDefinition == null) {
                extendedKeywordDefinition = new ArrayList<ExtendedKeywordDefinitionType>();
            }
            return this.extendedKeywordDefinition;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SearchRefiner" type="{http://schemas.microsoft.com/exchange/services/2006/types}DynamicRefinerQueryType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "searchRefiner"
    })
    public static class SearchRefiners {

        @XmlElement(name = "SearchRefiner", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages")
        protected List<DynamicRefinerQueryType> searchRefiner;

        /**
         * Gets the value of the searchRefiner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchRefiner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchRefiner().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DynamicRefinerQueryType }
         * 
         * 
         */
        public List<DynamicRefinerQueryType> getSearchRefiner() {
            if (searchRefiner == null) {
                searchRefiner = new ArrayList<DynamicRefinerQueryType>();
            }
            return this.searchRefiner;
        }

    }

}
