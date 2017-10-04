
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NonEmptyArrayOfAppliedHashtagType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfAppliedHashtagType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppliedHashtag" type="{http://schemas.microsoft.com/exchange/services/2006/types}AppliedHashtagType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfAppliedHashtagType", propOrder = {
    "appliedHashtag"
})
public class NonEmptyArrayOfAppliedHashtagType {

    @XmlElement(name = "AppliedHashtag", required = true)
    protected List<AppliedHashtagType> appliedHashtag;

    /**
     * Gets the value of the appliedHashtag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appliedHashtag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppliedHashtag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppliedHashtagType }
     * 
     * 
     */
    public List<AppliedHashtagType> getAppliedHashtag() {
        if (appliedHashtag == null) {
            appliedHashtag = new ArrayList<AppliedHashtagType>();
        }
        return this.appliedHashtag;
    }

}
