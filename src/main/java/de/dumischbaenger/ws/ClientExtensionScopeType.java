
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ClientExtensionScopeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientExtensionScopeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="User"/&gt;
 *     &lt;enumeration value="Organization"/&gt;
 *     &lt;enumeration value="Default"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClientExtensionScopeType")
@XmlEnum
public enum ClientExtensionScopeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("User")
    USER("User"),
    @XmlEnumValue("Organization")
    ORGANIZATION("Organization"),
    @XmlEnumValue("Default")
    DEFAULT("Default");
    private final String value;

    ClientExtensionScopeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientExtensionScopeType fromValue(String v) {
        for (ClientExtensionScopeType c: ClientExtensionScopeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
