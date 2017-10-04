
package de.dumischbaenger.ws;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java-Klasse für OpenAsAdminOrSystemServiceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OpenAsAdminOrSystemServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConnectingSID" type="{http://schemas.microsoft.com/exchange/services/2006/types}ConnectingSIDType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LogonType" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}SpecialLogonTypeType" /&gt;
 *       &lt;attribute name="BudgetType" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;anyAttribute namespace='http://schemas.xmlsoap.org/soap/envelope/'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenAsAdminOrSystemServiceType", propOrder = {
    "connectingSID"
})
public class OpenAsAdminOrSystemServiceType {

    @XmlElement(name = "ConnectingSID", required = true)
    protected ConnectingSIDType connectingSID;
    @XmlAttribute(name = "LogonType", required = true)
    protected SpecialLogonTypeType logonType;
    @XmlAttribute(name = "BudgetType")
    protected Integer budgetType;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Ruft den Wert der connectingSID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingSIDType }
     *     
     */
    public ConnectingSIDType getConnectingSID() {
        return connectingSID;
    }

    /**
     * Legt den Wert der connectingSID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingSIDType }
     *     
     */
    public void setConnectingSID(ConnectingSIDType value) {
        this.connectingSID = value;
    }

    /**
     * Ruft den Wert der logonType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SpecialLogonTypeType }
     *     
     */
    public SpecialLogonTypeType getLogonType() {
        return logonType;
    }

    /**
     * Legt den Wert der logonType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialLogonTypeType }
     *     
     */
    public void setLogonType(SpecialLogonTypeType value) {
        this.logonType = value;
    }

    /**
     * Ruft den Wert der budgetType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBudgetType() {
        return budgetType;
    }

    /**
     * Legt den Wert der budgetType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBudgetType(Integer value) {
        this.budgetType = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
