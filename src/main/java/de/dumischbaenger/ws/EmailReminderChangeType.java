
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EmailReminderChangeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailReminderChangeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Added"/&gt;
 *     &lt;enumeration value="Override"/&gt;
 *     &lt;enumeration value="Deleted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmailReminderChangeType")
@XmlEnum
public enum EmailReminderChangeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Added")
    ADDED("Added"),
    @XmlEnumValue("Override")
    OVERRIDE("Override"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    EmailReminderChangeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailReminderChangeType fromValue(String v) {
        for (EmailReminderChangeType c: EmailReminderChangeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
