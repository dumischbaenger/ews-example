
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EmailReminderSendOption.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailReminderSendOption"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotSet"/&gt;
 *     &lt;enumeration value="User"/&gt;
 *     &lt;enumeration value="AllAttendees"/&gt;
 *     &lt;enumeration value="Staff"/&gt;
 *     &lt;enumeration value="Customer"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmailReminderSendOption")
@XmlEnum
public enum EmailReminderSendOption {

    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("AllAttendees")
    ALL_ATTENDEES("AllAttendees"),
    @XmlEnumValue("Staff")
    STAFF("Staff"),
    @XmlEnumValue("Customer")
    CUSTOMER("Customer");
    private final String value;

    EmailReminderSendOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailReminderSendOption fromValue(String v) {
        for (EmailReminderSendOption c: EmailReminderSendOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
