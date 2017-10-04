
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SeekToConditionPageViewType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SeekToConditionPageViewType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BasePagingType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Condition" type="{http://schemas.microsoft.com/exchange/services/2006/types}RestrictionType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BasePoint" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}IndexBasePointType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeekToConditionPageViewType", propOrder = {
    "condition"
})
public class SeekToConditionPageViewType
    extends BasePagingType
{

    @XmlElement(name = "Condition", required = true)
    protected RestrictionType condition;
    @XmlAttribute(name = "BasePoint", required = true)
    protected IndexBasePointType basePoint;

    /**
     * Ruft den Wert der condition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType }
     *     
     */
    public RestrictionType getCondition() {
        return condition;
    }

    /**
     * Legt den Wert der condition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType }
     *     
     */
    public void setCondition(RestrictionType value) {
        this.condition = value;
    }

    /**
     * Ruft den Wert der basePoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IndexBasePointType }
     *     
     */
    public IndexBasePointType getBasePoint() {
        return basePoint;
    }

    /**
     * Legt den Wert der basePoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexBasePointType }
     *     
     */
    public void setBasePoint(IndexBasePointType value) {
        this.basePoint = value;
    }

}
