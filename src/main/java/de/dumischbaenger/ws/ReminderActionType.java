
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ReminderActionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ReminderActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Dismiss"/&gt;
 *     &lt;enumeration value="Snooze"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReminderActionType")
@XmlEnum
public enum ReminderActionType {

    @XmlEnumValue("Dismiss")
    DISMISS("Dismiss"),
    @XmlEnumValue("Snooze")
    SNOOZE("Snooze");
    private final String value;

    ReminderActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReminderActionType fromValue(String v) {
        for (ReminderActionType c: ReminderActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
