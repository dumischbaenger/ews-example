
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetSearchSuggestionsResponseMessage complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetSearchSuggestionsResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchSuggestions" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchSuggestionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSearchSuggestionsResponseMessage", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchSuggestions"
})
public class GetSearchSuggestionsResponseMessage
    extends ResponseMessageType
{

    @XmlElement(name = "SearchSuggestions", required = true)
    protected SearchSuggestionsType searchSuggestions;

    /**
     * Ruft den Wert der searchSuggestions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchSuggestionsType }
     *     
     */
    public SearchSuggestionsType getSearchSuggestions() {
        return searchSuggestions;
    }

    /**
     * Legt den Wert der searchSuggestions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSuggestionsType }
     *     
     */
    public void setSearchSuggestions(SearchSuggestionsType value) {
        this.searchSuggestions = value;
    }

}
