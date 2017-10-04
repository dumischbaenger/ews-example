
package de.dumischbaenger.ws;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java-Klasse für SerializedSecurityContextType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SerializedSecurityContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserSid" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GroupSids" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfGroupIdentifiersType" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedGroupSids" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfRestrictedGroupIdentifiersType" minOccurs="0"/&gt;
 *         &lt;element name="PrimarySmtpAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute namespace='http://schemas.xmlsoap.org/soap/envelope/'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerializedSecurityContextType", propOrder = {
    "userSid",
    "groupSids",
    "restrictedGroupSids",
    "primarySmtpAddress"
})
public class SerializedSecurityContextType {

    @XmlElement(name = "UserSid", required = true)
    protected String userSid;
    @XmlElement(name = "GroupSids")
    protected NonEmptyArrayOfGroupIdentifiersType groupSids;
    @XmlElement(name = "RestrictedGroupSids")
    protected NonEmptyArrayOfRestrictedGroupIdentifiersType restrictedGroupSids;
    @XmlElement(name = "PrimarySmtpAddress")
    protected String primarySmtpAddress;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Ruft den Wert der userSid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserSid() {
        return userSid;
    }

    /**
     * Legt den Wert der userSid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserSid(String value) {
        this.userSid = value;
    }

    /**
     * Ruft den Wert der groupSids-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfGroupIdentifiersType }
     *     
     */
    public NonEmptyArrayOfGroupIdentifiersType getGroupSids() {
        return groupSids;
    }

    /**
     * Legt den Wert der groupSids-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfGroupIdentifiersType }
     *     
     */
    public void setGroupSids(NonEmptyArrayOfGroupIdentifiersType value) {
        this.groupSids = value;
    }

    /**
     * Ruft den Wert der restrictedGroupSids-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfRestrictedGroupIdentifiersType }
     *     
     */
    public NonEmptyArrayOfRestrictedGroupIdentifiersType getRestrictedGroupSids() {
        return restrictedGroupSids;
    }

    /**
     * Legt den Wert der restrictedGroupSids-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfRestrictedGroupIdentifiersType }
     *     
     */
    public void setRestrictedGroupSids(NonEmptyArrayOfRestrictedGroupIdentifiersType value) {
        this.restrictedGroupSids = value;
    }

    /**
     * Ruft den Wert der primarySmtpAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimarySmtpAddress() {
        return primarySmtpAddress;
    }

    /**
     * Legt den Wert der primarySmtpAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimarySmtpAddress(String value) {
        this.primarySmtpAddress = value;
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
