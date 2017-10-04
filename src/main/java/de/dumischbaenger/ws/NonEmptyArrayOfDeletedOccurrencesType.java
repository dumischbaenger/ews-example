
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NonEmptyArrayOfDeletedOccurrencesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfDeletedOccurrencesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeletedOccurrence" type="{http://schemas.microsoft.com/exchange/services/2006/types}DeletedOccurrenceInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfDeletedOccurrencesType", propOrder = {
    "deletedOccurrence"
})
public class NonEmptyArrayOfDeletedOccurrencesType {

    @XmlElement(name = "DeletedOccurrence", required = true)
    protected List<DeletedOccurrenceInfoType> deletedOccurrence;

    /**
     * Gets the value of the deletedOccurrence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deletedOccurrence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeletedOccurrence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeletedOccurrenceInfoType }
     * 
     * 
     */
    public List<DeletedOccurrenceInfoType> getDeletedOccurrence() {
        if (deletedOccurrence == null) {
            deletedOccurrence = new ArrayList<DeletedOccurrenceInfoType>();
        }
        return this.deletedOccurrence;
    }

}
