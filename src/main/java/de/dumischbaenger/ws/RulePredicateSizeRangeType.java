
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Size range type used for the WithinSizeRange rule predicate.
 * 
 * <p>Java-Klasse für RulePredicateSizeRangeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RulePredicateSizeRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MinimumSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaximumSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RulePredicateSizeRangeType", propOrder = {
    "minimumSize",
    "maximumSize"
})
public class RulePredicateSizeRangeType {

    @XmlElement(name = "MinimumSize")
    protected Integer minimumSize;
    @XmlElement(name = "MaximumSize")
    protected Integer maximumSize;

    /**
     * Ruft den Wert der minimumSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumSize() {
        return minimumSize;
    }

    /**
     * Legt den Wert der minimumSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumSize(Integer value) {
        this.minimumSize = value;
    }

    /**
     * Ruft den Wert der maximumSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumSize() {
        return maximumSize;
    }

    /**
     * Legt den Wert der maximumSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumSize(Integer value) {
        this.maximumSize = value;
    }

}
