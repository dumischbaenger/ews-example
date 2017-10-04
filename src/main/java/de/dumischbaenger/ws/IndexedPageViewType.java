
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IndexedPageViewType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="IndexedPageViewType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BasePagingType"&gt;
 *       &lt;attribute name="Offset" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="BasePoint" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}IndexBasePointType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndexedPageViewType")
public class IndexedPageViewType
    extends BasePagingType
{

    @XmlAttribute(name = "Offset", required = true)
    protected int offset;
    @XmlAttribute(name = "BasePoint", required = true)
    protected IndexBasePointType basePoint;

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
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
