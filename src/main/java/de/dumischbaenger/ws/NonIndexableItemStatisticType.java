
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Non indexable item statistic.
 *       
 * 
 * <p>Java-Klasse für NonIndexableItemStatisticType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonIndexableItemStatisticType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mailbox" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonIndexableItemStatisticType", propOrder = {
    "mailbox",
    "itemCount",
    "errorMessage"
})
public class NonIndexableItemStatisticType {

    @XmlElement(name = "Mailbox", required = true)
    protected String mailbox;
    @XmlElement(name = "ItemCount")
    protected long itemCount;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;

    /**
     * Ruft den Wert der mailbox-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailbox() {
        return mailbox;
    }

    /**
     * Legt den Wert der mailbox-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailbox(String value) {
        this.mailbox = value;
    }

    /**
     * Ruft den Wert der itemCount-Eigenschaft ab.
     * 
     */
    public long getItemCount() {
        return itemCount;
    }

    /**
     * Legt den Wert der itemCount-Eigenschaft fest.
     * 
     */
    public void setItemCount(long value) {
        this.itemCount = value;
    }

    /**
     * Ruft den Wert der errorMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Legt den Wert der errorMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
