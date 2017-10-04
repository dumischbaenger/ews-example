
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UserConfigurationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserConfigurationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserConfigurationName" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserConfigurationNameType"/&gt;
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/&gt;
 *         &lt;element name="Dictionary" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserConfigurationDictionaryType" minOccurs="0"/&gt;
 *         &lt;element name="XmlData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="BinaryData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserConfigurationType", propOrder = {
    "userConfigurationName",
    "itemId",
    "dictionary",
    "xmlData",
    "binaryData"
})
public class UserConfigurationType {

    @XmlElement(name = "UserConfigurationName", required = true)
    protected UserConfigurationNameType userConfigurationName;
    @XmlElement(name = "ItemId")
    protected ItemIdType itemId;
    @XmlElement(name = "Dictionary")
    protected UserConfigurationDictionaryType dictionary;
    @XmlElement(name = "XmlData")
    protected byte[] xmlData;
    @XmlElement(name = "BinaryData")
    protected byte[] binaryData;

    /**
     * Ruft den Wert der userConfigurationName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserConfigurationNameType }
     *     
     */
    public UserConfigurationNameType getUserConfigurationName() {
        return userConfigurationName;
    }

    /**
     * Legt den Wert der userConfigurationName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserConfigurationNameType }
     *     
     */
    public void setUserConfigurationName(UserConfigurationNameType value) {
        this.userConfigurationName = value;
    }

    /**
     * Ruft den Wert der itemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getItemId() {
        return itemId;
    }

    /**
     * Legt den Wert der itemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setItemId(ItemIdType value) {
        this.itemId = value;
    }

    /**
     * Ruft den Wert der dictionary-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserConfigurationDictionaryType }
     *     
     */
    public UserConfigurationDictionaryType getDictionary() {
        return dictionary;
    }

    /**
     * Legt den Wert der dictionary-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserConfigurationDictionaryType }
     *     
     */
    public void setDictionary(UserConfigurationDictionaryType value) {
        this.dictionary = value;
    }

    /**
     * Ruft den Wert der xmlData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXmlData() {
        return xmlData;
    }

    /**
     * Legt den Wert der xmlData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setXmlData(byte[] value) {
        this.xmlData = value;
    }

    /**
     * Ruft den Wert der binaryData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryData() {
        return binaryData;
    }

    /**
     * Legt den Wert der binaryData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryData(byte[] value) {
        this.binaryData = value;
    }

}
