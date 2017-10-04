
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InstallAppType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InstallAppType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Manifest" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="MarketplaceAssetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarketplaceContentMarket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SendWelcomeEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManifestUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallAppType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "manifest",
    "marketplaceAssetId",
    "marketplaceContentMarket",
    "sendWelcomeEmail",
    "manifestUrl"
})
public class InstallAppType
    extends BaseRequestType
{

    @XmlElement(name = "Manifest", required = true)
    protected byte[] manifest;
    @XmlElement(name = "MarketplaceAssetId")
    protected String marketplaceAssetId;
    @XmlElement(name = "MarketplaceContentMarket")
    protected String marketplaceContentMarket;
    @XmlElement(name = "SendWelcomeEmail")
    protected Boolean sendWelcomeEmail;
    @XmlElement(name = "ManifestUrl")
    protected String manifestUrl;

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
     * Ruft den Wert der sendWelcomeEmail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendWelcomeEmail() {
        return sendWelcomeEmail;
    }

    /**
     * Legt den Wert der sendWelcomeEmail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendWelcomeEmail(Boolean value) {
        this.sendWelcomeEmail = value;
    }

    /**
     * Ruft den Wert der manifestUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManifestUrl() {
        return manifestUrl;
    }

    /**
     * Legt den Wert der manifestUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManifestUrl(String value) {
        this.manifestUrl = value;
    }

}
