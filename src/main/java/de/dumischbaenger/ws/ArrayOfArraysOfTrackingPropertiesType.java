
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ArrayOfArraysOfTrackingPropertiesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArraysOfTrackingPropertiesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="ArrayOfTrackingPropertiesType" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfTrackingPropertiesType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArraysOfTrackingPropertiesType", propOrder = {
    "arrayOfTrackingPropertiesType"
})
public class ArrayOfArraysOfTrackingPropertiesType {

    @XmlElement(name = "ArrayOfTrackingPropertiesType")
    protected List<ArrayOfTrackingPropertiesType> arrayOfTrackingPropertiesType;

    /**
     * Gets the value of the arrayOfTrackingPropertiesType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfTrackingPropertiesType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrayOfTrackingPropertiesType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfTrackingPropertiesType }
     * 
     * 
     */
    public List<ArrayOfTrackingPropertiesType> getArrayOfTrackingPropertiesType() {
        if (arrayOfTrackingPropertiesType == null) {
            arrayOfTrackingPropertiesType = new ArrayList<ArrayOfTrackingPropertiesType>();
        }
        return this.arrayOfTrackingPropertiesType;
    }

}
