
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für HoldStatusType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HoldStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotOnHold"/&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="OnHold"/&gt;
 *     &lt;enumeration value="PartialHold"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HoldStatusType")
@XmlEnum
public enum HoldStatusType {

    @XmlEnumValue("NotOnHold")
    NOT_ON_HOLD("NotOnHold"),
    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("OnHold")
    ON_HOLD("OnHold"),
    @XmlEnumValue("PartialHold")
    PARTIAL_HOLD("PartialHold"),
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    HoldStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HoldStatusType fromValue(String v) {
        for (HoldStatusType c: HoldStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
