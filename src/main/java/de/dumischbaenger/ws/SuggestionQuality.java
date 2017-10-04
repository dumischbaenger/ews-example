
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SuggestionQuality.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SuggestionQuality"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Excellent"/&gt;
 *     &lt;enumeration value="Good"/&gt;
 *     &lt;enumeration value="Fair"/&gt;
 *     &lt;enumeration value="Poor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SuggestionQuality")
@XmlEnum
public enum SuggestionQuality {

    @XmlEnumValue("Excellent")
    EXCELLENT("Excellent"),
    @XmlEnumValue("Good")
    GOOD("Good"),
    @XmlEnumValue("Fair")
    FAIR("Fair"),
    @XmlEnumValue("Poor")
    POOR("Poor");
    private final String value;

    SuggestionQuality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SuggestionQuality fromValue(String v) {
        for (SuggestionQuality c: SuggestionQuality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
