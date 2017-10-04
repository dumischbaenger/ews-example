
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für OnlineMeetingAccessLevelType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="OnlineMeetingAccessLevelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Locked"/&gt;
 *     &lt;enumeration value="Invited"/&gt;
 *     &lt;enumeration value="Internal"/&gt;
 *     &lt;enumeration value="Everyone"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OnlineMeetingAccessLevelType")
@XmlEnum
public enum OnlineMeetingAccessLevelType {

    @XmlEnumValue("Locked")
    LOCKED("Locked"),
    @XmlEnumValue("Invited")
    INVITED("Invited"),
    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("Everyone")
    EVERYONE("Everyone");
    private final String value;

    OnlineMeetingAccessLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OnlineMeetingAccessLevelType fromValue(String v) {
        for (OnlineMeetingAccessLevelType c: OnlineMeetingAccessLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
