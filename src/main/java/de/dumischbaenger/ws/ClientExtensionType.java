
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ClientExtensionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ClientExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SpecificUsers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="Manifest" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="IsEnabledByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ProvidedTo" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientExtensionProvidedToType" /&gt;
 *       &lt;attribute name="Type" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientExtensionTypeType" /&gt;
 *       &lt;attribute name="Scope" type="{http://schemas.microsoft.com/exchange/services/2006/types}ClientExtensionScopeType" /&gt;
 *       &lt;attribute name="MarketplaceAssetId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="MarketplaceContentMarket" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="AppStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Etoken" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="InstalledDateTime" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClientExtensionType", propOrder = {
    "specificUsers",
    "manifest"
})
public class ClientExtensionType {

    @XmlElement(name = "SpecificUsers")
    protected ArrayOfStringsType specificUsers;
    @XmlElement(name = "Manifest")
    protected byte[] manifest;
    @XmlAttribute(name = "IsAvailable")
    protected Boolean isAvailable;
    @XmlAttribute(name = "IsMandatory")
    protected Boolean isMandatory;
    @XmlAttribute(name = "IsEnabledByDefault")
    protected Boolean isEnabledByDefault;
    @XmlAttribute(name = "ProvidedTo")
    protected ClientExtensionProvidedToType providedTo;
    @XmlAttribute(name = "Type")
    protected ClientExtensionTypeType type;
    @XmlAttribute(name = "Scope")
    protected ClientExtensionScopeType scope;
    @XmlAttribute(name = "MarketplaceAssetId")
    protected String marketplaceAssetId;
    @XmlAttribute(name = "MarketplaceContentMarket")
    protected String marketplaceContentMarket;
    @XmlAttribute(name = "AppStatus")
    protected String appStatus;
    @XmlAttribute(name = "Etoken")
    protected String etoken;
    @XmlAttribute(name = "InstalledDateTime")
    protected String installedDateTime;

    /**
     * Ruft den Wert der specificUsers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getSpecificUsers() {
        return specificUsers;
    }

    /**
     * Legt den Wert der specificUsers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setSpecificUsers(ArrayOfStringsType value) {
        this.specificUsers = value;
    }

    /**
     * Ruft den Wert der manifest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getManifest() {
        return manifest;
    }

    /**
     * Legt den Wert der manifest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setManifest(byte[] value) {
        this.manifest = value;
    }

    /**
     * Ruft den Wert der isAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * Legt den Wert der isAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailable(Boolean value) {
        this.isAvailable = value;
    }

    /**
     * Ruft den Wert der isMandatory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMandatory() {
        return isMandatory;
    }

    /**
     * Legt den Wert der isMandatory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMandatory(Boolean value) {
        this.isMandatory = value;
    }

    /**
     * Ruft den Wert der isEnabledByDefault-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEnabledByDefault() {
        return isEnabledByDefault;
    }

    /**
     * Legt den Wert der isEnabledByDefault-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEnabledByDefault(Boolean value) {
        this.isEnabledByDefault = value;
    }

    /**
     * Ruft den Wert der providedTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClientExtensionProvidedToType }
     *     
     */
    public ClientExtensionProvidedToType getProvidedTo() {
        return providedTo;
    }

    /**
     * Legt den Wert der providedTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientExtensionProvidedToType }
     *     
     */
    public void setProvidedTo(ClientExtensionProvidedToType value) {
        this.providedTo = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClientExtensionTypeType }
     *     
     */
    public ClientExtensionTypeType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientExtensionTypeType }
     *     
     */
    public void setType(ClientExtensionTypeType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der scope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClientExtensionScopeType }
     *     
     */
    public ClientExtensionScopeType getScope() {
        return scope;
    }

    /**
     * Legt den Wert der scope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientExtensionScopeType }
     *     
     */
    public void setScope(ClientExtensionScopeType value) {
        this.scope = value;
    }

    /**
     * Ruft den Wert der marketplaceAssetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketplaceAssetId() {
        return marketplaceAssetId;
    }

    /**
     * Legt den Wert der marketplaceAssetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketplaceAssetId(String value) {
        this.marketplaceAssetId = value;
    }

    /**
     * Ruft den Wert der marketplaceContentMarket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketplaceContentMarket() {
        return marketplaceContentMarket;
    }

    /**
     * Legt den Wert der marketplaceContentMarket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketplaceContentMarket(String value) {
        this.marketplaceContentMarket = value;
    }

    /**
     * Ruft den Wert der appStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppStatus() {
        return appStatus;
    }

    /**
     * Legt den Wert der appStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStatus(String value) {
        this.appStatus = value;
    }

    /**
     * Ruft den Wert der etoken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtoken() {
        return etoken;
    }

    /**
     * Legt den Wert der etoken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtoken(String value) {
        this.etoken = value;
    }

    /**
     * Ruft den Wert der installedDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledDateTime() {
        return installedDateTime;
    }

    /**
     * Legt den Wert der installedDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledDateTime(String value) {
        this.installedDateTime = value;
    }

}
