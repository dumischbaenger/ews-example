
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Mailboxes search result.
 *       
 * 
 * <p>Java-Klasse für SearchMailboxesResultType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchMailboxesResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchQueries" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfMailboxQueriesType"/&gt;
 *         &lt;element name="ResultType" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchResultType"/&gt;
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="PageItemCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PageItemSize" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="KeywordStats" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfKeywordStatisticsSearchResultsType" minOccurs="0"/&gt;
 *         &lt;element name="Items" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSearchPreviewItemsType" minOccurs="0"/&gt;
 *         &lt;element name="FailedMailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfFailedSearchMailboxesType" minOccurs="0"/&gt;
 *         &lt;element name="Refiners" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSearchRefinerItemsType" minOccurs="0"/&gt;
 *         &lt;element name="MailboxStats" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfMailboxStatisticsItemsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchMailboxesResultType", propOrder = {
    "searchQueries",
    "resultType",
    "itemCount",
    "size",
    "pageItemCount",
    "pageItemSize",
    "keywordStats",
    "items",
    "failedMailboxes",
    "refiners",
    "mailboxStats"
})
public class SearchMailboxesResultType {

    @XmlElement(name = "SearchQueries", required = true)
    protected NonEmptyArrayOfMailboxQueriesType searchQueries;
    @XmlElement(name = "ResultType", required = true)
    @XmlSchemaType(name = "string")
    protected SearchResultType resultType;
    @XmlElement(name = "ItemCount")
    protected long itemCount;
    @XmlElement(name = "Size")
    protected long size;
    @XmlElement(name = "PageItemCount")
    protected int pageItemCount;
    @XmlElement(name = "PageItemSize")
    protected long pageItemSize;
    @XmlElement(name = "KeywordStats")
    protected ArrayOfKeywordStatisticsSearchResultsType keywordStats;
    @XmlElement(name = "Items")
    protected ArrayOfSearchPreviewItemsType items;
    @XmlElement(name = "FailedMailboxes")
    protected ArrayOfFailedSearchMailboxesType failedMailboxes;
    @XmlElement(name = "Refiners")
    protected ArrayOfSearchRefinerItemsType refiners;
    @XmlElement(name = "MailboxStats")
    protected ArrayOfMailboxStatisticsItemsType mailboxStats;

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
     * Ruft den Wert der itemCount-Eigenschaft ab.
     * 
     */
    public long getItemCount() {
        return itemCount;
    }

    /**
     * Legt den Wert der itemCount-Eigenschaft fest.
     * 
     */
    public void setItemCount(long value) {
        this.itemCount = value;
    }

    /**
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Ruft den Wert der pageItemCount-Eigenschaft ab.
     * 
     */
    public int getPageItemCount() {
        return pageItemCount;
    }

    /**
     * Legt den Wert der pageItemCount-Eigenschaft fest.
     * 
     */
    public void setPageItemCount(int value) {
        this.pageItemCount = value;
    }

    /**
     * Ruft den Wert der pageItemSize-Eigenschaft ab.
     * 
     */
    public long getPageItemSize() {
        return pageItemSize;
    }

    /**
     * Legt den Wert der pageItemSize-Eigenschaft fest.
     * 
     */
    public void setPageItemSize(long value) {
        this.pageItemSize = value;
    }

    /**
     * Ruft den Wert der keywordStats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordStatisticsSearchResultsType }
     *     
     */
    public ArrayOfKeywordStatisticsSearchResultsType getKeywordStats() {
        return keywordStats;
    }

    /**
     * Legt den Wert der keywordStats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordStatisticsSearchResultsType }
     *     
     */
    public void setKeywordStats(ArrayOfKeywordStatisticsSearchResultsType value) {
        this.keywordStats = value;
    }

    /**
     * Ruft den Wert der items-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchPreviewItemsType }
     *     
     */
    public ArrayOfSearchPreviewItemsType getItems() {
        return items;
    }

    /**
     * Legt den Wert der items-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchPreviewItemsType }
     *     
     */
    public void setItems(ArrayOfSearchPreviewItemsType value) {
        this.items = value;
    }

    /**
     * Ruft den Wert der failedMailboxes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFailedSearchMailboxesType }
     *     
     */
    public ArrayOfFailedSearchMailboxesType getFailedMailboxes() {
        return failedMailboxes;
    }

    /**
     * Legt den Wert der failedMailboxes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFailedSearchMailboxesType }
     *     
     */
    public void setFailedMailboxes(ArrayOfFailedSearchMailboxesType value) {
        this.failedMailboxes = value;
    }

    /**
     * Ruft den Wert der refiners-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchRefinerItemsType }
     *     
     */
    public ArrayOfSearchRefinerItemsType getRefiners() {
        return refiners;
    }

    /**
     * Legt den Wert der refiners-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchRefinerItemsType }
     *     
     */
    public void setRefiners(ArrayOfSearchRefinerItemsType value) {
        this.refiners = value;
    }

    /**
     * Ruft den Wert der mailboxStats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailboxStatisticsItemsType }
     *     
     */
    public ArrayOfMailboxStatisticsItemsType getMailboxStats() {
        return mailboxStats;
    }

    /**
     * Legt den Wert der mailboxStats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailboxStatisticsItemsType }
     *     
     */
    public void setMailboxStats(ArrayOfMailboxStatisticsItemsType value) {
        this.mailboxStats = value;
    }

}
