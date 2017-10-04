
package de.dumischbaenger.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContainsExpressionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContainsExpressionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}SearchExpressionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schemas.microsoft.com/exchange/services/2006/types}Path"/&gt;
 *         &lt;element name="Constant" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConstantValueType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ContainmentMode" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContainmentModeType" /&gt;
 *       &lt;attribute name="ContainmentComparison" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContainmentComparisonType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainsExpressionType", propOrder = {
    "path",
    "constant"
})
public class ContainsExpressionType
    extends SearchExpressionType
{

    @XmlElementRef(name = "Path", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class)
    protected JAXBElement<? extends BasePathToElementType> path;
    @XmlElement(name = "Constant", required = true)
    protected ConstantValueType constant;
    @XmlAttribute(name = "ContainmentMode")
    protected ContainmentModeType containmentMode;
    @XmlAttribute(name = "ContainmentComparison")
    protected ContainmentComparisonType containmentComparison;

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
     * Ruft den Wert der constant-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConstantValueType }
     *     
     */
    public ConstantValueType getConstant() {
        return constant;
    }

    /**
     * Legt den Wert der constant-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstantValueType }
     *     
     */
    public void setConstant(ConstantValueType value) {
        this.constant = value;
    }

    /**
     * Ruft den Wert der containmentMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContainmentModeType }
     *     
     */
    public ContainmentModeType getContainmentMode() {
        return containmentMode;
    }

    /**
     * Legt den Wert der containmentMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainmentModeType }
     *     
     */
    public void setContainmentMode(ContainmentModeType value) {
        this.containmentMode = value;
    }

    /**
     * Ruft den Wert der containmentComparison-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContainmentComparisonType }
     *     
     */
    public ContainmentComparisonType getContainmentComparison() {
        return containmentComparison;
    }

    /**
     * Legt den Wert der containmentComparison-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainmentComparisonType }
     *     
     */
    public void setContainmentComparison(ContainmentComparisonType value) {
        this.containmentComparison = value;
    }

}
