
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ModernGroupTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ModernGroupTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Private"/&gt;
 *     &lt;enumeration value="Secret"/&gt;
 *     &lt;enumeration value="Public"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ModernGroupTypeType")
@XmlEnum
public enum ModernGroupTypeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Secret")
    SECRET("Secret"),
    @XmlEnumValue("Public")
    PUBLIC("Public");
    private final String value;

    ModernGroupTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModernGroupTypeType fromValue(String v) {
        for (ModernGroupTypeType c: ModernGroupTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
