
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ParticipantActivityRole.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipantActivityRole"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Organizer"/&gt;
 *     &lt;enumeration value="Attendee"/&gt;
 *     &lt;enumeration value="Presenter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParticipantActivityRole")
@XmlEnum
public enum ParticipantActivityRole {

    @XmlEnumValue("Organizer")
    ORGANIZER("Organizer"),
    @XmlEnumValue("Attendee")
    ATTENDEE("Attendee"),
    @XmlEnumValue("Presenter")
    PRESENTER("Presenter");
    private final String value;

    ParticipantActivityRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParticipantActivityRole fromValue(String v) {
        for (ParticipantActivityRole c: ParticipantActivityRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
