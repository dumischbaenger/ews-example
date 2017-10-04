
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ResponseTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Organizer"/&gt;
 *     &lt;enumeration value="Tentative"/&gt;
 *     &lt;enumeration value="Accept"/&gt;
 *     &lt;enumeration value="Decline"/&gt;
 *     &lt;enumeration value="NoResponseReceived"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResponseTypeType")
@XmlEnum
public enum ResponseTypeType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Organizer")
    ORGANIZER("Organizer"),
    @XmlEnumValue("Tentative")
    TENTATIVE("Tentative"),
    @XmlEnumValue("Accept")
    ACCEPT("Accept"),
    @XmlEnumValue("Decline")
    DECLINE("Decline"),
    @XmlEnumValue("NoResponseReceived")
    NO_RESPONSE_RECEIVED("NoResponseReceived");
    private final String value;

    ResponseTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseTypeType fromValue(String v) {
        for (ResponseTypeType c: ResponseTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
