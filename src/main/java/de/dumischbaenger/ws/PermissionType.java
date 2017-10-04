
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A permission on a folder
 * 
 * <p>Java-Klasse für PermissionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PermissionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BasePermissionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReadItems" type="{http://schemas.microsoft.com/exchange/services/2006/types}PermissionReadAccessType" minOccurs="0"/&gt;
 *         &lt;element name="PermissionLevel" type="{http://schemas.microsoft.com/exchange/services/2006/types}PermissionLevelType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionType", propOrder = {
    "readItems",
    "permissionLevel"
})
public class PermissionType
    extends BasePermissionType
{

    @XmlElement(name = "ReadItems")
    @XmlSchemaType(name = "string")
    protected PermissionReadAccessType readItems;
    @XmlElement(name = "PermissionLevel", required = true)
    @XmlSchemaType(name = "string")
    protected PermissionLevelType permissionLevel;

    /**
     * Ruft den Wert der readItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PermissionReadAccessType }
     *     
     */
    public PermissionReadAccessType getReadItems() {
        return readItems;
    }

    /**
     * Legt den Wert der readItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionReadAccessType }
     *     
     */
    public void setReadItems(PermissionReadAccessType value) {
        this.readItems = value;
    }

    /**
     * Ruft den Wert der permissionLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PermissionLevelType }
     *     
     */
    public PermissionLevelType getPermissionLevel() {
        return permissionLevel;
    }

    /**
     * Legt den Wert der permissionLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionLevelType }
     *     
     */
    public void setPermissionLevel(PermissionLevelType value) {
        this.permissionLevel = value;
    }

}
