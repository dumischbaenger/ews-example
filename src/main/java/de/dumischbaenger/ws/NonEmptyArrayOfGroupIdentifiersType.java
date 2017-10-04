
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NonEmptyArrayOfGroupIdentifiersType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfGroupIdentifiersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupIdentifier" type="{http://schemas.microsoft.com/exchange/services/2006/types}SidAndAttributesType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfGroupIdentifiersType", propOrder = {
    "groupIdentifier"
})
public class NonEmptyArrayOfGroupIdentifiersType {

    @XmlElement(name = "GroupIdentifier", required = true)
    protected List<SidAndAttributesType> groupIdentifier;

    /**
     * Gets the value of the groupIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SidAndAttributesType }
     * 
     * 
     */
    public List<SidAndAttributesType> getGroupIdentifier() {
        if (groupIdentifier == null) {
            groupIdentifier = new ArrayList<SidAndAttributesType>();
        }
        return this.groupIdentifier;
    }

}
