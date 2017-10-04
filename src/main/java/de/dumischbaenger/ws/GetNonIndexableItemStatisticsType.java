
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Request type for the GetNonIndexableItemStatistics web method.
 *       
 * 
 * <p>Java-Klasse für GetNonIndexableItemStatisticsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetNonIndexableItemStatisticsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfLegacyDNsType"/&gt;
 *         &lt;element name="SearchArchiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNonIndexableItemStatisticsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "mailboxes",
    "searchArchiveOnly"
})
public class GetNonIndexableItemStatisticsType
    extends BaseRequestType
{

    @XmlElement(name = "Mailboxes", required = true)
    protected NonEmptyArrayOfLegacyDNsType mailboxes;
    @XmlElement(name = "SearchArchiveOnly")
    protected Boolean searchArchiveOnly;

    /**
     * Ruft den Wert der mailboxes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfLegacyDNsType }
     *     
     */
    public NonEmptyArrayOfLegacyDNsType getMailboxes() {
        return mailboxes;
    }

    /**
     * Legt den Wert der mailboxes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfLegacyDNsType }
     *     
     */
    public void setMailboxes(NonEmptyArrayOfLegacyDNsType value) {
        this.mailboxes = value;
    }

    /**
     * Ruft den Wert der searchArchiveOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearchArchiveOnly() {
        return searchArchiveOnly;
    }

    /**
     * Legt den Wert der searchArchiveOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchArchiveOnly(Boolean value) {
        this.searchArchiveOnly = value;
    }

}
