
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IndexBasePointType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IndexBasePointType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Beginning"/&gt;
 *     &lt;enumeration value="End"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IndexBasePointType")
@XmlEnum
public enum IndexBasePointType {

    @XmlEnumValue("Beginning")
    BEGINNING("Beginning"),
    @XmlEnumValue("End")
    END("End");
    private final String value;

    IndexBasePointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndexBasePointType fromValue(String v) {
        for (IndexBasePointType c: IndexBasePointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
