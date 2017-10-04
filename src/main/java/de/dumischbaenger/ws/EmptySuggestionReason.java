
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EmptySuggestionReason.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EmptySuggestionReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="AttendeesUnavailable"/&gt;
 *     &lt;enumeration value="LocationsUnavailable"/&gt;
 *     &lt;enumeration value="OrganizerUnavailable"/&gt;
 *     &lt;enumeration value="AttendeesUnavailableOrUnknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmptySuggestionReason")
@XmlEnum
public enum EmptySuggestionReason {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("AttendeesUnavailable")
    ATTENDEES_UNAVAILABLE("AttendeesUnavailable"),
    @XmlEnumValue("LocationsUnavailable")
    LOCATIONS_UNAVAILABLE("LocationsUnavailable"),
    @XmlEnumValue("OrganizerUnavailable")
    ORGANIZER_UNAVAILABLE("OrganizerUnavailable"),
    @XmlEnumValue("AttendeesUnavailableOrUnknown")
    ATTENDEES_UNAVAILABLE_OR_UNKNOWN("AttendeesUnavailableOrUnknown");
    private final String value;

    EmptySuggestionReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmptySuggestionReason fromValue(String v) {
        for (EmptySuggestionReason c: EmptySuggestionReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
