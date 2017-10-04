
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OutOfOfficeMailTip complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OutOfOfficeMailTip"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReplyBody" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReplyBody"/&gt;
 *         &lt;element name="Duration" type="{http://schemas.microsoft.com/exchange/services/2006/types}Duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutOfOfficeMailTip", propOrder = {
    "replyBody",
    "duration"
})
public class OutOfOfficeMailTip {

    @XmlElement(name = "ReplyBody", required = true)
    protected ReplyBody replyBody;
    @XmlElement(name = "Duration")
    protected Duration duration;

    /**
     * Ruft den Wert der replyBody-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReplyBody }
     *     
     */
    public ReplyBody getReplyBody() {
        return replyBody;
    }

    /**
     * Legt den Wert der replyBody-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyBody }
     *     
     */
    public void setReplyBody(ReplyBody value) {
        this.replyBody = value;
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

}
