
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetAppManifestsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetAppManifestsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApiVersionSupported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SchemaVersionSupported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludeAllInstalledAddIns" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeEntitlementData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeManifestData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IncludeCustomAppsData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionIds" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ListOfExtensionIdsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAppManifestsType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "apiVersionSupported",
    "schemaVersionSupported",
    "includeAllInstalledAddIns",
    "includeEntitlementData",
    "includeManifestData",
    "includeCustomAppsData",
    "extensionIds"
})
public class GetAppManifestsType
    extends BaseRequestType
{

    @XmlElement(name = "ApiVersionSupported")
    protected String apiVersionSupported;
    @XmlElement(name = "SchemaVersionSupported")
    protected String schemaVersionSupported;
    @XmlElement(name = "IncludeAllInstalledAddIns")
    protected Boolean includeAllInstalledAddIns;
    @XmlElement(name = "IncludeEntitlementData")
    protected Boolean includeEntitlementData;
    @XmlElement(name = "IncludeManifestData")
    protected Boolean includeManifestData;
    @XmlElement(name = "IncludeCustomAppsData")
    protected Boolean includeCustomAppsData;
    @XmlList
    @XmlElement(name = "ExtensionIds")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> extensionIds;

    /**
     * Ruft den Wert der apiVersionSupported-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiVersionSupported() {
        return apiVersionSupported;
    }

    /**
     * Legt den Wert der apiVersionSupported-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiVersionSupported(String value) {
        this.apiVersionSupported = value;
    }

    /**
     * Ruft den Wert der schemaVersionSupported-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersionSupported() {
        return schemaVersionSupported;
    }

    /**
     * Legt den Wert der schemaVersionSupported-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersionSupported(String value) {
        this.schemaVersionSupported = value;
    }

    /**
     * Ruft den Wert der includeAllInstalledAddIns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAllInstalledAddIns() {
        return includeAllInstalledAddIns;
    }

    /**
     * Legt den Wert der includeAllInstalledAddIns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllInstalledAddIns(Boolean value) {
        this.includeAllInstalledAddIns = value;
    }

    /**
     * Ruft den Wert der includeEntitlementData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeEntitlementData() {
        return includeEntitlementData;
    }

    /**
     * Legt den Wert der includeEntitlementData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeEntitlementData(Boolean value) {
        this.includeEntitlementData = value;
    }

    /**
     * Ruft den Wert der includeManifestData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeManifestData() {
        return includeManifestData;
    }

    /**
     * Legt den Wert der includeManifestData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeManifestData(Boolean value) {
        this.includeManifestData = value;
    }

    /**
     * Ruft den Wert der includeCustomAppsData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCustomAppsData() {
        return includeCustomAppsData;
    }

    /**
     * Legt den Wert der includeCustomAppsData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCustomAppsData(Boolean value) {
        this.includeCustomAppsData = value;
    }

    /**
     * Gets the value of the extensionIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExtensionIds() {
        if (extensionIds == null) {
            extensionIds = new ArrayList<String>();
        }
        return this.extensionIds;
    }

}
