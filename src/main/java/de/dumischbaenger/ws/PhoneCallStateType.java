
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PhoneCallStateType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PhoneCallStateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Idle"/&gt;
 *     &lt;enumeration value="Connecting"/&gt;
 *     &lt;enumeration value="Alerted"/&gt;
 *     &lt;enumeration value="Connected"/&gt;
 *     &lt;enumeration value="Disconnected"/&gt;
 *     &lt;enumeration value="Incoming"/&gt;
 *     &lt;enumeration value="Transferring"/&gt;
 *     &lt;enumeration value="Forwarding"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhoneCallStateType")
@XmlEnum
public enum PhoneCallStateType {

    @XmlEnumValue("Idle")
    IDLE("Idle"),
    @XmlEnumValue("Connecting")
    CONNECTING("Connecting"),
    @XmlEnumValue("Alerted")
    ALERTED("Alerted"),
    @XmlEnumValue("Connected")
    CONNECTED("Connected"),
    @XmlEnumValue("Disconnected")
    DISCONNECTED("Disconnected"),
    @XmlEnumValue("Incoming")
    INCOMING("Incoming"),
    @XmlEnumValue("Transferring")
    TRANSFERRING("Transferring"),
    @XmlEnumValue("Forwarding")
    FORWARDING("Forwarding");
    private final String value;

    PhoneCallStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhoneCallStateType fromValue(String v) {
        for (PhoneCallStateType c: PhoneCallStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
