
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Response message type for the GetSearchableMailboxes web method.
 *         
 * 
 * <p>Java-Klasse für GetSearchableMailboxesResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetSearchableMailboxesResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchableMailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSearchableMailboxesType"/&gt;
 *         &lt;element name="FailedMailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfFailedSearchMailboxesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSearchableMailboxesResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchableMailboxes",
    "failedMailboxes"
})
public class GetSearchableMailboxesResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "SearchableMailboxes", required = true)
    protected ArrayOfSearchableMailboxesType searchableMailboxes;
    @XmlElement(name = "FailedMailboxes")
    protected ArrayOfFailedSearchMailboxesType failedMailboxes;

    /**
     * Ruft den Wert der searchableMailboxes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSearchableMailboxesType }
     *     
     */
    public ArrayOfSearchableMailboxesType getSearchableMailboxes() {
        return searchableMailboxes;
    }

    /**
     * Legt den Wert der searchableMailboxes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSearchableMailboxesType }
     *     
     */
    public void setSearchableMailboxes(ArrayOfSearchableMailboxesType value) {
        this.searchableMailboxes = value;
    }

    /**
     * Ruft den Wert der failedMailboxes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFailedSearchMailboxesType }
     *     
     */
    public ArrayOfFailedSearchMailboxesType getFailedMailboxes() {
        return failedMailboxes;
    }

    /**
     * Legt den Wert der failedMailboxes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFailedSearchMailboxesType }
     *     
     */
    public void setFailedMailboxes(ArrayOfFailedSearchMailboxesType value) {
        this.failedMailboxes = value;
    }

}
