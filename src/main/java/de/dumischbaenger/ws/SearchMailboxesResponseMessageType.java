
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response message type for the SearchMailboxes web method.
 *       
 * 
 * <p>Java-Klasse für SearchMailboxesResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchMailboxesResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchMailboxesResult" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchMailboxesResultType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchMailboxesResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "searchMailboxesResult"
})
public class SearchMailboxesResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "SearchMailboxesResult")
    protected SearchMailboxesResultType searchMailboxesResult;

    /**
     * Ruft den Wert der searchMailboxesResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchMailboxesResultType }
     *     
     */
    public SearchMailboxesResultType getSearchMailboxesResult() {
        return searchMailboxesResult;
    }

    /**
     * Legt den Wert der searchMailboxesResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMailboxesResultType }
     *     
     */
    public void setSearchMailboxesResult(SearchMailboxesResultType value) {
        this.searchMailboxesResult = value;
    }

}
