
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LegacyFreeBusyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LegacyFreeBusyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Free"/&gt;
 *     &lt;enumeration value="Tentative"/&gt;
 *     &lt;enumeration value="Busy"/&gt;
 *     &lt;enumeration value="OOF"/&gt;
 *     &lt;enumeration value="WorkingElsewhere"/&gt;
 *     &lt;enumeration value="NoData"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LegacyFreeBusyType")
@XmlEnum
public enum LegacyFreeBusyType {

    @XmlEnumValue("Free")
    FREE("Free"),
    @XmlEnumValue("Tentative")
    TENTATIVE("Tentative"),
    @XmlEnumValue("Busy")
    BUSY("Busy"),
    OOF("OOF"),
    @XmlEnumValue("WorkingElsewhere")
    WORKING_ELSEWHERE("WorkingElsewhere"),
    @XmlEnumValue("NoData")
    NO_DATA("NoData");
    private final String value;

    LegacyFreeBusyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LegacyFreeBusyType fromValue(String v) {
        for (LegacyFreeBusyType c: LegacyFreeBusyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
