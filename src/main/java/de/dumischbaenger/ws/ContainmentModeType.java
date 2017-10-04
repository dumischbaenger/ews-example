
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContainmentModeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContainmentModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FullString"/&gt;
 *     &lt;enumeration value="Prefixed"/&gt;
 *     &lt;enumeration value="Substring"/&gt;
 *     &lt;enumeration value="PrefixOnWords"/&gt;
 *     &lt;enumeration value="ExactPhrase"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContainmentModeType")
@XmlEnum
public enum ContainmentModeType {

    @XmlEnumValue("FullString")
    FULL_STRING("FullString"),
    @XmlEnumValue("Prefixed")
    PREFIXED("Prefixed"),
    @XmlEnumValue("Substring")
    SUBSTRING("Substring"),
    @XmlEnumValue("PrefixOnWords")
    PREFIX_ON_WORDS("PrefixOnWords"),
    @XmlEnumValue("ExactPhrase")
    EXACT_PHRASE("ExactPhrase");
    private final String value;

    ContainmentModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContainmentModeType fromValue(String v) {
        for (ContainmentModeType c: ContainmentModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
