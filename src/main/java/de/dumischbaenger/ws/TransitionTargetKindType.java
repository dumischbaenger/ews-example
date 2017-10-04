
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TransitionTargetKindType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TransitionTargetKindType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Period"/&gt;
 *     &lt;enumeration value="Group"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransitionTargetKindType")
@XmlEnum
public enum TransitionTargetKindType {

    @XmlEnumValue("Period")
    PERIOD("Period"),
    @XmlEnumValue("Group")
    GROUP("Group");
    private final String value;

    TransitionTargetKindType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransitionTargetKindType fromValue(String v) {
        for (TransitionTargetKindType c: TransitionTargetKindType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
