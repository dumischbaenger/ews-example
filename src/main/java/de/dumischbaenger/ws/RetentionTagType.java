
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java-Klasse für RetentionTagType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RetentionTagType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://schemas.microsoft.com/exchange/services/2006/types&gt;GuidType"&gt;
 *       &lt;attribute name="IsExplicit" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetentionTagType", propOrder = {
    "value"
})
public class RetentionTagType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "IsExplicit", required = true)
    protected boolean isExplicit;

    /**
     * 
     *         The regular expression captures the standard representation of a GUID
     *       
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
     * Ruft den Wert der isExplicit-Eigenschaft ab.
     * 
     */
    public boolean isIsExplicit() {
        return isExplicit;
    }

    /**
     * Legt den Wert der isExplicit-Eigenschaft fest.
     * 
     */
    public void setIsExplicit(boolean value) {
        this.isExplicit = value;
    }

}
