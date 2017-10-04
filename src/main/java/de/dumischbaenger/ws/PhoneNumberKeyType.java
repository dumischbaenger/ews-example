
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PhoneNumberKeyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PhoneNumberKeyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AssistantPhone"/&gt;
 *     &lt;enumeration value="BusinessFax"/&gt;
 *     &lt;enumeration value="BusinessPhone"/&gt;
 *     &lt;enumeration value="BusinessPhone2"/&gt;
 *     &lt;enumeration value="Callback"/&gt;
 *     &lt;enumeration value="CarPhone"/&gt;
 *     &lt;enumeration value="CompanyMainPhone"/&gt;
 *     &lt;enumeration value="HomeFax"/&gt;
 *     &lt;enumeration value="HomePhone"/&gt;
 *     &lt;enumeration value="HomePhone2"/&gt;
 *     &lt;enumeration value="Isdn"/&gt;
 *     &lt;enumeration value="MobilePhone"/&gt;
 *     &lt;enumeration value="OtherFax"/&gt;
 *     &lt;enumeration value="OtherTelephone"/&gt;
 *     &lt;enumeration value="Pager"/&gt;
 *     &lt;enumeration value="PrimaryPhone"/&gt;
 *     &lt;enumeration value="RadioPhone"/&gt;
 *     &lt;enumeration value="Telex"/&gt;
 *     &lt;enumeration value="TtyTddPhone"/&gt;
 *     &lt;enumeration value="BusinessMobile"/&gt;
 *     &lt;enumeration value="IPPhone"/&gt;
 *     &lt;enumeration value="Mms"/&gt;
 *     &lt;enumeration value="Msn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhoneNumberKeyType")
@XmlEnum
public enum PhoneNumberKeyType {

    @XmlEnumValue("AssistantPhone")
    ASSISTANT_PHONE("AssistantPhone"),
    @XmlEnumValue("BusinessFax")
    BUSINESS_FAX("BusinessFax"),
    @XmlEnumValue("BusinessPhone")
    BUSINESS_PHONE("BusinessPhone"),
    @XmlEnumValue("BusinessPhone2")
    BUSINESS_PHONE_2("BusinessPhone2"),
    @XmlEnumValue("Callback")
    CALLBACK("Callback"),
    @XmlEnumValue("CarPhone")
    CAR_PHONE("CarPhone"),
    @XmlEnumValue("CompanyMainPhone")
    COMPANY_MAIN_PHONE("CompanyMainPhone"),
    @XmlEnumValue("HomeFax")
    HOME_FAX("HomeFax"),
    @XmlEnumValue("HomePhone")
    HOME_PHONE("HomePhone"),
    @XmlEnumValue("HomePhone2")
    HOME_PHONE_2("HomePhone2"),
    @XmlEnumValue("Isdn")
    ISDN("Isdn"),
    @XmlEnumValue("MobilePhone")
    MOBILE_PHONE("MobilePhone"),
    @XmlEnumValue("OtherFax")
    OTHER_FAX("OtherFax"),
    @XmlEnumValue("OtherTelephone")
    OTHER_TELEPHONE("OtherTelephone"),
    @XmlEnumValue("Pager")
    PAGER("Pager"),
    @XmlEnumValue("PrimaryPhone")
    PRIMARY_PHONE("PrimaryPhone"),
    @XmlEnumValue("RadioPhone")
    RADIO_PHONE("RadioPhone"),
    @XmlEnumValue("Telex")
    TELEX("Telex"),
    @XmlEnumValue("TtyTddPhone")
    TTY_TDD_PHONE("TtyTddPhone"),
    @XmlEnumValue("BusinessMobile")
    BUSINESS_MOBILE("BusinessMobile"),
    @XmlEnumValue("IPPhone")
    IP_PHONE("IPPhone"),
    @XmlEnumValue("Mms")
    MMS("Mms"),
    @XmlEnumValue("Msn")
    MSN("Msn");
    private final String value;

    PhoneNumberKeyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhoneNumberKeyType fromValue(String v) {
        for (PhoneNumberKeyType c: PhoneNumberKeyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
