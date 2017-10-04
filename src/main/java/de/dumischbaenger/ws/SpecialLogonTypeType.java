
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SpecialLogonTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SpecialLogonTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Admin"/&gt;
 *     &lt;enumeration value="SystemService"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpecialLogonTypeType")
@XmlEnum
public enum SpecialLogonTypeType {

    @XmlEnumValue("Admin")
    ADMIN("Admin"),
    @XmlEnumValue("SystemService")
    SYSTEM_SERVICE("SystemService");
    private final String value;

    SpecialLogonTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialLogonTypeType fromValue(String v) {
        for (SpecialLogonTypeType c: SpecialLogonTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
