
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SetImGroupType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SetImGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType"/&gt;
 *         &lt;element name="NewDisplayName" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetImGroupType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "groupId",
    "newDisplayName"
})
public class SetImGroupType
    extends BaseRequestType
{

    @XmlElement(name = "GroupId", required = true)
    protected ItemIdType groupId;
    @XmlElement(name = "NewDisplayName", required = true)
    protected String newDisplayName;

    /**
     * Ruft den Wert der groupId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ItemIdType }
     *     
     */
    public ItemIdType getGroupId() {
        return groupId;
    }

    /**
     * Legt den Wert der groupId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdType }
     *     
     */
    public void setGroupId(ItemIdType value) {
        this.groupId = value;
    }

    /**
     * Ruft den Wert der newDisplayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDisplayName() {
        return newDisplayName;
    }

    /**
     * Legt den Wert der newDisplayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDisplayName(String value) {
        this.newDisplayName = value;
    }

}
