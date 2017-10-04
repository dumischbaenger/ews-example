
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SearchResultsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchResultsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Items" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Item" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Conversations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Conversation" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="People" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Persona" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MoreResultsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RefinerTelemetryBatchId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SearchRefiners" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SearchRefiner" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchRefinerType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DiagnosticsData" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchDiagnosticsType" minOccurs="0"/&gt;
 *         &lt;element name="SearchResultsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalResultsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SearchTerms" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="QueryId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ExecuteSearchQueryIdType" minOccurs="0"/&gt;
 *         &lt;element name="MailboxesInformation" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MailboxInformation" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchResultsType", propOrder = {
    "items",
    "conversations",
    "people",
    "moreResultsAvailable",
    "refinerTelemetryBatchId",
    "searchRefiners",
    "diagnosticsData",
    "searchResultsCount",
    "totalResultsCount",
    "searchTerms",
    "queryId",
    "mailboxesInformation"
})
public class SearchResultsType {

    @XmlElement(name = "Items")
    protected SearchResultsType.Items items;
    @XmlElement(name = "Conversations")
    protected SearchResultsType.Conversations conversations;
    @XmlElement(name = "People")
    protected SearchResultsType.People people;
    @XmlElement(name = "MoreResultsAvailable")
    protected boolean moreResultsAvailable;
    @XmlElement(name = "RefinerTelemetryBatchId")
    protected int refinerTelemetryBatchId;
    @XmlElement(name = "SearchRefiners")
    protected SearchResultsType.SearchRefiners searchRefiners;
    @XmlElement(name = "DiagnosticsData")
    protected SearchDiagnosticsType diagnosticsData;
    @XmlElement(name = "SearchResultsCount")
    protected Integer searchResultsCount;
    @XmlElement(name = "TotalResultsCount")
    protected Integer totalResultsCount;
    @XmlElement(name = "SearchTerms")
    protected ArrayOfStringsType searchTerms;
    @XmlElement(name = "QueryId")
    protected ExecuteSearchQueryIdType queryId;
    @XmlElement(name = "MailboxesInformation")
    protected SearchResultsType.MailboxesInformation mailboxesInformation;

    /**
     * Ruft den Wert der items-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultsType.Items }
     *     
     */
    public SearchResultsType.Items getItems() {
        return items;
    }

    /**
     * Legt den Wert der items-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultsType.Items }
     *     
     */
    public void setItems(SearchResultsType.Items value) {
        this.items = value;
    }

    /**
     * Ruft den Wert der conversations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultsType.Conversations }
     *     
     */
    public SearchResultsType.Conversations getConversations() {
        return conversations;
    }

    /**
     * Legt den Wert der conversations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultsType.Conversations }
     *     
     */
    public void setConversations(SearchResultsType.Conversations value) {
        this.conversations = value;
    }

    /**
     * Ruft den Wert der people-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultsType.People }
     *     
     */
    public SearchResultsType.People getPeople() {
        return people;
    }

    /**
     * Legt den Wert der people-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultsType.People }
     *     
     */
    public void setPeople(SearchResultsType.People value) {
        this.people = value;
    }

    /**
     * Ruft den Wert der moreResultsAvailable-Eigenschaft ab.
     * 
     */
    public boolean isMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    /**
     * Legt den Wert der moreResultsAvailable-Eigenschaft fest.
     * 
     */
    public void setMoreResultsAvailable(boolean value) {
        this.moreResultsAvailable = value;
    }

    /**
     * Ruft den Wert der refinerTelemetryBatchId-Eigenschaft ab.
     * 
     */
    public int getRefinerTelemetryBatchId() {
        return refinerTelemetryBatchId;
    }

    /**
     * Legt den Wert der refinerTelemetryBatchId-Eigenschaft fest.
     * 
     */
    public void setRefinerTelemetryBatchId(int value) {
        this.refinerTelemetryBatchId = value;
    }

    /**
     * Ruft den Wert der searchRefiners-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultsType.SearchRefiners }
     *     
     */
    public SearchResultsType.SearchRefiners getSearchRefiners() {
        return searchRefiners;
    }

    /**
     * Legt den Wert der searchRefiners-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultsType.SearchRefiners }
     *     
     */
    public void setSearchRefiners(SearchResultsType.SearchRefiners value) {
        this.searchRefiners = value;
    }

