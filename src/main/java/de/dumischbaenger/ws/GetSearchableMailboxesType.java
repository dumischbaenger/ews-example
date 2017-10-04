
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Request type for the GetSearchableMailboxes web method.
 *       
 * 
 * <p>Java-Klasse für GetSearchableMailboxesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetSearchableMailboxesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpandGroupMembership" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSearchableMailboxesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchFilter",
    "expandGroupMembership"
})
public class GetSearchableMailboxesType
    extends BaseRequestType
{

    @XmlElement(name = "SearchFilter")
    protected String searchFilter;
    @XmlElement(name = "ExpandGroupMembership")
    protected Boolean expandGroupMembership;

    /**
     * Ruft den Wert der searchFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchFilter() {
        return searchFilter;
    }

    /**
     * Legt den Wert der searchFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchFilter(String value) {
        this.searchFilter = value;
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

}
