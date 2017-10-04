
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContactType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}EntityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BusinessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumbers" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPhonesType" minOccurs="0"/&gt;
 *         &lt;element name="Urls" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfUrlsType" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfExtractedEmailAddresses" minOccurs="0"/&gt;
 *         &lt;element name="Addresses" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfAddressesType" minOccurs="0"/&gt;
 *         &lt;element name="ContactString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", propOrder = {
    "personName",
    "businessName",
    "phoneNumbers",
    "urls",
    "emailAddresses",
    "addresses",
    "contactString"
})
public class ContactType
    extends EntityType
{

    @XmlElement(name = "PersonName")
    protected String personName;
    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "PhoneNumbers")
    protected ArrayOfPhonesType phoneNumbers;
    @XmlElement(name = "Urls")
    protected ArrayOfUrlsType urls;
    @XmlElement(name = "EmailAddresses")
    protected ArrayOfExtractedEmailAddresses emailAddresses;
    @XmlElement(name = "Addresses")
    protected ArrayOfAddressesType addresses;
    @XmlElement(name = "ContactString")
    protected String contactString;

    /**
     * Ruft den Wert der personName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Legt den Wert der personName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
    }

    /**
     * Ruft den Wert der businessName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Legt den Wert der businessName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Ruft den Wert der phoneNumbers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPhonesType }
     *     
     */
    public ArrayOfPhonesType getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Legt den Wert der phoneNumbers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPhonesType }
     *     
     */
    public void setPhoneNumbers(ArrayOfPhonesType value) {
        this.phoneNumbers = value;
    }

    /**
     * Ruft den Wert der urls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUrlsType }
     *     
     */
    public ArrayOfUrlsType getUrls() {
        return urls;
    }

    /**
     * Legt den Wert der urls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUrlsType }
     *     
     */
    public void setUrls(ArrayOfUrlsType value) {
        this.urls = value;
    }

    /**
     * Ruft den Wert der emailAddresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtractedEmailAddresses }
     *     
     */
    public ArrayOfExtractedEmailAddresses getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Legt den Wert der emailAddresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtractedEmailAddresses }
     *     
     */
    public void setEmailAddresses(ArrayOfExtractedEmailAddresses value) {
        this.emailAddresses = value;
    }

    /**
     * Ruft den Wert der addresses-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAddressesType }
     *     
     */
    public ArrayOfAddressesType getAddresses() {
        return addresses;
    }

    /**
     * Legt den Wert der addresses-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAddressesType }
     *     
     */
    public void setAddresses(ArrayOfAddressesType value) {
        this.addresses = value;
    }

    /**
     * Ruft den Wert der contactString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactString() {
        return contactString;
    }

    /**
     * Legt den Wert der contactString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactString(String value) {
        this.contactString = value;
    }

}
