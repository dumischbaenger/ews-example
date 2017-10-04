
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Represents an extended property instance (both its path identifier along with its
 *         associated value).
 *       
 * 
 * <p>Java-Klasse für ExtendedPropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExtendedPropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtendedFieldURI" type="{http://schemas.microsoft.com/exchange/services/2006/types}PathToExtendedFieldType"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="Values" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfPropertyValuesType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedPropertyType", propOrder = {
    "extendedFieldURI",
    "value",
    "values"
})
public class ExtendedPropertyType {

    @XmlElement(name = "ExtendedFieldURI", required = true)
    protected PathToExtendedFieldType extendedFieldURI;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "Values")
    protected NonEmptyArrayOfPropertyValuesType values;

    /**
     * Ruft den Wert der extendedFieldURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathToExtendedFieldType }
     *     
     */
    public PathToExtendedFieldType getExtendedFieldURI() {
        return extendedFieldURI;
    }

    /**
     * Legt den Wert der extendedFieldURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathToExtendedFieldType }
     *     
     */
    public void setExtendedFieldURI(PathToExtendedFieldType value) {
        this.extendedFieldURI = value;
    }

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der values-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfPropertyValuesType }
     *     
     */
    public NonEmptyArrayOfPropertyValuesType getValues() {
        return values;
    }

    /**
     * Legt den Wert der values-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfPropertyValuesType }
     *     
     */
    public void setValues(NonEmptyArrayOfPropertyValuesType value) {
        this.values = value;
    }

}
