
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Array of retention policy tags.
 *       
 * 
 * <p>Java-Klasse für ArrayOfRetentionPolicyTagsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRetentionPolicyTagsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetentionPolicyTag" type="{http://schemas.microsoft.com/exchange/services/2006/types}RetentionPolicyTagType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRetentionPolicyTagsType", propOrder = {
    "retentionPolicyTag"
})
public class ArrayOfRetentionPolicyTagsType {

    @XmlElement(name = "RetentionPolicyTag")
    protected List<RetentionPolicyTagType> retentionPolicyTag;

    /**
     * Gets the value of the retentionPolicyTag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retentionPolicyTag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetentionPolicyTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetentionPolicyTagType }
     * 
     * 
     */
    public List<RetentionPolicyTagType> getRetentionPolicyTag() {
        if (retentionPolicyTag == null) {
            retentionPolicyTag = new ArrayList<RetentionPolicyTagType>();
        }
        return this.retentionPolicyTag;
    }

}
