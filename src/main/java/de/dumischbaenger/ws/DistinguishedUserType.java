
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DistinguishedUserType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DistinguishedUserType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Anonymous"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DistinguishedUserType")
@XmlEnum
public enum DistinguishedUserType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Anonymous")
    ANONYMOUS("Anonymous");
    private final String value;

    DistinguishedUserType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistinguishedUserType fromValue(String v) {
        for (DistinguishedUserType c: DistinguishedUserType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
