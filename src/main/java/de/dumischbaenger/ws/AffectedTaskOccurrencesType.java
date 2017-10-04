
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AffectedTaskOccurrencesType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AffectedTaskOccurrencesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AllOccurrences"/&gt;
 *     &lt;enumeration value="SpecifiedOccurrenceOnly"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AffectedTaskOccurrencesType")
@XmlEnum
public enum AffectedTaskOccurrencesType {

    @XmlEnumValue("AllOccurrences")
    ALL_OCCURRENCES("AllOccurrences"),
    @XmlEnumValue("SpecifiedOccurrenceOnly")
    SPECIFIED_OCCURRENCE_ONLY("SpecifiedOccurrenceOnly");
    private final String value;

    AffectedTaskOccurrencesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AffectedTaskOccurrencesType fromValue(String v) {
        for (AffectedTaskOccurrencesType c: AffectedTaskOccurrencesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
