
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für AppMetadata complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AppMetadata"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndNodeUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AppStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActionUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnabledStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ConsentState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarketplaceAssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrialExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="InstalledBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppMetadata", propOrder = {
    "endNodeUrl",
    "appStatus",
    "actionUrl",
    "productId",
    "enabledStatus",
    "consentState",
    "extensionType",
    "marketplaceAssetId",
    "licenseStatus",
    "trialExpirationDate",
    "installedBy",
    "isMandatory"
})
public class AppMetadata {

    @XmlElement(name = "EndNodeUrl")
    protected String endNodeUrl;
    @XmlElement(name = "AppStatus")
    protected String appStatus;
    @XmlElement(name = "ActionUrl")
    protected String actionUrl;
    @XmlElement(name = "ProductId")
    protected String productId;
    @XmlElement(name = "EnabledStatus")
    protected Boolean enabledStatus;
    @XmlElement(name = "ConsentState")
    protected String consentState;
    @XmlElement(name = "ExtensionType")
    protected String extensionType;
    @XmlElement(name = "MarketplaceAssetId")
    protected String marketplaceAssetId;
    @XmlElement(name = "LicenseStatus")
    protected String licenseStatus;
    @XmlElement(name = "TrialExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trialExpirationDate;
    @XmlElement(name = "InstalledBy")
    protected String installedBy;
    @XmlElement(name = "IsMandatory")
    protected Boolean isMandatory;

    /**
     * Ruft den Wert der endNodeUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndNodeUrl() {
        return endNodeUrl;
    }

    /**
     * Legt den Wert der endNodeUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndNodeUrl(String value) {
        this.endNodeUrl = value;
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
     * Ruft den Wert der actionUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionUrl() {
        return actionUrl;
    }

    /**
     * Legt den Wert der actionUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionUrl(String value) {
        this.actionUrl = value;
    }

    /**
     * Ruft den Wert der productId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Legt den Wert der productId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Ruft den Wert der enabledStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabledStatus() {
        return enabledStatus;
    }

    /**
     * Legt den Wert der enabledStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabledStatus(Boolean value) {
        this.enabledStatus = value;
    }

    /**
     * Ruft den Wert der consentState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsentState() {
        return consentState;
    }

    /**
     * Legt den Wert der consentState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsentState(String value) {
        this.consentState = value;
    }

    /**
     * Ruft den Wert der extensionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionType() {
        return extensionType;
    }

    /**
     * Legt den Wert der extensionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionType(String value) {
        this.extensionType = value;
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
     * Ruft den Wert der licenseStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseStatus() {
        return licenseStatus;
    }

    /**
     * Legt den Wert der licenseStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseStatus(String value) {
        this.licenseStatus = value;
    }

    /**
     * Ruft den Wert der trialExpirationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrialExpirationDate() {
        return trialExpirationDate;
    }

    /**
     * Legt den Wert der trialExpirationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrialExpirationDate(XMLGregorianCalendar value) {
        this.trialExpirationDate = value;
    }

    /**
     * Ruft den Wert der installedBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstalledBy() {
        return installedBy;
    }

    /**
     * Legt den Wert der installedBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstalledBy(String value) {
        this.installedBy = value;
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

}
