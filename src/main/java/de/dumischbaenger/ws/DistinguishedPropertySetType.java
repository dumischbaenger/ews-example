
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DistinguishedPropertySetType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DistinguishedPropertySetType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Meeting"/&gt;
 *     &lt;enumeration value="Appointment"/&gt;
 *     &lt;enumeration value="Common"/&gt;
 *     &lt;enumeration value="PublicStrings"/&gt;
 *     &lt;enumeration value="Address"/&gt;
 *     &lt;enumeration value="InternetHeaders"/&gt;
 *     &lt;enumeration value="CalendarAssistant"/&gt;
 *     &lt;enumeration value="UnifiedMessaging"/&gt;
 *     &lt;enumeration value="Task"/&gt;
 *     &lt;enumeration value="Sharing"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DistinguishedPropertySetType")
@XmlEnum
public enum DistinguishedPropertySetType {

    @XmlEnumValue("Meeting")
    MEETING("Meeting"),
    @XmlEnumValue("Appointment")
    APPOINTMENT("Appointment"),
    @XmlEnumValue("Common")
    COMMON("Common"),
    @XmlEnumValue("PublicStrings")
    PUBLIC_STRINGS("PublicStrings"),
    @XmlEnumValue("Address")
    ADDRESS("Address"),
    @XmlEnumValue("InternetHeaders")
    INTERNET_HEADERS("InternetHeaders"),
    @XmlEnumValue("CalendarAssistant")
    CALENDAR_ASSISTANT("CalendarAssistant"),
    @XmlEnumValue("UnifiedMessaging")
    UNIFIED_MESSAGING("UnifiedMessaging"),
    @XmlEnumValue("Task")
    TASK("Task"),
    @XmlEnumValue("Sharing")
    SHARING("Sharing");
    private final String value;

    DistinguishedPropertySetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistinguishedPropertySetType fromValue(String v) {
        for (DistinguishedPropertySetType c: DistinguishedPropertySetType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
