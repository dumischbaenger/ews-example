
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InstallAppResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InstallAppResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WasFirstInstall" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://schemas.microsoft.com/exchange/services/2006/types}InstalledAppType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallAppResponseType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "wasFirstInstall",
    "extension"
})
public class InstallAppResponseType
    extends ResponseMessageType
{

    @XmlElement(name = "WasFirstInstall")
    protected Boolean wasFirstInstall;
    @XmlElement(name = "Extension")
    protected InstalledAppType extension;

    /**
     * Ruft den Wert der wasFirstInstall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWasFirstInstall() {
        return wasFirstInstall;
    }

    /**
     * Legt den Wert der wasFirstInstall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWasFirstInstall(Boolean value) {
        this.wasFirstInstall = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InstalledAppType }
     *     
     */
    public InstalledAppType getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InstalledAppType }
     *     
     */
    public void setExtension(InstalledAppType value) {
        this.extension = value;
    }

}
