
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
 * <p>Java-Klasse für PerformInstantSearchRequest complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PerformInstantSearchRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchSessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemType" type="{http://schemas.microsoft.com/exchange/services/2006/types}InstantSearchItemType"/&gt;
 *         &lt;element name="QueryOptions" type="{http://schemas.microsoft.com/exchange/services/2006/types}QueryOptionsType"/&gt;
 *         &lt;element name="SearchRequestId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="KqlQuery" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FolderScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfFolderIdType"/&gt;
 *         &lt;element name="DistinguishedFolderScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfDistinguishedFolderIdType" minOccurs="0"/&gt;
 *         &lt;element name="IsDeepTraversal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WaitOnSearchResults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformInstantSearchRequest", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchSessionId",
    "itemType",
    "queryOptions",
    "searchRequestId",
    "kqlQuery",
    "folderScope",
    "distinguishedFolderScope",
    "isDeepTraversal",
    "waitOnSearchResults"
})
public class PerformInstantSearchRequest
    extends BaseRequestType
{

    @XmlElement(name = "SearchSessionId", required = true)
    protected String searchSessionId;
    @XmlList
    @XmlElement(name = "ItemType", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> itemType;
    @XmlList
    @XmlElement(name = "QueryOptions", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> queryOptions;
    @XmlElement(name = "SearchRequestId")
    protected long searchRequestId;
    @XmlElement(name = "KqlQuery", required = true)
    protected String kqlQuery;
    @XmlElement(name = "FolderScope", required = true)
    protected ArrayOfFolderIdType folderScope;
    @XmlElement(name = "DistinguishedFolderScope")
    protected ArrayOfDistinguishedFolderIdType distinguishedFolderScope;
    @XmlElement(name = "IsDeepTraversal")
    protected Boolean isDeepTraversal;
    @XmlElement(name = "WaitOnSearchResults")
    protected Boolean waitOnSearchResults;

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
     * Gets the value of the itemType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getItemType() {
        if (itemType == null) {
            itemType = new ArrayList<String>();
        }
        return this.itemType;
    }

    /**
     * Gets the value of the queryOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQueryOptions() {
        if (queryOptions == null) {
            queryOptions = new ArrayList<String>();
        }
        return this.queryOptions;
    }

    /**
     * Ruft den Wert der searchRequestId-Eigenschaft ab.
     * 
     */
    public long getSearchRequestId() {
        return searchRequestId;
    }

    /**
     * Legt den Wert der searchRequestId-Eigenschaft fest.
     * 
     */
    public void setSearchRequestId(long value) {
        this.searchRequestId = value;
    }

    /**
     * Ruft den Wert der kqlQuery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKqlQuery() {
        return kqlQuery;
    }

    /**
     * Legt den Wert der kqlQuery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKqlQuery(String value) {
        this.kqlQuery = value;
    }

    /**
     * Ruft den Wert der folderScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFolderIdType }
     *     
     */
    public ArrayOfFolderIdType getFolderScope() {
        return folderScope;
    }

    /**
     * Legt den Wert der folderScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFolderIdType }
     *     
     */
    public void setFolderScope(ArrayOfFolderIdType value) {
        this.folderScope = value;
    }

    /**
     * Ruft den Wert der distinguishedFolderScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDistinguishedFolderIdType }
     *     
     */
    public ArrayOfDistinguishedFolderIdType getDistinguishedFolderScope() {
        return distinguishedFolderScope;
    }

    /**
     * Legt den Wert der distinguishedFolderScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDistinguishedFolderIdType }
     *     
     */
    public void setDistinguishedFolderScope(ArrayOfDistinguishedFolderIdType value) {
        this.distinguishedFolderScope = value;
    }

    /**
     * Ruft den Wert der isDeepTraversal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeepTraversal() {
        return isDeepTraversal;
    }

    /**
     * Legt den Wert der isDeepTraversal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeepTraversal(Boolean value) {
        this.isDeepTraversal = value;
    }

    /**
     * Ruft den Wert der waitOnSearchResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitOnSearchResults() {
        return waitOnSearchResults;
    }

    /**
     * Legt den Wert der waitOnSearchResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaitOnSearchResults(Boolean value) {
        this.waitOnSearchResults = value;
    }

}
