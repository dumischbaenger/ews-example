
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Request type for the SearchMailboxes web method.
 *         
 * 
 * <p>Java-Klasse für SearchMailboxesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchMailboxesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchQueries" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfMailboxQueriesType"/&gt;
 *         &lt;element name="ResultType" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchResultType"/&gt;
 *         &lt;element name="PreviewItemResponseShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}PreviewItemResponseShapeType" minOccurs="0"/&gt;
 *         &lt;element name="SortBy" type="{http://schemas.microsoft.com/exchange/services/2006/types}FieldOrderType" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Deduplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PageItemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PageDirection" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchPageDirectionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchMailboxesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchQueries",
    "resultType",
    "previewItemResponseShape",
    "sortBy",
    "language",
    "deduplication",
    "pageSize",
    "pageItemReference",
    "pageDirection"
})
public class SearchMailboxesType
    extends BaseRequestType
{

    @XmlElement(name = "SearchQueries", required = true)
    protected NonEmptyArrayOfMailboxQueriesType searchQueries;
    @XmlElement(name = "ResultType", required = true)
    @XmlSchemaType(name = "string")
    protected SearchResultType resultType;
    @XmlElement(name = "PreviewItemResponseShape")
    protected PreviewItemResponseShapeType previewItemResponseShape;
    @XmlElement(name = "SortBy")
    protected FieldOrderType sortBy;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "Deduplication")
    protected Boolean deduplication;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "PageItemReference")
    protected String pageItemReference;
    @XmlElement(name = "PageDirection")
    @XmlSchemaType(name = "string")
    protected SearchPageDirectionType pageDirection;

    /**
     * Ruft den Wert der searchQueries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfMailboxQueriesType }
     *     
     */
    public NonEmptyArrayOfMailboxQueriesType getSearchQueries() {
        return searchQueries;
    }

    /**
     * Legt den Wert der searchQueries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfMailboxQueriesType }
     *     
     */
    public void setSearchQueries(NonEmptyArrayOfMailboxQueriesType value) {
        this.searchQueries = value;
    }

    /**
     * Ruft den Wert der resultType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultType }
     *     
     */
    public SearchResultType getResultType() {
        return resultType;
    }

    /**
     * Legt den Wert der resultType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultType }
     *     
     */
    public void setResultType(SearchResultType value) {
        this.resultType = value;
    }

    /**
     * Ruft den Wert der previewItemResponseShape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PreviewItemResponseShapeType }
     *     
     */
    public PreviewItemResponseShapeType getPreviewItemResponseShape() {
        return previewItemResponseShape;
    }

    /**
     * Legt den Wert der previewItemResponseShape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviewItemResponseShapeType }
     *     
     */
    public void setPreviewItemResponseShape(PreviewItemResponseShapeType value) {
        this.previewItemResponseShape = value;
    }

    /**
     * Ruft den Wert der sortBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldOrderType }
     *     
     */
    public FieldOrderType getSortBy() {
        return sortBy;
    }

    /**
     * Legt den Wert der sortBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldOrderType }
     *     
     */
    public void setSortBy(FieldOrderType value) {
        this.sortBy = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Ruft den Wert der deduplication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeduplication() {
        return deduplication;
    }

    /**
     * Legt den Wert der deduplication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeduplication(Boolean value) {
        this.deduplication = value;
    }

    /**
     * Ruft den Wert der pageSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Legt den Wert der pageSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Ruft den Wert der pageItemReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageItemReference() {
        return pageItemReference;
    }

    /**
     * Legt den Wert der pageItemReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageItemReference(String value) {
        this.pageItemReference = value;
    }

    /**
     * Ruft den Wert der pageDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchPageDirectionType }
     *     
     */
    public SearchPageDirectionType getPageDirection() {
        return pageDirection;
    }

    /**
     * Legt den Wert der pageDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPageDirectionType }
     *     
     */
    public void setPageDirection(SearchPageDirectionType value) {
        this.pageDirection = value;
    }

}
