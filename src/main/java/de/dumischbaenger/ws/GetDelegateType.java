
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetDelegateType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetDelegateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseDelegateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserIds" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfUserIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="IncludePermissions" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDelegateType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "userIds"
})
public class GetDelegateType
    extends BaseDelegateType
{

    @XmlElement(name = "UserIds")
    protected ArrayOfUserIdType userIds;
    @XmlAttribute(name = "IncludePermissions", required = true)
    protected boolean includePermissions;

    /**
     * Ruft den Wert der userIds-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUserIdType }
     *     
     */
    public ArrayOfUserIdType getUserIds() {
        return userIds;
    }

    /**
     * Legt den Wert der userIds-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUserIdType }
     *     
     */
    public void setUserIds(ArrayOfUserIdType value) {
        this.userIds = value;
    }

    /**
     * Ruft den Wert der includePermissions-Eigenschaft ab.
     * 
     */
    public boolean isIncludePermissions() {
        return includePermissions;
    }

    /**
     * Legt den Wert der includePermissions-Eigenschaft fest.
     * 
     */
    public void setIncludePermissions(boolean value) {
        this.includePermissions = value;
    }

}
