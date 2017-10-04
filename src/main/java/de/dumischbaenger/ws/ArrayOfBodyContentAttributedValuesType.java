
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArrayOfBodyContentAttributedValuesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBodyContentAttributedValuesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BodyContentAttributedValue" type="{http://schemas.microsoft.com/exchange/services/2006/types}BodyContentAttributedValueType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBodyContentAttributedValuesType", propOrder = {
    "bodyContentAttributedValue"
})
public class ArrayOfBodyContentAttributedValuesType {

    @XmlElement(name = "BodyContentAttributedValue")
    protected List<BodyContentAttributedValueType> bodyContentAttributedValue;

    /**
     * Gets the value of the bodyContentAttributedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodyContentAttributedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodyContentAttributedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BodyContentAttributedValueType }
     * 
     * 
     */
    public List<BodyContentAttributedValueType> getBodyContentAttributedValue() {
        if (bodyContentAttributedValue == null) {
            bodyContentAttributedValue = new ArrayList<BodyContentAttributedValueType>();
        }
        return this.bodyContentAttributedValue;
    }

}
