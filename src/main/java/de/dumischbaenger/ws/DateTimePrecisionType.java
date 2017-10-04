
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DateTimePrecisionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DateTimePrecisionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Seconds"/&gt;
 *     &lt;enumeration value="Milliseconds"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DateTimePrecisionType")
@XmlEnum
public enum DateTimePrecisionType {

    @XmlEnumValue("Seconds")
    SECONDS("Seconds"),
    @XmlEnumValue("Milliseconds")
    MILLISECONDS("Milliseconds");
    private final String value;

    DateTimePrecisionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateTimePrecisionType fromValue(String v) {
        for (DateTimePrecisionType c: DateTimePrecisionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
