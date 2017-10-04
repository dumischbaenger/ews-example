
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ComputedInsightValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ComputedInsightValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}InsightValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Properties" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfComputedInsightValueProperty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputedInsightValue", propOrder = {
    "properties"
})
public class ComputedInsightValue
    extends InsightValue
{

    @XmlElement(name = "Properties")
    protected ArrayOfComputedInsightValueProperty properties;

    /**
     * Ruft den Wert der properties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfComputedInsightValueProperty }
     *     
     */
    public ArrayOfComputedInsightValueProperty getProperties() {
        return properties;
    }

    /**
     * Legt den Wert der properties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfComputedInsightValueProperty }
     *     
     */
    public void setProperties(ArrayOfComputedInsightValueProperty value) {
        this.properties = value;
    }

}
