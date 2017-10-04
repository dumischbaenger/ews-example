
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OnlineMeetingSettingsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OnlineMeetingSettingsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LobbyBypass" type="{http://schemas.microsoft.com/exchange/services/2006/types}LobbyBypassType"/&gt;
 *         &lt;element name="AccessLevel" type="{http://schemas.microsoft.com/exchange/services/2006/types}OnlineMeetingAccessLevelType"/&gt;
 *         &lt;element name="Presenters" type="{http://schemas.microsoft.com/exchange/services/2006/types}PresentersType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlineMeetingSettingsType", propOrder = {
    "lobbyBypass",
    "accessLevel",
    "presenters"
})
public class OnlineMeetingSettingsType {

    @XmlElement(name = "LobbyBypass", required = true)
    @XmlSchemaType(name = "string")
    protected LobbyBypassType lobbyBypass;
    @XmlElement(name = "AccessLevel", required = true)
    @XmlSchemaType(name = "string")
    protected OnlineMeetingAccessLevelType accessLevel;
    @XmlElement(name = "Presenters", required = true)
    @XmlSchemaType(name = "string")
    protected PresentersType presenters;

    /**
     * Ruft den Wert der lobbyBypass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LobbyBypassType }
     *     
     */
    public LobbyBypassType getLobbyBypass() {
        return lobbyBypass;
    }

    /**
     * Legt den Wert der lobbyBypass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LobbyBypassType }
     *     
     */
    public void setLobbyBypass(LobbyBypassType value) {
        this.lobbyBypass = value;
    }

    /**
     * Ruft den Wert der accessLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OnlineMeetingAccessLevelType }
     *     
     */
    public OnlineMeetingAccessLevelType getAccessLevel() {
        return accessLevel;
    }

    /**
     * Legt den Wert der accessLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineMeetingAccessLevelType }
     *     
     */
    public void setAccessLevel(OnlineMeetingAccessLevelType value) {
        this.accessLevel = value;
    }

    /**
     * Ruft den Wert der presenters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PresentersType }
     *     
     */
    public PresentersType getPresenters() {
        return presenters;
    }

    /**
     * Legt den Wert der presenters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentersType }
     *     
     */
    public void setPresenters(PresentersType value) {
        this.presenters = value;
    }

}
