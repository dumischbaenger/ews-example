
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FractionalPageViewType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FractionalPageViewType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BasePagingType"&gt;
 *       &lt;attribute name="Numerator" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Denominator" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FractionalPageViewType")
public class FractionalPageViewType
    extends BasePagingType
{

    @XmlAttribute(name = "Numerator", required = true)
    protected int numerator;
    @XmlAttribute(name = "Denominator", required = true)
    protected int denominator;

    /**
     * Ruft den Wert der numerator-Eigenschaft ab.
     * 
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Legt den Wert der numerator-Eigenschaft fest.
     * 
     */
    public void setNumerator(int value) {
        this.numerator = value;
    }

    /**
     * Ruft den Wert der denominator-Eigenschaft ab.
     * 
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Legt den Wert der denominator-Eigenschaft fest.
     * 
     */
    public void setDenominator(int value) {
        this.denominator = value;
    }

}
