
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SearchSuggestionsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchSuggestionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TDSuggestionsBatchId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="TDSuggestionsInstanceId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/&gt;
 *         &lt;element name="Suggestions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Suggestion" type="{http://schemas.microsoft.com/exchange/services/2006/types}SuggestionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DiagnosticsData" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchDiagnosticsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchSuggestionsType", propOrder = {
    "tdSuggestionsBatchId",
    "tdSuggestionsInstanceId",
    "suggestions",
    "diagnosticsData"
})
public class SearchSuggestionsType {

    @XmlElement(name = "TDSuggestionsBatchId")
    protected long tdSuggestionsBatchId;
    @XmlElement(name = "TDSuggestionsInstanceId", required = true)
    protected String tdSuggestionsInstanceId;
    @XmlElement(name = "Suggestions")
    protected SearchSuggestionsType.Suggestions suggestions;
    @XmlElement(name = "DiagnosticsData")
    protected SearchDiagnosticsType diagnosticsData;

    /**
     * Ruft den Wert der tdSuggestionsBatchId-Eigenschaft ab.
     * 
     */
    public long getTDSuggestionsBatchId() {
        return tdSuggestionsBatchId;
    }

    /**
     * Legt den Wert der tdSuggestionsBatchId-Eigenschaft fest.
     * 
     */
    public void setTDSuggestionsBatchId(long value) {
        this.tdSuggestionsBatchId = value;
    }

    /**
     * Ruft den Wert der tdSuggestionsInstanceId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDSuggestionsInstanceId() {
        return tdSuggestionsInstanceId;
    }

    /**
     * Legt den Wert der tdSuggestionsInstanceId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDSuggestionsInstanceId(String value) {
        this.tdSuggestionsInstanceId = value;
    }

    /**
     * Ruft den Wert der suggestions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchSuggestionsType.Suggestions }
     *     
     */
    public SearchSuggestionsType.Suggestions getSuggestions() {
        return suggestions;
    }

    /**
     * Legt den Wert der suggestions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSuggestionsType.Suggestions }
     *     
     */
    public void setSuggestions(SearchSuggestionsType.Suggestions value) {
        this.suggestions = value;
    }

    /**
     * Ruft den Wert der diagnosticsData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchDiagnosticsType }
     *     
     */
    public SearchDiagnosticsType getDiagnosticsData() {
        return diagnosticsData;
    }

    /**
     * Legt den Wert der diagnosticsData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDiagnosticsType }
     *     
     */
    public void setDiagnosticsData(SearchDiagnosticsType value) {
        this.diagnosticsData = value;
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
     *         &lt;element name="Suggestion" type="{http://schemas.microsoft.com/exchange/services/2006/types}SuggestionType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "suggestion"
    })
    public static class Suggestions {

        @XmlElement(name = "Suggestion")
        protected List<SuggestionType> suggestion;

        /**
         * Gets the value of the suggestion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suggestion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuggestion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuggestionType }
         * 
         * 
         */
        public List<SuggestionType> getSuggestion() {
            if (suggestion == null) {
                suggestion = new ArrayList<SuggestionType>();
            }
            return this.suggestion;
        }

    }

}
