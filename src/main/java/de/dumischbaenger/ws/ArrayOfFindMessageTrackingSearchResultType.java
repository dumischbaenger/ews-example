
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ArrayOfFindMessageTrackingSearchResultType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFindMessageTrackingSearchResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="MessageTrackingSearchResult" type="{http://schemas.microsoft.com/exchange/services/2006/types}FindMessageTrackingSearchResultType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFindMessageTrackingSearchResultType", propOrder = {
    "messageTrackingSearchResult"
})
public class ArrayOfFindMessageTrackingSearchResultType {

    @XmlElement(name = "MessageTrackingSearchResult")
    protected List<FindMessageTrackingSearchResultType> messageTrackingSearchResult;

    /**
     * Gets the value of the messageTrackingSearchResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageTrackingSearchResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageTrackingSearchResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FindMessageTrackingSearchResultType }
     * 
     * 
     */
    public List<FindMessageTrackingSearchResultType> getMessageTrackingSearchResult() {
        if (messageTrackingSearchResult == null) {
            messageTrackingSearchResult = new ArrayList<FindMessageTrackingSearchResultType>();
        }
        return this.messageTrackingSearchResult;
    }

}
