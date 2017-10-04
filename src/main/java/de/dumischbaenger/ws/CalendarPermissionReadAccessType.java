
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CalendarPermissionReadAccessType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarPermissionReadAccessType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="TimeOnly"/&gt;
 *     &lt;enumeration value="TimeAndSubjectAndLocation"/&gt;
 *     &lt;enumeration value="FullDetails"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarPermissionReadAccessType")
@XmlEnum
public enum CalendarPermissionReadAccessType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("TimeOnly")
    TIME_ONLY("TimeOnly"),
    @XmlEnumValue("TimeAndSubjectAndLocation")
    TIME_AND_SUBJECT_AND_LOCATION("TimeAndSubjectAndLocation"),
    @XmlEnumValue("FullDetails")
    FULL_DETAILS("FullDetails");
    private final String value;

    CalendarPermissionReadAccessType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarPermissionReadAccessType fromValue(String v) {
        for (CalendarPermissionReadAccessType c: CalendarPermissionReadAccessType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
