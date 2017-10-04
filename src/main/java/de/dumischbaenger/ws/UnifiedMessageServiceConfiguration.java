
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UnifiedMessageServiceConfiguration complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UnifiedMessageServiceConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ServiceConfiguration"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UmEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PlayOnPhoneDialString" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PlayOnPhoneEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnifiedMessageServiceConfiguration", propOrder = {
    "umEnabled",
    "playOnPhoneDialString",
    "playOnPhoneEnabled"
})
public class UnifiedMessageServiceConfiguration
    extends ServiceConfiguration
{

    @XmlElement(name = "UmEnabled")
    protected boolean umEnabled;
    @XmlElement(name = "PlayOnPhoneDialString", required = true)
    protected String playOnPhoneDialString;
    @XmlElement(name = "PlayOnPhoneEnabled")
    protected boolean playOnPhoneEnabled;

    /**
     * Ruft den Wert der umEnabled-Eigenschaft ab.
     * 
     */
    public boolean isUmEnabled() {
        return umEnabled;
    }

    /**
     * Legt den Wert der umEnabled-Eigenschaft fest.
     * 
     */
    public void setUmEnabled(boolean value) {
        this.umEnabled = value;
    }

    /**
     * Ruft den Wert der playOnPhoneDialString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayOnPhoneDialString() {
        return playOnPhoneDialString;
    }

    /**
     * Legt den Wert der playOnPhoneDialString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayOnPhoneDialString(String value) {
        this.playOnPhoneDialString = value;
    }

    /**
     * Ruft den Wert der playOnPhoneEnabled-Eigenschaft ab.
     * 
     */
    public boolean isPlayOnPhoneEnabled() {
        return playOnPhoneEnabled;
    }

    /**
     * Legt den Wert der playOnPhoneEnabled-Eigenschaft fest.
     * 
     */
    public void setPlayOnPhoneEnabled(boolean value) {
        this.playOnPhoneEnabled = value;
    }

}
