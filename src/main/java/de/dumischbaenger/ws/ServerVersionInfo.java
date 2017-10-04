
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="MajorVersion" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MinorVersion" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MajorBuildNumber" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="MinorBuildNumber" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ServerVersionInfo")
public class ServerVersionInfo {

    @XmlAttribute(name = "MajorVersion")
    protected Integer majorVersion;
    @XmlAttribute(name = "MinorVersion")
    protected Integer minorVersion;
    @XmlAttribute(name = "MajorBuildNumber")
    protected Integer majorBuildNumber;
    @XmlAttribute(name = "MinorBuildNumber")
    protected Integer minorBuildNumber;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Ruft den Wert der majorVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMajorVersion() {
        return majorVersion;
    }

    /**
     * Legt den Wert der majorVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMajorVersion(Integer value) {
        this.majorVersion = value;
    }

    /**
     * Ruft den Wert der minorVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinorVersion() {
        return minorVersion;
    }

    /**
     * Legt den Wert der minorVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinorVersion(Integer value) {
        this.minorVersion = value;
    }

    /**
     * Ruft den Wert der majorBuildNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMajorBuildNumber() {
        return majorBuildNumber;
    }

    /**
     * Legt den Wert der majorBuildNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMajorBuildNumber(Integer value) {
        this.majorBuildNumber = value;
    }

    /**
     * Ruft den Wert der minorBuildNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinorBuildNumber() {
        return minorBuildNumber;
    }

    /**
     * Legt den Wert der minorBuildNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinorBuildNumber(Integer value) {
        this.minorBuildNumber = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
