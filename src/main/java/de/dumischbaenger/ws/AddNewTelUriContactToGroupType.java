
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AddNewTelUriContactToGroupType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AddNewTelUriContactToGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TelUriAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/&gt;
 *         &lt;element name="ImContactSipUriAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/&gt;
 *         &lt;element name="ImTelephoneNumber" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/&gt;
 *         &lt;element name="GroupId" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddNewTelUriContactToGroupType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "telUriAddress",
    "imContactSipUriAddress",
    "imTelephoneNumber",
    "groupId"
})
public class AddNewTelUriContactToGroupType
    extends BaseRequestType
{

    @XmlElement(name = "TelUriAddress", required = true)
    protected String telUriAddress;
    @XmlElement(name = "ImContactSipUriAddress", required = true)
    protected String imContactSipUriAddress;
    @XmlElement(name = "ImTelephoneNumber", required = true)
    protected String imTelephoneNumber;
    @XmlElement(name = "GroupId")
    protected ItemIdType groupId;

    /**
     * Ruft den Wert der telUriAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelUriAddress() {
        return telUriAddress;
    }

    /**
     * Legt den Wert der telUriAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelUriAddress(String value) {
        this.telUriAddress = value;
    }

    /**
     * Ruft den Wert der imContactSipUriAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImContactSipUriAddress() {
        return imContactSipUriAddress;
    }

    /**
     * Legt den Wert der imContactSipUriAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImContactSipUriAddress(String value) {
        this.imContactSipUriAddress = value;
    }

    /**
     * Ruft den Wert der imTelephoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImTelephoneNumber() {
        return imTelephoneNumber;
    }

    /**
     * Legt den Wert der imTelephoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImTelephoneNumber(String value) {
        this.imTelephoneNumber = value;
    }

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

}
