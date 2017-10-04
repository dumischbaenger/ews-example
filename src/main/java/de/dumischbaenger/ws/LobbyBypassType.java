
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LobbyBypassType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LobbyBypassType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Disabled"/&gt;
 *     &lt;enumeration value="EnabledForGatewayParticipants"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LobbyBypassType")
@XmlEnum
public enum LobbyBypassType {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("EnabledForGatewayParticipants")
    ENABLED_FOR_GATEWAY_PARTICIPANTS("EnabledForGatewayParticipants");
    private final String value;

    LobbyBypassType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LobbyBypassType fromValue(String v) {
        for (LobbyBypassType c: LobbyBypassType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