    /**
     * Ruft den Wert der diagnosticsData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchDiagnosticsType }
     *     
     */
    public SearchDiagnosticsType getDiagnosticsData() {
        return diagnosticsData;
    }

    /**
     * Legt den Wert der diagnosticsData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDiagnosticsType }
     *     
     */
    public void setDiagnosticsData(SearchDiagnosticsType value) {
        this.diagnosticsData = value;
    }

    /**
     * Ruft den Wert der searchResultsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSearchResultsCount() {
        return searchResultsCount;
    }

    /**
     * Legt den Wert der searchResultsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSearchResultsCount(Integer value) {
        this.searchResultsCount = value;
    }

    /**
     * Ruft den Wert der totalResultsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalResultsCount() {
        return totalResultsCount;
    }

    /**
     * Legt den Wert der totalResultsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalResultsCount(Integer value) {
        this.totalResultsCount = value;
    }

    /**
     * Ruft den Wert der searchTerms-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getSearchTerms() {
        return searchTerms;
    }

    /**
     * Legt den Wert der searchTerms-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setSearchTerms(ArrayOfStringsType value) {
        this.searchTerms = value;
    }

    /**
     * Ruft den Wert der queryId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExecuteSearchQueryIdType }
     *     
     */
    public ExecuteSearchQueryIdType getQueryId() {
        return queryId;
    }

    /**
     * Legt den Wert der queryId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecuteSearchQueryIdType }
     *     
     */
    public void setQueryId(ExecuteSearchQueryIdType value) {
        this.queryId = value;
    }

    /**
     * Ruft den Wert der mailboxesInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchResultsType.MailboxesInformation }
     *     
     */
    public SearchResultsType.MailboxesInformation getMailboxesInformation() {
        return mailboxesInformation;
    }

    /**
     * Legt den Wert der mailboxesInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResultsType.MailboxesInformation }
     *     
     */
    public void setMailboxesInformation(SearchResultsType.MailboxesInformation value) {
        this.mailboxesInformation = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Conversation" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConversationType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "conversation"
    })
    public static class Conversations {

        @XmlElement(name = "Conversation")
        protected List<ConversationType> conversation;

        /**
         * Gets the value of the conversation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the conversation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConversation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConversationType }
         * 
         * 
         */
        public List<ConversationType> getConversation() {
            if (conversation == null) {
                conversation = new ArrayList<ConversationType>();
            }
            return this.conversation;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Item" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Items {

        @XmlElement(name = "Item")
        protected List<ItemType> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemType }
         * 
         * 
         */
        public List<ItemType> getItem() {
            if (item == null) {
                item = new ArrayList<ItemType>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="MailboxInformation" type="{http://schemas.microsoft.com/exchange/services/2006/types}MailboxInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mailboxInformation"
    })
    public static class MailboxesInformation {

        @XmlElement(name = "MailboxInformation")
        protected List<MailboxInformationType> mailboxInformation;

        /**
         * Gets the value of the mailboxInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mailboxInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMailboxInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MailboxInformationType }
         * 
         * 
         */
        public List<MailboxInformationType> getMailboxInformation() {
            if (mailboxInformation == null) {
                mailboxInformation = new ArrayList<MailboxInformationType>();
            }
            return this.mailboxInformation;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Persona" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "persona"
    })
    public static class People {

        @XmlElement(name = "Persona")
        protected List<PersonaType> persona;

        /**
         * Gets the value of the persona property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the persona property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPersona().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PersonaType }
         * 
         * 
         */
        public List<PersonaType> getPersona() {
            if (persona == null) {
                persona = new ArrayList<PersonaType>();
            }
            return this.persona;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SearchRefiner" type="{http://schemas.microsoft.com/exchange/services/2006/types}SearchRefinerType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "searchRefiner"
    })
    public static class SearchRefiners {

        @XmlElement(name = "SearchRefiner", required = true)
        protected List<SearchRefinerType> searchRefiner;

        /**
         * Gets the value of the searchRefiner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the searchRefiner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSearchRefiner().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchRefinerType }
         * 
         * 
         */
        public List<SearchRefinerType> getSearchRefiner() {
            if (searchRefiner == null) {
                searchRefiner = new ArrayList<SearchRefinerType>();
            }
            return this.searchRefiner;
        }

    }

}
