
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r NonEmptyArrayOfClientAccessTokenRequestsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfClientAccessTokenRequestsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TokenRequest" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientAccessTokenRequestType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfClientAccessTokenRequestsType", propOrder = {
    "tokenRequest"
})
public class NonEmptyArrayOfClientAccessTokenRequestsType {

    @XmlElement(name = "TokenRequest", required = true)
    protected List<ClientAccessTokenRequestType> tokenRequest;

    /**
     * Gets the value of the tokenRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tokenRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTokenRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientAccessTokenRequestType }
     * 
     * 
     */
    public List<ClientAccessTokenRequestType> getTokenRequest() {
        if (tokenRequest == null) {
            tokenRequest = new ArrayList<ClientAccessTokenRequestType>();
        }
        return this.tokenRequest;
    }

}
