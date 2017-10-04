
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ManagementRoleType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ManagementRoleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserRoles" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfRoleType" minOccurs="0"/&gt;
 *         &lt;element name="ApplicationRoles" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfRoleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagementRoleType", propOrder = {
    "userRoles",
    "applicationRoles"
})
public class ManagementRoleType {

    @XmlElement(name = "UserRoles")
    protected NonEmptyArrayOfRoleType userRoles;
    @XmlElement(name = "ApplicationRoles")
    protected NonEmptyArrayOfRoleType applicationRoles;

    /**
     * Ruft den Wert der userRoles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfRoleType }
     *     
     */
    public NonEmptyArrayOfRoleType getUserRoles() {
        return userRoles;
    }

    /**
     * Legt den Wert der userRoles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfRoleType }
     *     
     */
    public void setUserRoles(NonEmptyArrayOfRoleType value) {
        this.userRoles = value;
    }

    /**
     * Ruft den Wert der applicationRoles-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfRoleType }
     *     
     */
    public NonEmptyArrayOfRoleType getApplicationRoles() {
        return applicationRoles;
    }

    /**
     * Legt den Wert der applicationRoles-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfRoleType }
     *     
     */
    public void setApplicationRoles(NonEmptyArrayOfRoleType value) {
        this.applicationRoles = value;
    }

}
