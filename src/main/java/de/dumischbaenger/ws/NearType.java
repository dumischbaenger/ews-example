
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NearType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NearType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}MultipleOperandBooleanExpressionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *         &lt;element name="Ordered" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NearType", propOrder = {
    "distance",
    "ordered"
})
public class NearType
    extends MultipleOperandBooleanExpressionType
{

    @XmlElement(name = "Distance")
    @XmlSchemaType(name = "unsignedInt")
    protected long distance;
    @XmlElement(name = "Ordered")
    protected boolean ordered;

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     */
    public long getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     */
    public void setDistance(long value) {
        this.distance = value;
    }

    /**
     * Ruft den Wert der ordered-Eigenschaft ab.
     * 
     */
    public boolean isOrdered() {
        return ordered;
    }

    /**
     * Legt den Wert der ordered-Eigenschaft fest.
     * 
     */
    public void setOrdered(boolean value) {
        this.ordered = value;
    }

}
