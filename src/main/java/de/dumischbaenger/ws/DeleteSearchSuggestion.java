
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
 * <p>Java-Klasse f�r DeleteSearchSuggestion complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DeleteSearchSuggestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchSessionId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/&gt;
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SuggestionTypes" type="{http://schemas.microsoft.com/exchange/services/2006/types}SuggestionKindType"/&gt;
 *         &lt;element name="SearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSearchScopeType" minOccurs="0"/&gt;
 *         &lt;element name="Scenario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteSearchSuggestion", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchSessionId",
    "query",
    "suggestionTypes",
    "searchScope",
    "scenario"
})
public class DeleteSearchSuggestion
    extends BaseRequestType
{

    @XmlElement(name = "SearchSessionId", required = true)
    protected String searchSessionId;
    @XmlElement(name = "Query", required = true)
    protected String query;
    @XmlList
    @XmlElement(name = "SuggestionTypes", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> suggestionTypes;
    @XmlElement(name = "SearchScope")
    protected ArrayOfSearchScopeType searchScope;
    @XmlElement(name = "Scenario")
    protected String scenario;

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
     * Gets the value of the suggestionTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the suggestionTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuggestionTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSuggestionTypes() {
        if (suggestionTypes == null) {
            suggestionTypes = new ArrayList<String>();
        }
        return this.suggestionTypes;
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

}
