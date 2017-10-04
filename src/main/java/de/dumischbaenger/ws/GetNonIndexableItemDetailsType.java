
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Request type for the GetNonIndexableItemDetails web method.
 *       
 * 
 * <p>Java-Klasse für GetNonIndexableItemDetailsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetNonIndexableItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfLegacyDNsType"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PageItemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PageDirection" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchPageDirectionType" minOccurs="0"/&gt;
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
@XmlType(name = "GetNonIndexableItemDetailsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "mailboxes",
    "pageSize",
    "pageItemReference",
    "pageDirection",
    "searchArchiveOnly"
})
public class GetNonIndexableItemDetailsType
    extends BaseRequestType
{

    @XmlElement(name = "Mailboxes", required = true)
    protected NonEmptyArrayOfLegacyDNsType mailboxes;
    @XmlElement(name = "PageSize")
    protected Integer pageSize;
    @XmlElement(name = "PageItemReference")
    protected String pageItemReference;
    @XmlElement(name = "PageDirection")
    @XmlSchemaType(name = "string")
    protected SearchPageDirectionType pageDirection;
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
     * Ruft den Wert der pageSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Legt den Wert der pageSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageSize(Integer value) {
        this.pageSize = value;
    }

    /**
     * Ruft den Wert der pageItemReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageItemReference() {
        return pageItemReference;
    }

    /**
     * Legt den Wert der pageItemReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageItemReference(String value) {
        this.pageItemReference = value;
    }

    /**
     * Ruft den Wert der pageDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchPageDirectionType }
     *     
     */
    public SearchPageDirectionType getPageDirection() {
        return pageDirection;
    }

    /**
     * Legt den Wert der pageDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchPageDirectionType }
     *     
     */
    public void setPageDirection(SearchPageDirectionType value) {
        this.pageDirection = value;
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
