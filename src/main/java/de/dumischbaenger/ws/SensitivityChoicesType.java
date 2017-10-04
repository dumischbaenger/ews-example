
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SensitivityChoicesType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SensitivityChoicesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *     &lt;enumeration value="Private"/&gt;
 *     &lt;enumeration value="Confidential"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SensitivityChoicesType")
@XmlEnum
public enum SensitivityChoicesType {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("Confidential")
    CONFIDENTIAL("Confidential");
    private final String value;

    SensitivityChoicesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SensitivityChoicesType fromValue(String v) {
        for (SensitivityChoicesType c: SensitivityChoicesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
