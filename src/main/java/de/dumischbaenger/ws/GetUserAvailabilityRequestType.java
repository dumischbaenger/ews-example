
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetUserAvailabilityRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetUserAvailabilityRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://schemas.microsoft.com/exchange/services/2006/types}TimeZone" minOccurs="0"/&gt;
 *         &lt;element name="MailboxDataArray" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfMailboxData"/&gt;
 *         &lt;element ref="{http://schemas.microsoft.com/exchange/services/2006/types}FreeBusyViewOptions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://schemas.microsoft.com/exchange/services/2006/types}SuggestionsViewOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserAvailabilityRequestType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "timeZone",
    "mailboxDataArray",
    "freeBusyViewOptions",
    "suggestionsViewOptions"
})
public class GetUserAvailabilityRequestType
    extends BaseRequestType
{

    @XmlElement(name = "TimeZone", namespace = "http://schemas.microsoft.com/exchange/services/2006/types")
    protected SerializableTimeZone timeZone;
    @XmlElement(name = "MailboxDataArray", required = true)
    protected ArrayOfMailboxData mailboxDataArray;
    @XmlElement(name = "FreeBusyViewOptions", namespace = "http://schemas.microsoft.com/exchange/services/2006/types")
    protected FreeBusyViewOptionsType freeBusyViewOptions;
    @XmlElement(name = "SuggestionsViewOptions", namespace = "http://schemas.microsoft.com/exchange/services/2006/types")
    protected SuggestionsViewOptionsType suggestionsViewOptions;

    /**
     * Ruft den Wert der timeZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SerializableTimeZone }
     *     
     */
    public SerializableTimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Legt den Wert der timeZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SerializableTimeZone }
     *     
     */
    public void setTimeZone(SerializableTimeZone value) {
        this.timeZone = value;
    }

    /**
     * Ruft den Wert der mailboxDataArray-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMailboxData }
     *     
     */
    public ArrayOfMailboxData getMailboxDataArray() {
        return mailboxDataArray;
    }

    /**
     * Legt den Wert der mailboxDataArray-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMailboxData }
     *     
     */
    public void setMailboxDataArray(ArrayOfMailboxData value) {
        this.mailboxDataArray = value;
    }

    /**
     * Ruft den Wert der freeBusyViewOptions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FreeBusyViewOptionsType }
     *     
     */
    public FreeBusyViewOptionsType getFreeBusyViewOptions() {
        return freeBusyViewOptions;
    }

    /**
     * Legt den Wert der freeBusyViewOptions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeBusyViewOptionsType }
     *     
     */
    public void setFreeBusyViewOptions(FreeBusyViewOptionsType value) {
        this.freeBusyViewOptions = value;
    }

    /**
     * Ruft den Wert der suggestionsViewOptions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SuggestionsViewOptionsType }
     *     
     */
    public SuggestionsViewOptionsType getSuggestionsViewOptions() {
        return suggestionsViewOptions;
    }

    /**
     * Legt den Wert der suggestionsViewOptions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestionsViewOptionsType }
     *     
     */
    public void setSuggestionsViewOptions(SuggestionsViewOptionsType value) {
        this.suggestionsViewOptions = value;
    }

}
