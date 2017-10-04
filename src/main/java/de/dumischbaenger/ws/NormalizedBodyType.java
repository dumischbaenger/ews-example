
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für NormalizedBodyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NormalizedBodyType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="NormalizedBodyType" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyTypeType" /&gt;
 *       &lt;attribute name="IsTruncated" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NormalizedBodyType", propOrder = {
    "value"
})
public class NormalizedBodyType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "NormalizedBodyType", required = true)
    protected BodyTypeType normalizedBodyType;
    @XmlAttribute(name = "IsTruncated")
    protected Boolean isTruncated;

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
     * Ruft den Wert der normalizedBodyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BodyTypeType }
     *     
     */
    public BodyTypeType getNormalizedBodyType() {
        return normalizedBodyType;
    }

    /**
     * Legt den Wert der normalizedBodyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyTypeType }
     *     
     */
    public void setNormalizedBodyType(BodyTypeType value) {
        this.normalizedBodyType = value;
    }

    /**
     * Ruft den Wert der isTruncated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * Legt den Wert der isTruncated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTruncated(Boolean value) {
        this.isTruncated = value;
    }

}
