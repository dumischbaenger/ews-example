
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbchPersonItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbchPersonItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ItemType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AntiLinkInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" minOccurs="0"/&gt;
 *         &lt;element name="ContactHandles" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfAbchPersonContactHandlesType" minOccurs="0"/&gt;
 *         &lt;element name="ContactCategories" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="RelevanceOrder1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RelevanceOrder2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrustLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FavoriteOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ExchangePersonIdGuid" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbchPersonItemType", propOrder = {
    "antiLinkInfo",
    "personId",
    "contactHandles",
    "contactCategories",
    "relevanceOrder1",
    "relevanceOrder2",
    "trustLevel",
    "favoriteOrder",
    "exchangePersonIdGuid"
})
public class AbchPersonItemType
    extends ItemType
{

    @XmlElement(name = "AntiLinkInfo")
    protected String antiLinkInfo;
    @XmlElement(name = "PersonId")
    protected String personId;
    @XmlElement(name = "ContactHandles")
    protected ArrayOfAbchPersonContactHandlesType contactHandles;
    @XmlElement(name = "ContactCategories")
    protected ArrayOfStringsType contactCategories;
    @XmlElement(name = "RelevanceOrder1")
    protected String relevanceOrder1;
    @XmlElement(name = "RelevanceOrder2")
    protected String relevanceOrder2;
    @XmlElement(name = "TrustLevel")
    protected Integer trustLevel;
    @XmlElement(name = "FavoriteOrder")
    protected Integer favoriteOrder;
    @XmlElement(name = "ExchangePersonIdGuid")
    protected String exchangePersonIdGuid;

    /**
     * Ruft den Wert der antiLinkInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntiLinkInfo() {
        return antiLinkInfo;
    }

    /**
     * Legt den Wert der antiLinkInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntiLinkInfo(String value) {
        this.antiLinkInfo = value;
    }

    /**
     * Ruft den Wert der personId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Legt den Wert der personId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Ruft den Wert der contactHandles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAbchPersonContactHandlesType }
     *     
     */
    public ArrayOfAbchPersonContactHandlesType getContactHandles() {
        return contactHandles;
    }

    /**
     * Legt den Wert der contactHandles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAbchPersonContactHandlesType }
     *     
     */
    public void setContactHandles(ArrayOfAbchPersonContactHandlesType value) {
        this.contactHandles = value;
    }

    /**
     * Ruft den Wert der contactCategories-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getContactCategories() {
        return contactCategories;
    }

    /**
     * Legt den Wert der contactCategories-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setContactCategories(ArrayOfStringsType value) {
        this.contactCategories = value;
    }

    /**
     * Ruft den Wert der relevanceOrder1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelevanceOrder1() {
        return relevanceOrder1;
    }

    /**
     * Legt den Wert der relevanceOrder1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelevanceOrder1(String value) {
        this.relevanceOrder1 = value;
    }

    /**
     * Ruft den Wert der relevanceOrder2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelevanceOrder2() {
        return relevanceOrder2;
    }

    /**
     * Legt den Wert der relevanceOrder2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelevanceOrder2(String value) {
        this.relevanceOrder2 = value;
    }

    /**
     * Ruft den Wert der trustLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrustLevel() {
        return trustLevel;
    }

    /**
     * Legt den Wert der trustLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrustLevel(Integer value) {
        this.trustLevel = value;
    }

    /**
     * Ruft den Wert der favoriteOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFavoriteOrder() {
        return favoriteOrder;
    }

    /**
     * Legt den Wert der favoriteOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFavoriteOrder(Integer value) {
        this.favoriteOrder = value;
    }

    /**
     * Ruft den Wert der exchangePersonIdGuid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangePersonIdGuid() {
        return exchangePersonIdGuid;
    }

    /**
     * Legt den Wert der exchangePersonIdGuid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangePersonIdGuid(String value) {
        this.exchangePersonIdGuid = value;
    }

}
