
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EmailInsightValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EmailInsightValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}InsightValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ThreadId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastEmailDateUtcTicks" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LastEmailSender" type="{http://schemas.microsoft.com/exchange/services/2006/types}ProfileInsightValue" minOccurs="0"/&gt;
 *         &lt;element name="EmailsCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailInsightValue", propOrder = {
    "id",
    "threadId",
    "subject",
    "lastEmailDateUtcTicks",
    "body",
    "lastEmailSender",
    "emailsCount"
})
public class EmailInsightValue
    extends InsightValue
{

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ThreadId")
    protected String threadId;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "LastEmailDateUtcTicks")
    protected Long lastEmailDateUtcTicks;
    @XmlElement(name = "Body")
    protected String body;
    @XmlElement(name = "LastEmailSender")
    protected ProfileInsightValue lastEmailSender;
    @XmlElement(name = "EmailsCount")
    protected Integer emailsCount;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der threadId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadId() {
        return threadId;
    }

    /**
     * Legt den Wert der threadId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadId(String value) {
        this.threadId = value;
    }

    /**
     * Ruft den Wert der subject-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Legt den Wert der subject-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Ruft den Wert der lastEmailDateUtcTicks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastEmailDateUtcTicks() {
        return lastEmailDateUtcTicks;
    }

    /**
     * Legt den Wert der lastEmailDateUtcTicks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastEmailDateUtcTicks(Long value) {
        this.lastEmailDateUtcTicks = value;
    }

    /**
     * Ruft den Wert der body-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Legt den Wert der body-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Ruft den Wert der lastEmailSender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProfileInsightValue }
     *     
     */
    public ProfileInsightValue getLastEmailSender() {
        return lastEmailSender;
    }

    /**
     * Legt den Wert der lastEmailSender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileInsightValue }
     *     
     */
    public void setLastEmailSender(ProfileInsightValue value) {
        this.lastEmailSender = value;
    }

    /**
     * Ruft den Wert der emailsCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmailsCount() {
        return emailsCount;
    }

    /**
     * Legt den Wert der emailsCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmailsCount(Integer value) {
        this.emailsCount = value;
    }

}
