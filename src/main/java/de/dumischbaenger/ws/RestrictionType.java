
package de.dumischbaenger.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RestrictionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RestrictionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schemas.microsoft.com/exchange/services/2006/types}SearchExpression"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictionType", propOrder = {
    "searchExpression"
})
public class RestrictionType {

    @XmlElementRef(name = "SearchExpression", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class)
    protected JAXBElement<? extends SearchExpressionType> searchExpression;

    /**
     * Ruft den Wert der searchExpression-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExistsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsNotEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsLessThanOrEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NearType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsGreaterThanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcludesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsLessThanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsGreaterThanOrEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SearchExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContainsExpressionType }{@code >}
     *     
     */
    public JAXBElement<? extends SearchExpressionType> getSearchExpression() {
        return searchExpression;
    }

    /**
     * Legt den Wert der searchExpression-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExistsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsNotEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsLessThanOrEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AndType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NearType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsGreaterThanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExcludesType }{@code >}
     *     {@link JAXBElement }{@code <}{@link OrType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsLessThanType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsGreaterThanOrEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IsEqualToType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SearchExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ContainsExpressionType }{@code >}
     *     
     */
    public void setSearchExpression(JAXBElement<? extends SearchExpressionType> value) {
        this.searchExpression = value;
    }

}
