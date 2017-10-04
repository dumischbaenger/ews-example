
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InstantSearchPayloadType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InstantSearchPayloadType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SearchSessionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SearchRequestId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ResultType" type="{http://schemas.microsoft.com/exchange/services/2006/types}InstantSearchResultType"/&gt;
 *         &lt;element name="Items" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfItemsType" minOccurs="0"/&gt;
 *         &lt;element name="Conversations" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfConversationsType" minOccurs="0"/&gt;
 *         &lt;element name="CalendarItems" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfCalendarItemsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstantSearchPayloadType", propOrder = {
    "searchSessionId",
    "searchRequestId",
    "resultType",
    "items",
    "conversations",
    "calendarItems"
})
public class InstantSearchPayloadType {

    @XmlElement(name = "SearchSessionId", required = true)
    protected String searchSessionId;
    @XmlElement(name = "SearchRequestId")
    protected long searchRequestId;
    @XmlList
    @XmlElement(name = "ResultType", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> resultType;
    @XmlElement(name = "Items")
    protected ArrayOfItemsType items;
    @XmlElement(name = "Conversations")
    protected ArrayOfConversationsType conversations;
    @XmlElement(name = "CalendarItems")
    protected ArrayOfCalendarItemsType calendarItems;

    /**
     * Ruft den Wert der searchSessionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchSessionId() {
        return searchSessionId;
    }

    /**
     * Legt den Wert der searchSessionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchSessionId(String value) {
        this.searchSessionId = value;
    }

    /**
     * Ruft den Wert der searchRequestId-Eigenschaft ab.
     * 
     */
    public long getSearchRequestId() {
        return searchRequestId;
    }

    /**
     * Legt den Wert der searchRequestId-Eigenschaft fest.
     * 
     */
    public void setSearchRequestId(long value) {
        this.searchRequestId = value;
    }

    /**
     * Gets the value of the resultType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getResultType() {
        if (resultType == null) {
            resultType = new ArrayList<String>();
        }
        return this.resultType;
    }

    /**
     * Ruft den Wert der items-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItemsType }
     *     
     */
    public ArrayOfItemsType getItems() {
        return items;
    }

    /**
     * Legt den Wert der items-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItemsType }
     *     
     */
    public void setItems(ArrayOfItemsType value) {
        this.items = value;
    }

    /**
     * Ruft den Wert der conversations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfConversationsType }
     *     
     */
    public ArrayOfConversationsType getConversations() {
        return conversations;
    }

    /**
     * Legt den Wert der conversations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfConversationsType }
     *     
     */
    public void setConversations(ArrayOfConversationsType value) {
        this.conversations = value;
    }

    /**
     * Ruft den Wert der calendarItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCalendarItemsType }
     *     
     */
    public ArrayOfCalendarItemsType getCalendarItems() {
        return calendarItems;
    }

    /**
     * Legt den Wert der calendarItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCalendarItemsType }
     *     
     */
    public void setCalendarItems(ArrayOfCalendarItemsType value) {
        this.calendarItems = value;
    }

}
