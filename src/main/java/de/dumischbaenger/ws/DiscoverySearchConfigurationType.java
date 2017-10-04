
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Discovery search configuration.
 *       
 * 
 * <p>Java-Klasse für DiscoverySearchConfigurationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DiscoverySearchConfigurationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SearchQuery" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SearchableMailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSearchableMailboxesType" minOccurs="0"/&gt;
 *         &lt;element name="InPlaceHoldIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManagedByOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscoverySearchConfigurationType", propOrder = {
    "searchId",
    "searchQuery",
    "searchableMailboxes",
    "inPlaceHoldIdentity",
    "managedByOrganization",
    "language"
})
public class DiscoverySearchConfigurationType {

    @XmlElement(name = "SearchId", required = true)
    protected String searchId;
    @XmlElement(name = "SearchQuery", required = true)
    protected String searchQuery;
    @XmlElement(name = "SearchableMailboxes")
    protected ArrayOfSearchableMailboxesType searchableMailboxes;
    @XmlElement(name = "InPlaceHoldIdentity")
    protected String inPlaceHoldIdentity;
    @XmlElement(name = "ManagedByOrganization")
    protected String managedByOrganization;
    @XmlElement(name = "Language")
    protected String language;

    /**
     * Ruft den Wert der searchId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * Legt den Wert der searchId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchId(String value) {
        this.searchId = value;
    }

    /**
     * Ruft den Wert der searchQuery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchQuery() {
        return searchQuery;
    }

    /**
     * Legt den Wert der searchQuery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchQuery(String value) {
        this.searchQuery = value;
    }

    /**
     * Ruft den Wert der searchableMailboxes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchableMailboxesType }
     *     
     */
    public ArrayOfSearchableMailboxesType getSearchableMailboxes() {
        return searchableMailboxes;
    }

    /**
     * Legt den Wert der searchableMailboxes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchableMailboxesType }
     *     
     */
    public void setSearchableMailboxes(ArrayOfSearchableMailboxesType value) {
        this.searchableMailboxes = value;
    }

    /**
     * Ruft den Wert der inPlaceHoldIdentity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPlaceHoldIdentity() {
        return inPlaceHoldIdentity;
    }

    /**
     * Legt den Wert der inPlaceHoldIdentity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPlaceHoldIdentity(String value) {
        this.inPlaceHoldIdentity = value;
    }

    /**
     * Ruft den Wert der managedByOrganization-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagedByOrganization() {
        return managedByOrganization;
    }

    /**
     * Legt den Wert der managedByOrganization-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagedByOrganization(String value) {
        this.managedByOrganization = value;
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

}
