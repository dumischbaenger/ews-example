
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DictionaryURIType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DictionaryURIType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="item:InternetMessageHeader"/&gt;
 *     &lt;enumeration value="contacts:ImAddress"/&gt;
 *     &lt;enumeration value="contacts:PhysicalAddress:Street"/&gt;
 *     &lt;enumeration value="contacts:PhysicalAddress:City"/&gt;
 *     &lt;enumeration value="contacts:PhysicalAddress:State"/&gt;
 *     &lt;enumeration value="contacts:PhysicalAddress:CountryOrRegion"/&gt;
 *     &lt;enumeration value="contacts:PhysicalAddress:PostalCode"/&gt;
 *     &lt;enumeration value="contacts:PhoneNumber"/&gt;
 *     &lt;enumeration value="contacts:EmailAddress"/&gt;
 *     &lt;enumeration value="distributionlist:Members:Member"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DictionaryURIType")
@XmlEnum
public enum DictionaryURIType {

    @XmlEnumValue("item:InternetMessageHeader")
    ITEM_INTERNET_MESSAGE_HEADER("item:InternetMessageHeader"),
    @XmlEnumValue("contacts:ImAddress")
    CONTACTS_IM_ADDRESS("contacts:ImAddress"),
    @XmlEnumValue("contacts:PhysicalAddress:Street")
    CONTACTS_PHYSICAL_ADDRESS_STREET("contacts:PhysicalAddress:Street"),
    @XmlEnumValue("contacts:PhysicalAddress:City")
    CONTACTS_PHYSICAL_ADDRESS_CITY("contacts:PhysicalAddress:City"),
    @XmlEnumValue("contacts:PhysicalAddress:State")
    CONTACTS_PHYSICAL_ADDRESS_STATE("contacts:PhysicalAddress:State"),
    @XmlEnumValue("contacts:PhysicalAddress:CountryOrRegion")
    CONTACTS_PHYSICAL_ADDRESS_COUNTRY_OR_REGION("contacts:PhysicalAddress:CountryOrRegion"),
    @XmlEnumValue("contacts:PhysicalAddress:PostalCode")
    CONTACTS_PHYSICAL_ADDRESS_POSTAL_CODE("contacts:PhysicalAddress:PostalCode"),
    @XmlEnumValue("contacts:PhoneNumber")
    CONTACTS_PHONE_NUMBER("contacts:PhoneNumber"),
    @XmlEnumValue("contacts:EmailAddress")
    CONTACTS_EMAIL_ADDRESS("contacts:EmailAddress"),
    @XmlEnumValue("distributionlist:Members:Member")
    DISTRIBUTIONLIST_MEMBERS_MEMBER("distributionlist:Members:Member");
    private final String value;

    DictionaryURIType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DictionaryURIType fromValue(String v) {
        for (DictionaryURIType c: DictionaryURIType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
