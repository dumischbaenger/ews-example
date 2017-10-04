
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
 * <p>Java-Klasse für StartSearchSession complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StartSearchSession"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchSessionId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/&gt;
 *         &lt;element name="WarmupOptions" type="{http://schemas.microsoft.com/exchange/services/2006/types}WarmupOptionsType"/&gt;
 *         &lt;element name="SuggestionTypes" type="{http://schemas.microsoft.com/exchange/services/2006/types}SuggestionKindType"/&gt;
 *         &lt;element name="SearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSearchScopeType"/&gt;
 *         &lt;element name="IdFormat" type="{http://schemas.microsoft.com/exchange/services/2006/types}IdFormatType" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "StartSearchSession", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchSessionId",
    "warmupOptions",
    "suggestionTypes",
    "searchScope",
    "idFormat",
    "applicationId",
    "scenario"
})
public class StartSearchSession
    extends BaseRequestType
{

    @XmlElement(name = "SearchSessionId", required = true)
    protected String searchSessionId;
    @XmlList
    @XmlElement(name = "WarmupOptions", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> warmupOptions;
    @XmlList
    @XmlElement(name = "SuggestionTypes", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> suggestionTypes;
    @XmlElement(name = "SearchScope", required = true)
    protected ArrayOfSearchScopeType searchScope;
    @XmlElement(name = "IdFormat")
    @XmlSchemaType(name = "string")
    protected IdFormatType idFormat;
    @XmlElement(name = "ApplicationId")
    protected String applicationId;
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
     * Gets the value of the warmupOptions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warmupOptions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarmupOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWarmupOptions() {
        if (warmupOptions == null) {
            warmupOptions = new ArrayList<String>();
        }
        return this.warmupOptions;
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
     * Ruft den Wert der applicationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Legt den Wert der applicationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
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

}
