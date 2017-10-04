
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MatchOptionsType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchOptionsType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FullString"/&gt;
 *     &lt;enumeration value="Prefix"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MatchOptionsType")
@XmlEnum
public enum MatchOptionsType {

    @XmlEnumValue("FullString")
    FULL_STRING("FullString"),
    @XmlEnumValue("Prefix")
    PREFIX("Prefix");
    private final String value;

    MatchOptionsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchOptionsType fromValue(String v) {
        for (MatchOptionsType c: MatchOptionsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
