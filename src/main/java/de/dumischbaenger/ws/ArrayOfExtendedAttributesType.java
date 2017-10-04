
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Array of extended attributes of a target mailbox
 *       
 * 
 * <p>Java-Klasse für ArrayOfExtendedAttributesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExtendedAttributesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtendedAttribute" type="{http://schemas.microsoft.com/exchange/services/2006/types}ExtendedAttributeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtendedAttributesType", propOrder = {
    "extendedAttribute"
})
public class ArrayOfExtendedAttributesType {

    @XmlElement(name = "ExtendedAttribute")
    protected List<ExtendedAttributeType> extendedAttribute;

    /**
     * Gets the value of the extendedAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedAttributeType }
     * 
     * 
     */
    public List<ExtendedAttributeType> getExtendedAttribute() {
        if (extendedAttribute == null) {
            extendedAttribute = new ArrayList<ExtendedAttributeType>();
        }
        return this.extendedAttribute;
    }

}
