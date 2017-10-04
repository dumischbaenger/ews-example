
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DayOfWeekIndexType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DayOfWeekIndexType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="First"/&gt;
 *     &lt;enumeration value="Second"/&gt;
 *     &lt;enumeration value="Third"/&gt;
 *     &lt;enumeration value="Fourth"/&gt;
 *     &lt;enumeration value="Last"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DayOfWeekIndexType")
@XmlEnum
public enum DayOfWeekIndexType {

    @XmlEnumValue("First")
    FIRST("First"),
    @XmlEnumValue("Second")
    SECOND("Second"),
    @XmlEnumValue("Third")
    THIRD("Third"),
    @XmlEnumValue("Fourth")
    FOURTH("Fourth"),
    @XmlEnumValue("Last")
    LAST("Last");
    private final String value;

    DayOfWeekIndexType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DayOfWeekIndexType fromValue(String v) {
        for (DayOfWeekIndexType c: DayOfWeekIndexType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
