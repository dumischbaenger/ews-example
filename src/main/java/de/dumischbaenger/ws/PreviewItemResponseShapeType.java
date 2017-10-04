
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PreviewItemResponseShapeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PreviewItemResponseShapeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}PreviewItemBaseShapeType"/&gt;
 *         &lt;element name="AdditionalProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfExtendedFieldURIsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviewItemResponseShapeType", propOrder = {
    "baseShape",
    "additionalProperties"
})
public class PreviewItemResponseShapeType {

    @XmlElement(name = "BaseShape", required = true)
    @XmlSchemaType(name = "string")
    protected PreviewItemBaseShapeType baseShape;
    @XmlElement(name = "AdditionalProperties")
    protected NonEmptyArrayOfExtendedFieldURIsType additionalProperties;

    /**
     * Ruft den Wert der baseShape-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PreviewItemBaseShapeType }
     *     
     */
    public PreviewItemBaseShapeType getBaseShape() {
        return baseShape;
    }

    /**
     * Legt den Wert der baseShape-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviewItemBaseShapeType }
     *     
     */
    public void setBaseShape(PreviewItemBaseShapeType value) {
        this.baseShape = value;
    }

    /**
     * Ruft den Wert der additionalProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfExtendedFieldURIsType }
     *     
     */
    public NonEmptyArrayOfExtendedFieldURIsType getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Legt den Wert der additionalProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfExtendedFieldURIsType }
     *     
     */
    public void setAdditionalProperties(NonEmptyArrayOfExtendedFieldURIsType value) {
        this.additionalProperties = value;
    }

}
