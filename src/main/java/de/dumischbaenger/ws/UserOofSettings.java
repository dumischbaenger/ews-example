
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UserOofSettings complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserOofSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OofState" type="{http://schemas.microsoft.com/exchange/services/2006/types}OofState"/&gt;
 *         &lt;element name="ExternalAudience" type="{http://schemas.microsoft.com/exchange/services/2006/types}ExternalAudience"/&gt;
 *         &lt;element name="Duration" type="{http://schemas.microsoft.com/exchange/services/2006/types}Duration" minOccurs="0"/&gt;
 *         &lt;element name="InternalReply" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReplyBody" minOccurs="0"/&gt;
 *         &lt;element name="ExternalReply" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReplyBody" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserOofSettings", propOrder = {
    "oofState",
    "externalAudience",
    "duration",
    "internalReply",
    "externalReply"
})
public class UserOofSettings {

    @XmlElement(name = "OofState", required = true)
    @XmlSchemaType(name = "string")
    protected OofState oofState;
    @XmlElement(name = "ExternalAudience", required = true)
    @XmlSchemaType(name = "string")
    protected ExternalAudience externalAudience;
    @XmlElement(name = "Duration")
    protected Duration duration;
    @XmlElement(name = "InternalReply")
    protected ReplyBody internalReply;
    @XmlElement(name = "ExternalReply")
    protected ReplyBody externalReply;

    /**
     * Ruft den Wert der oofState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OofState }
     *     
     */
    public OofState getOofState() {
        return oofState;
    }

    /**
     * Legt den Wert der oofState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OofState }
     *     
     */
    public void setOofState(OofState value) {
        this.oofState = value;
    }

    /**
     * Ruft den Wert der externalAudience-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExternalAudience }
     *     
     */
    public ExternalAudience getExternalAudience() {
        return externalAudience;
    }

    /**
     * Legt den Wert der externalAudience-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalAudience }
     *     
     */
    public void setExternalAudience(ExternalAudience value) {
        this.externalAudience = value;
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

    /**
     * Ruft den Wert der internalReply-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReplyBody }
     *     
     */
    public ReplyBody getInternalReply() {
        return internalReply;
    }

    /**
     * Legt den Wert der internalReply-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyBody }
     *     
     */
    public void setInternalReply(ReplyBody value) {
        this.internalReply = value;
    }

    /**
     * Ruft den Wert der externalReply-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReplyBody }
     *     
     */
    public ReplyBody getExternalReply() {
        return externalReply;
    }

    /**
     * Legt den Wert der externalReply-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyBody }
     *     
     */
    public void setExternalReply(ReplyBody value) {
        this.externalReply = value;
    }

}
