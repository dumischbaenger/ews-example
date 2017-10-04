
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetAppManifestsResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetAppManifestsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Apps" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfAppsType"/&gt;
 *         &lt;element name="Manifests" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ArrayOfAppManifestsType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAppManifestsResponseType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "apps",
    "manifests"
})
public class GetAppManifestsResponseType
    extends ResponseMessageType
{

    @XmlElement(name = "Apps")
    protected ArrayOfAppsType apps;
    @XmlElement(name = "Manifests")
    protected ArrayOfAppManifestsType manifests;

    /**
     * Ruft den Wert der apps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAppsType }
     *     
     */
    public ArrayOfAppsType getApps() {
        return apps;
    }

    /**
     * Legt den Wert der apps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAppsType }
     *     
     */
    public void setApps(ArrayOfAppsType value) {
        this.apps = value;
    }

    /**
     * Ruft den Wert der manifests-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAppManifestsType }
     *     
     */
    public ArrayOfAppManifestsType getManifests() {
        return manifests;
    }

    /**
     * Legt den Wert der manifests-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAppManifestsType }
     *     
     */
    public void setManifests(ArrayOfAppManifestsType value) {
        this.manifests = value;
    }

}
