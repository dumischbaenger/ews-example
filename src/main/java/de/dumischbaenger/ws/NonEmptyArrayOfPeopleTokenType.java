
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NonEmptyArrayOfPeopleTokenType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfPeopleTokenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PeopleToken" type="{http://schemas.microsoft.com/exchange/services/2006/types}PeopleTokenType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfPeopleTokenType", propOrder = {
    "peopleToken"
})
public class NonEmptyArrayOfPeopleTokenType {

    @XmlElement(name = "PeopleToken", required = true)
    protected List<PeopleTokenType> peopleToken;

    /**
     * Gets the value of the peopleToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peopleToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeopleToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeopleTokenType }
     * 
     * 
     */
    public List<PeopleTokenType> getPeopleToken() {
        if (peopleToken == null) {
            peopleToken = new ArrayList<PeopleTokenType>();
        }
        return this.peopleToken;
    }

}
