
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArrayOfPostalAddressAttributedValuesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPostalAddressAttributedValuesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostalAddressAttributedValue" type="{http://schemas.microsoft.com/exchange/services/2006/types}PostalAddressAttributedValueType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPostalAddressAttributedValuesType", propOrder = {
    "postalAddressAttributedValue"
})
public class ArrayOfPostalAddressAttributedValuesType {

    @XmlElement(name = "PostalAddressAttributedValue")
    protected List<PostalAddressAttributedValueType> postalAddressAttributedValue;

    /**
     * Gets the value of the postalAddressAttributedValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddressAttributedValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddressAttributedValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddressAttributedValueType }
     * 
     * 
     */
    public List<PostalAddressAttributedValueType> getPostalAddressAttributedValue() {
        if (postalAddressAttributedValue == null) {
            postalAddressAttributedValue = new ArrayList<PostalAddressAttributedValueType>();
        }
        return this.postalAddressAttributedValue;
    }

}
