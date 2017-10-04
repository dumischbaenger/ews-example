
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Request type for the GetDiscoverySearchConfiguration web method.
 *       
 * 
 * <p>Java-Klasse für GetDiscoverySearchConfigurationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetDiscoverySearchConfigurationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpandGroupMembership" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InPlaceHoldConfigurationOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDiscoverySearchConfigurationType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchId",
    "expandGroupMembership",
    "inPlaceHoldConfigurationOnly"
})
public class GetDiscoverySearchConfigurationType
    extends BaseRequestType
{

    @XmlElement(name = "SearchId")
    protected String searchId;
    @XmlElement(name = "ExpandGroupMembership")
    protected Boolean expandGroupMembership;
    @XmlElement(name = "InPlaceHoldConfigurationOnly")
    protected Boolean inPlaceHoldConfigurationOnly;

    /**
     * Ruft den Wert der searchId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * Legt den Wert der searchId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchId(String value) {
        this.searchId = value;
    }

    /**
     * Ruft den Wert der expandGroupMembership-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpandGroupMembership() {
        return expandGroupMembership;
    }

    /**
     * Legt den Wert der expandGroupMembership-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpandGroupMembership(Boolean value) {
        this.expandGroupMembership = value;
    }

    /**
     * Ruft den Wert der inPlaceHoldConfigurationOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInPlaceHoldConfigurationOnly() {
        return inPlaceHoldConfigurationOnly;
    }

    /**
     * Legt den Wert der inPlaceHoldConfigurationOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInPlaceHoldConfigurationOnly(Boolean value) {
        this.inPlaceHoldConfigurationOnly = value;
    }

}
