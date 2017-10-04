
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         A Group on the ImContactList, with one or more members
 *       
 * 
 * <p>Java-Klasse für ImGroupType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ImGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/&gt;
 *         &lt;element name="GroupType" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/&gt;
 *         &lt;element name="ExchangeStoreId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/&gt;
 *         &lt;element name="MemberCorrelationKey" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfItemIdsType" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfExtendedPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="SmtpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImGroupType", propOrder = {
    "displayName",
    "groupType",
    "exchangeStoreId",
    "memberCorrelationKey",
    "extendedProperties",
    "smtpAddress"
})
public class ImGroupType {

    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "GroupType", required = true)
    protected String groupType;
    @XmlElement(name = "ExchangeStoreId")
    protected ItemIdType exchangeStoreId;
    @XmlElement(name = "MemberCorrelationKey")
    protected NonEmptyArrayOfItemIdsType memberCorrelationKey;
    @XmlElement(name = "ExtendedProperties")
    protected NonEmptyArrayOfExtendedPropertyType extendedProperties;
    @XmlElement(name = "SmtpAddress")
    protected String smtpAddress;

    /**
     * Ruft den Wert der displayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Ruft den Wert der groupType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * Legt den Wert der groupType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupType(String value) {
        this.groupType = value;
    }

    /**
     * Ruft den Wert der exchangeStoreId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getExchangeStoreId() {
        return exchangeStoreId;
    }

    /**
     * Legt den Wert der exchangeStoreId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setExchangeStoreId(ItemIdType value) {
        this.exchangeStoreId = value;
    }

    /**
     * Ruft den Wert der memberCorrelationKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfItemIdsType }
     *     
     */
    public NonEmptyArrayOfItemIdsType getMemberCorrelationKey() {
        return memberCorrelationKey;
    }

    /**
     * Legt den Wert der memberCorrelationKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfItemIdsType }
     *     
     */
    public void setMemberCorrelationKey(NonEmptyArrayOfItemIdsType value) {
        this.memberCorrelationKey = value;
    }

    /**
     * Ruft den Wert der extendedProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfExtendedPropertyType }
     *     
     */
    public NonEmptyArrayOfExtendedPropertyType getExtendedProperties() {
        return extendedProperties;
    }

    /**
     * Legt den Wert der extendedProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfExtendedPropertyType }
     *     
     */
    public void setExtendedProperties(NonEmptyArrayOfExtendedPropertyType value) {
        this.extendedProperties = value;
    }

    /**
     * Ruft den Wert der smtpAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpAddress() {
        return smtpAddress;
    }

    /**
     * Legt den Wert der smtpAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpAddress(String value) {
        this.smtpAddress = value;
    }

}
