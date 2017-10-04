
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java-Klasse für RecurringTimeTransitionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RecurringTimeTransitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}TransitionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeOffset" type="{http://www.w3.org/2001/XMLSchema}duration"/&gt;
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringTimeTransitionType", propOrder = {
    "timeOffset",
    "month"
})
@XmlSeeAlso({
    RecurringDayTransitionType.class,
    RecurringDateTransitionType.class
})
public abstract class RecurringTimeTransitionType
    extends TransitionType
{

    @XmlElement(name = "TimeOffset", required = true)
    protected Duration timeOffset;
    @XmlElement(name = "Month")
    protected int month;

    /**
     * Ruft den Wert der timeOffset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeOffset() {
        return timeOffset;
    }

    /**
     * Legt den Wert der timeOffset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeOffset(Duration value) {
        this.timeOffset = value;
    }

    /**
     * Ruft den Wert der month-Eigenschaft ab.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Legt den Wert der month-Eigenschaft fest.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

}
