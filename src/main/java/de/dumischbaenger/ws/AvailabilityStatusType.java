
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AvailabilityStatusType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AvailabilityStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Free"/&gt;
 *     &lt;enumeration value="Tentative"/&gt;
 *     &lt;enumeration value="Busy"/&gt;
 *     &lt;enumeration value="Oof"/&gt;
 *     &lt;enumeration value="WorkingElsewhere"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AvailabilityStatusType")
@XmlEnum
public enum AvailabilityStatusType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Free")
    FREE("Free"),
    @XmlEnumValue("Tentative")
    TENTATIVE("Tentative"),
    @XmlEnumValue("Busy")
    BUSY("Busy"),
    @XmlEnumValue("Oof")
    OOF("Oof"),
    @XmlEnumValue("WorkingElsewhere")
    WORKING_ELSEWHERE("WorkingElsewhere");
    private final String value;

    AvailabilityStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailabilityStatusType fromValue(String v) {
        for (AvailabilityStatusType c: AvailabilityStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
