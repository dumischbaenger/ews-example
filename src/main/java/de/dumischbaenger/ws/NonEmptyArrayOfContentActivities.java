
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r NonEmptyArrayOfContentActivities complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfContentActivities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentActivity" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContentActivity" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfContentActivities", propOrder = {
    "contentActivity"
})
public class NonEmptyArrayOfContentActivities {

    @XmlElement(name = "ContentActivity", required = true)
    protected List<ContentActivity> contentActivity;

    /**
     * Gets the value of the contentActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentActivity }
     * 
     * 
     */
    public List<ContentActivity> getContentActivity() {
        if (contentActivity == null) {
            contentActivity = new ArrayList<ContentActivity>();
        }
        return this.contentActivity;
    }

}
