
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Mailbox hold result.
 *       
 * 
 * <p>Java-Klasse für MailboxHoldResultType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MailboxHoldResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HoldId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailboxHoldStatuses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfMailboxHoldStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MailboxHoldResultType", propOrder = {
    "holdId",
    "query",
    "mailboxHoldStatuses"
})
public class MailboxHoldResultType {

    @XmlElement(name = "HoldId", required = true)
    protected String holdId;
    @XmlElement(name = "Query")
    protected String query;
    @XmlElement(name = "MailboxHoldStatuses", required = true)
    protected ArrayOfMailboxHoldStatusType mailboxHoldStatuses;

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
     * Ruft den Wert der mailboxHoldStatuses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailboxHoldStatusType }
     *     
     */
    public ArrayOfMailboxHoldStatusType getMailboxHoldStatuses() {
        return mailboxHoldStatuses;
    }

    /**
     * Legt den Wert der mailboxHoldStatuses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailboxHoldStatusType }
     *     
     */
    public void setMailboxHoldStatuses(ArrayOfMailboxHoldStatusType value) {
        this.mailboxHoldStatuses = value;
    }

}
