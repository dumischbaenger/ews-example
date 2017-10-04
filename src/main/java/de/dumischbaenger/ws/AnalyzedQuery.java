
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AnalyzedQuery complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AnalyzedQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SearchRestrictions" type="{http://schemas.microsoft.com/exchange/services/2006/types}RestrictionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnalyzedQuery", propOrder = {
    "queryLanguage",
    "searchRestrictions"
})
public class AnalyzedQuery {

    @XmlElement(name = "QueryLanguage", required = true)
    protected String queryLanguage;
    @XmlElement(name = "SearchRestrictions", required = true)
    protected RestrictionType searchRestrictions;

    /**
     * Ruft den Wert der queryLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryLanguage() {
        return queryLanguage;
    }

    /**
     * Legt den Wert der queryLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryLanguage(String value) {
        this.queryLanguage = value;
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

}
