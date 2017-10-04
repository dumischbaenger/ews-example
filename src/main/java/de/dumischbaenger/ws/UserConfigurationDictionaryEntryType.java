
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UserConfigurationDictionaryEntryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserConfigurationDictionaryEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DictionaryKey" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserConfigurationDictionaryObjectType"/&gt;
 *         &lt;element name="DictionaryValue" type="{http://schemas.microsoft.com/exchange/services/2006/types}UserConfigurationDictionaryObjectType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserConfigurationDictionaryEntryType", propOrder = {
    "dictionaryKey",
    "dictionaryValue"
})
public class UserConfigurationDictionaryEntryType {

    @XmlElement(name = "DictionaryKey", required = true)
    protected UserConfigurationDictionaryObjectType dictionaryKey;
    @XmlElement(name = "DictionaryValue", required = true, nillable = true)
    protected UserConfigurationDictionaryObjectType dictionaryValue;

    /**
     * Ruft den Wert der dictionaryKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserConfigurationDictionaryObjectType }
     *     
     */
    public UserConfigurationDictionaryObjectType getDictionaryKey() {
        return dictionaryKey;
    }

    /**
     * Legt den Wert der dictionaryKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserConfigurationDictionaryObjectType }
     *     
     */
    public void setDictionaryKey(UserConfigurationDictionaryObjectType value) {
        this.dictionaryKey = value;
    }

    /**
     * Ruft den Wert der dictionaryValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserConfigurationDictionaryObjectType }
     *     
     */
    public UserConfigurationDictionaryObjectType getDictionaryValue() {
        return dictionaryValue;
    }

    /**
     * Legt den Wert der dictionaryValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserConfigurationDictionaryObjectType }
     *     
     */
    public void setDictionaryValue(UserConfigurationDictionaryObjectType value) {
        this.dictionaryValue = value;
    }

}
