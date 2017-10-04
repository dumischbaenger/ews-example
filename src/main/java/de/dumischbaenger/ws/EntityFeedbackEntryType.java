
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für EntityFeedbackEntryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EntityFeedbackEntryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientEventTimeUTC" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ClientEventTimeLocal" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ClientSessionId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/&gt;
 *         &lt;element name="ClientVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ClientId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientIdType"/&gt;
 *         &lt;element name="EntrySequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EventType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TargetEntityList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EntityAddSource" type="{http://schemas.microsoft.com/exchange/services/2006/types}EntityFeedbackEntityAddSourceType" minOccurs="0"/&gt;
 *         &lt;element name="JsonPropertyBag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityFeedbackEntryType", propOrder = {
    "clientEventTimeUTC",
    "clientEventTimeLocal",
    "clientSessionId",
    "clientVersion",
    "clientId",
    "entrySequenceNumber",
    "transactionId",
    "eventType",
    "targetEntityList",
    "entityAddSource",
    "jsonPropertyBag"
})
public class EntityFeedbackEntryType {

    @XmlElement(name = "ClientEventTimeUTC", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientEventTimeUTC;
    @XmlElement(name = "ClientEventTimeLocal", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientEventTimeLocal;
    @XmlElement(name = "ClientSessionId", required = true)
    protected String clientSessionId;
    @XmlElement(name = "ClientVersion", required = true)
    protected String clientVersion;
    @XmlElement(name = "ClientId", required = true)
    @XmlSchemaType(name = "string")
    protected ClientIdType clientId;
    @XmlElement(name = "EntrySequenceNumber")
    protected int entrySequenceNumber;
    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "EventType", required = true)
    protected String eventType;
    @XmlElement(name = "TargetEntityList")
    protected String targetEntityList;
    @XmlElement(name = "EntityAddSource")
    @XmlSchemaType(name = "string")
    protected EntityFeedbackEntityAddSourceType entityAddSource;
    @XmlElement(name = "JsonPropertyBag")
    protected String jsonPropertyBag;

    /**
     * Ruft den Wert der clientEventTimeUTC-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClientEventTimeUTC() {
        return clientEventTimeUTC;
    }

    /**
     * Legt den Wert der clientEventTimeUTC-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClientEventTimeUTC(XMLGregorianCalendar value) {
        this.clientEventTimeUTC = value;
    }

    /**
     * Ruft den Wert der clientEventTimeLocal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClientEventTimeLocal() {
        return clientEventTimeLocal;
    }

    /**
     * Legt den Wert der clientEventTimeLocal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClientEventTimeLocal(XMLGregorianCalendar value) {
        this.clientEventTimeLocal = value;
    }

    /**
     * Ruft den Wert der clientSessionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSessionId() {
        return clientSessionId;
    }

    /**
     * Legt den Wert der clientSessionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSessionId(String value) {
        this.clientSessionId = value;
    }

    /**
     * Ruft den Wert der clientVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientVersion() {
        return clientVersion;
    }

    /**
     * Legt den Wert der clientVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientVersion(String value) {
        this.clientVersion = value;
    }

    /**
     * Ruft den Wert der clientId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClientIdType }
     *     
     */
    public ClientIdType getClientId() {
        return clientId;
    }

    /**
     * Legt den Wert der clientId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientIdType }
     *     
     */
    public void setClientId(ClientIdType value) {
        this.clientId = value;
    }

    /**
     * Ruft den Wert der entrySequenceNumber-Eigenschaft ab.
     * 
     */
    public int getEntrySequenceNumber() {
        return entrySequenceNumber;
    }

    /**
     * Legt den Wert der entrySequenceNumber-Eigenschaft fest.
     * 
     */
    public void setEntrySequenceNumber(int value) {
        this.entrySequenceNumber = value;
    }

    /**
     * Ruft den Wert der transactionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Legt den Wert der transactionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Ruft den Wert der eventType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Legt den Wert der eventType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Ruft den Wert der targetEntityList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetEntityList() {
        return targetEntityList;
    }

    /**
     * Legt den Wert der targetEntityList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetEntityList(String value) {
        this.targetEntityList = value;
    }

    /**
     * Ruft den Wert der entityAddSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntityFeedbackEntityAddSourceType }
     *     
     */
    public EntityFeedbackEntityAddSourceType getEntityAddSource() {
        return entityAddSource;
    }

    /**
     * Legt den Wert der entityAddSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityFeedbackEntityAddSourceType }
     *     
     */
    public void setEntityAddSource(EntityFeedbackEntityAddSourceType value) {
        this.entityAddSource = value;
    }

    /**
     * Ruft den Wert der jsonPropertyBag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsonPropertyBag() {
        return jsonPropertyBag;
    }

    /**
     * Legt den Wert der jsonPropertyBag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsonPropertyBag(String value) {
        this.jsonPropertyBag = value;
    }

}
