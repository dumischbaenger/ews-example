
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r NonEmptyArrayOfInternetHeadersType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfInternetHeadersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternetMessageHeader" type="{http://schemas.microsoft.com/exchange/services/2006/types}InternetHeaderType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfInternetHeadersType", propOrder = {
    "internetMessageHeader"
})
public class NonEmptyArrayOfInternetHeadersType {

    @XmlElement(name = "InternetMessageHeader", required = true)
    protected List<InternetHeaderType> internetMessageHeader;

    /**
     * Gets the value of the internetMessageHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internetMessageHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternetMessageHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternetHeaderType }
     * 
     * 
     */
    public List<InternetHeaderType> getInternetMessageHeader() {
        if (internetMessageHeader == null) {
            internetMessageHeader = new ArrayList<InternetHeaderType>();
        }
        return this.internetMessageHeader;
    }

}
