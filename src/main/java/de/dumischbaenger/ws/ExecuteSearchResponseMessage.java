
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExecuteSearchResponseMessage complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExecuteSearchResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchResults" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchResultsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecuteSearchResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchResults"
})
public class ExecuteSearchResponseMessage
    extends ResponseMessageType
{

    @XmlElement(name = "SearchResults", required = true)
    protected SearchResultsType searchResults;

    /**
     * Ruft den Wert der searchResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultsType }
     *     
     */
    public SearchResultsType getSearchResults() {
        return searchResults;
    }

    /**
     * Legt den Wert der searchResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultsType }
     *     
     */
    public void setSearchResults(SearchResultsType value) {
        this.searchResults = value;
    }

}
