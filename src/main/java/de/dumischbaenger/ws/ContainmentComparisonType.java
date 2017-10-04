
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContainmentComparisonType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContainmentComparisonType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Exact"/&gt;
 *     &lt;enumeration value="IgnoreCase"/&gt;
 *     &lt;enumeration value="IgnoreNonSpacingCharacters"/&gt;
 *     &lt;enumeration value="Loose"/&gt;
 *     &lt;enumeration value="IgnoreCaseAndNonSpacingCharacters"/&gt;
 *     &lt;enumeration value="LooseAndIgnoreCase"/&gt;
 *     &lt;enumeration value="LooseAndIgnoreNonSpace"/&gt;
 *     &lt;enumeration value="LooseAndIgnoreCaseAndIgnoreNonSpace"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContainmentComparisonType")
@XmlEnum
public enum ContainmentComparisonType {

    @XmlEnumValue("Exact")
    EXACT("Exact"),
    @XmlEnumValue("IgnoreCase")
    IGNORE_CASE("IgnoreCase"),
    @XmlEnumValue("IgnoreNonSpacingCharacters")
    IGNORE_NON_SPACING_CHARACTERS("IgnoreNonSpacingCharacters"),
    @XmlEnumValue("Loose")
    LOOSE("Loose"),
    @XmlEnumValue("IgnoreCaseAndNonSpacingCharacters")
    IGNORE_CASE_AND_NON_SPACING_CHARACTERS("IgnoreCaseAndNonSpacingCharacters"),
    @XmlEnumValue("LooseAndIgnoreCase")
    LOOSE_AND_IGNORE_CASE("LooseAndIgnoreCase"),
    @XmlEnumValue("LooseAndIgnoreNonSpace")
    LOOSE_AND_IGNORE_NON_SPACE("LooseAndIgnoreNonSpace"),
    @XmlEnumValue("LooseAndIgnoreCaseAndIgnoreNonSpace")
    LOOSE_AND_IGNORE_CASE_AND_IGNORE_NON_SPACE("LooseAndIgnoreCaseAndIgnoreNonSpace");
    private final String value;

    ContainmentComparisonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContainmentComparisonType fromValue(String v) {
        for (ContainmentComparisonType c: ContainmentComparisonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
