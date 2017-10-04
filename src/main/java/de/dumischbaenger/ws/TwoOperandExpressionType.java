
package de.dumischbaenger.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r TwoOperandExpressionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TwoOperandExpressionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}SearchExpressionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schemas.microsoft.com/exchange/services/2006/types}Path"/&gt;
 *         &lt;element name="FieldURIOrConstant" type="{http://schemas.microsoft.com/exchange/services/2006/types}FieldURIOrConstantType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TwoOperandExpressionType", propOrder = {
    "path",
    "fieldURIOrConstant"
})
@XmlSeeAlso({
    IsEqualToType.class,
    IsNotEqualToType.class,
    IsGreaterThanType.class,
    IsGreaterThanOrEqualToType.class,
    IsLessThanType.class,
    IsLessThanOrEqualToType.class
})
public abstract class TwoOperandExpressionType
    extends SearchExpressionType
{

    @XmlElementRef(name = "Path", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class)
    protected JAXBElement<? extends BasePathToElementType> path;
    @XmlElement(name = "FieldURIOrConstant", required = true)
    protected FieldURIOrConstantType fieldURIOrConstant;

    /**
     * Ruft den Wert der path-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PathToExtendedFieldType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathToIndexedFieldType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BasePathToElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathToUnindexedFieldType }{@code >}
     *     
     */
    public JAXBElement<? extends BasePathToElementType> getPath() {
        return path;
    }

    /**
     * Legt den Wert der path-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PathToExtendedFieldType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathToIndexedFieldType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BasePathToElementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PathToUnindexedFieldType }{@code >}
     *     
     */
    public void setPath(JAXBElement<? extends BasePathToElementType> value) {
        this.path = value;
    }

    /**
     * Ruft den Wert der fieldURIOrConstant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldURIOrConstantType }
     *     
     */
    public FieldURIOrConstantType getFieldURIOrConstant() {
        return fieldURIOrConstant;
    }

    /**
     * Legt den Wert der fieldURIOrConstant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldURIOrConstantType }
     *     
     */
    public void setFieldURIOrConstant(FieldURIOrConstantType value) {
        this.fieldURIOrConstant = value;
    }

}
