
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MeetingAttendeeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MeetingAttendeeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Organizer"/&gt;
 *     &lt;enumeration value="Required"/&gt;
 *     &lt;enumeration value="Optional"/&gt;
 *     &lt;enumeration value="Room"/&gt;
 *     &lt;enumeration value="Resource"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MeetingAttendeeType")
@XmlEnum
public enum MeetingAttendeeType {

    @XmlEnumValue("Organizer")
    ORGANIZER("Organizer"),
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),
    @XmlEnumValue("Room")
    ROOM("Room"),
    @XmlEnumValue("Resource")
    RESOURCE("Resource");
    private final String value;

    MeetingAttendeeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeetingAttendeeType fromValue(String v) {
        for (MeetingAttendeeType c: MeetingAttendeeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
