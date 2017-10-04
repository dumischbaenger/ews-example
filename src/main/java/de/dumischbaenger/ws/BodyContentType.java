
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BodyContentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BodyContentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BodyType" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyTypeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyContentType", propOrder = {
    "value",
    "bodyType"
})
public class BodyContentType {

    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "BodyType", required = true)
    @XmlSchemaType(name = "string")
    protected BodyTypeType bodyType;

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
     * Ruft den Wert der bodyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BodyTypeType }
     *     
     */
    public BodyTypeType getBodyType() {
        return bodyType;
    }

    /**
     * Legt den Wert der bodyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BodyTypeType }
     *     
     */
    public void setBodyType(BodyTypeType value) {
        this.bodyType = value;
    }

}
