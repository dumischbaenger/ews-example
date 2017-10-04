
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ClientExtensionProvidedToType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientExtensionProvidedToType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Everyone"/&gt;
 *     &lt;enumeration value="SpecificUsers"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClientExtensionProvidedToType")
@XmlEnum
public enum ClientExtensionProvidedToType {

    @XmlEnumValue("Everyone")
    EVERYONE("Everyone"),
    @XmlEnumValue("SpecificUsers")
    SPECIFIC_USERS("SpecificUsers");
    private final String value;

    ClientExtensionProvidedToType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientExtensionProvidedToType fromValue(String v) {
        for (ClientExtensionProvidedToType c: ClientExtensionProvidedToType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
