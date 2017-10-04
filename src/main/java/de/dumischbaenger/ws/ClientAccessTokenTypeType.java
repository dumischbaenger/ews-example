
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ClientAccessTokenTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientAccessTokenTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CallerIdentity"/&gt;
 *     &lt;enumeration value="ExtensionCallback"/&gt;
 *     &lt;enumeration value="ScopedToken"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClientAccessTokenTypeType")
@XmlEnum
public enum ClientAccessTokenTypeType {

    @XmlEnumValue("CallerIdentity")
    CALLER_IDENTITY("CallerIdentity"),
    @XmlEnumValue("ExtensionCallback")
    EXTENSION_CALLBACK("ExtensionCallback"),
    @XmlEnumValue("ScopedToken")
    SCOPED_TOKEN("ScopedToken");
    private final String value;

    ClientAccessTokenTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientAccessTokenTypeType fromValue(String v) {
        for (ClientAccessTokenTypeType c: ClientAccessTokenTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
