
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r TransitionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="To" type="{http://schemas.microsoft.com/exchange/services/2006/types}TransitionTargetType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitionType", propOrder = {
    "to"
})
@XmlSeeAlso({
    AbsoluteDateTransitionType.class,
    RecurringTimeTransitionType.class
})
public class TransitionType {

    @XmlElement(name = "To", required = true)
    protected TransitionTargetType to;

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransitionTargetType }
     *     
     */
    public TransitionTargetType getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionTargetType }
     *     
     */
    public void setTo(TransitionTargetType value) {
        this.to = value;
    }

}
