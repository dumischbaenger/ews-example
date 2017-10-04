
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetClientAccessTokenType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetClientAccessTokenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TokenRequests" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfClientAccessTokenRequestsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetClientAccessTokenType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "tokenRequests"
})
public class GetClientAccessTokenType
    extends BaseRequestType
{

    @XmlElement(name = "TokenRequests", required = true)
    protected NonEmptyArrayOfClientAccessTokenRequestsType tokenRequests;

    /**
     * Ruft den Wert der tokenRequests-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfClientAccessTokenRequestsType }
     *     
     */
    public NonEmptyArrayOfClientAccessTokenRequestsType getTokenRequests() {
        return tokenRequests;
    }

    /**
     * Legt den Wert der tokenRequests-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfClientAccessTokenRequestsType }
     *     
     */
    public void setTokenRequests(NonEmptyArrayOfClientAccessTokenRequestsType value) {
        this.tokenRequests = value;
    }

}
