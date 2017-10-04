
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TokenSourceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TokenSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="LinkedIn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TokenSourceType")
@XmlEnum
public enum TokenSourceType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("LinkedIn")
    LINKED_IN("LinkedIn");
    private final String value;

    TokenSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TokenSourceType fromValue(String v) {
        for (TokenSourceType c: TokenSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
