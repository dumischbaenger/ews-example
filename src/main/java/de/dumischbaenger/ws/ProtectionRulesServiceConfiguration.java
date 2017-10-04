
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ProtectionRulesServiceConfiguration complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProtectionRulesServiceConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ServiceConfiguration"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rules" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfProtectionRulesType"/&gt;
 *         &lt;element name="InternalDomains" type="{http://schemas.microsoft.com/exchange/services/2006/types}SmtpDomainList"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RefreshInterval" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionRulesServiceConfiguration", propOrder = {
    "rules",
    "internalDomains"
})
public class ProtectionRulesServiceConfiguration
    extends ServiceConfiguration
{

    @XmlElement(name = "Rules", required = true)
    protected ArrayOfProtectionRulesType rules;
    @XmlElement(name = "InternalDomains", required = true)
    protected SmtpDomainList internalDomains;
    @XmlAttribute(name = "RefreshInterval", required = true)
    protected int refreshInterval;

    /**
     * Ruft den Wert der rules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProtectionRulesType }
     *     
     */
    public ArrayOfProtectionRulesType getRules() {
        return rules;
    }

    /**
     * Legt den Wert der rules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProtectionRulesType }
     *     
     */
    public void setRules(ArrayOfProtectionRulesType value) {
        this.rules = value;
    }

    /**
     * Ruft den Wert der internalDomains-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmtpDomainList }
     *     
     */
    public SmtpDomainList getInternalDomains() {
        return internalDomains;
    }

    /**
     * Legt den Wert der internalDomains-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmtpDomainList }
     *     
     */
    public void setInternalDomains(SmtpDomainList value) {
        this.internalDomains = value;
    }

    /**
     * Ruft den Wert der refreshInterval-Eigenschaft ab.
     * 
     */
    public int getRefreshInterval() {
        return refreshInterval;
    }

    /**
     * Legt den Wert der refreshInterval-Eigenschaft fest.
     * 
     */
    public void setRefreshInterval(int value) {
        this.refreshInterval = value;
    }

}
