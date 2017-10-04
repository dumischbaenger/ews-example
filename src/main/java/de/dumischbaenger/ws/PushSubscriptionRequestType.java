
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PushSubscriptionRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PushSubscriptionRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseSubscriptionRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StatusFrequency" type="{http://schemas.microsoft.com/exchange/services/2006/types}SubscriptionStatusFrequencyType"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CallerData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushSubscriptionRequestType", propOrder = {
    "statusFrequency",
    "url",
    "callerData"
})
public class PushSubscriptionRequestType
    extends BaseSubscriptionRequestType
{

    @XmlElement(name = "StatusFrequency")
    protected int statusFrequency;
    @XmlElement(name = "URL", required = true)
    protected String url;
    @XmlElement(name = "CallerData")
    protected String callerData;

    /**
     * Ruft den Wert der statusFrequency-Eigenschaft ab.
     * 
     */
    public int getStatusFrequency() {
        return statusFrequency;
    }

    /**
     * Legt den Wert der statusFrequency-Eigenschaft fest.
     * 
     */
    public void setStatusFrequency(int value) {
        this.statusFrequency = value;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Ruft den Wert der callerData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallerData() {
        return callerData;
    }

    /**
     * Legt den Wert der callerData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallerData(String value) {
        this.callerData = value;
    }

}
