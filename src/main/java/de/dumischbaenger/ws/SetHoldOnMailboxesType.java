
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *           Request type for the SetHoldOnMailboxes web method.
 *         
 * 
 * <p>Java-Klasse für SetHoldOnMailboxesType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SetHoldOnMailboxesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionType" type="{http://schemas.microsoft.com/exchange/services/2006/types}HoldActionType"/&gt;
 *         &lt;element name="HoldId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Mailboxes" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludeNonIndexableItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Deduplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InPlaceHoldIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ItemHoldPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetHoldOnMailboxesType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "actionType",
    "holdId",
    "query",
    "mailboxes",
    "language",
    "includeNonIndexableItems",
    "deduplication",
    "inPlaceHoldIdentity",
    "itemHoldPeriod"
})
public class SetHoldOnMailboxesType
    extends BaseRequestType
{

    @XmlElement(name = "ActionType", required = true)
    @XmlSchemaType(name = "string")
    protected HoldActionType actionType;
    @XmlElement(name = "HoldId", required = true)
    protected String holdId;
    @XmlElement(name = "Query", required = true)
    protected String query;
    @XmlElement(name = "Mailboxes")
    protected ArrayOfStringsType mailboxes;
    @XmlElement(name = "Language")
    protected String language;
    @XmlElement(name = "IncludeNonIndexableItems")
    protected Boolean includeNonIndexableItems;
    @XmlElement(name = "Deduplication")
    protected Boolean deduplication;
    @XmlElement(name = "InPlaceHoldIdentity")
    protected String inPlaceHoldIdentity;
    @XmlElement(name = "ItemHoldPeriod")
    protected String itemHoldPeriod;

    /**
     * Ruft den Wert der actionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HoldActionType }
     *     
     */
    public HoldActionType getActionType() {
        return actionType;
    }

    /**
     * Legt den Wert der actionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldActionType }
     *     
     */
    public void setActionType(HoldActionType value) {
        this.actionType = value;
    }

    /**
     * Ruft den Wert der holdId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldId() {
        return holdId;
    }

    /**
     * Legt den Wert der holdId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldId(String value) {
        this.holdId = value;
    }

    /**
     * Ruft den Wert der query-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Legt den Wert der query-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

    /**
     * Ruft den Wert der mailboxes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getMailboxes() {
        return mailboxes;
    }

    /**
     * Legt den Wert der mailboxes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setMailboxes(ArrayOfStringsType value) {
        this.mailboxes = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Ruft den Wert der includeNonIndexableItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeNonIndexableItems() {
        return includeNonIndexableItems;
    }

    /**
     * Legt den Wert der includeNonIndexableItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeNonIndexableItems(Boolean value) {
        this.includeNonIndexableItems = value;
    }

    /**
     * Ruft den Wert der deduplication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeduplication() {
        return deduplication;
    }

    /**
     * Legt den Wert der deduplication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeduplication(Boolean value) {
        this.deduplication = value;
    }

    /**
     * Ruft den Wert der inPlaceHoldIdentity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPlaceHoldIdentity() {
        return inPlaceHoldIdentity;
    }

    /**
     * Legt den Wert der inPlaceHoldIdentity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPlaceHoldIdentity(String value) {
        this.inPlaceHoldIdentity = value;
    }

    /**
     * Ruft den Wert der itemHoldPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemHoldPeriod() {
        return itemHoldPeriod;
    }

    /**
     * Legt den Wert der itemHoldPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemHoldPeriod(String value) {
        this.itemHoldPeriod = value;
    }

}
