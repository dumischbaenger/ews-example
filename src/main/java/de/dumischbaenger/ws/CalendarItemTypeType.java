
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CalendarItemTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarItemTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Single"/&gt;
 *     &lt;enumeration value="Occurrence"/&gt;
 *     &lt;enumeration value="Exception"/&gt;
 *     &lt;enumeration value="RecurringMaster"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarItemTypeType")
@XmlEnum
public enum CalendarItemTypeType {

    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Occurrence")
    OCCURRENCE("Occurrence"),
    @XmlEnumValue("Exception")
    EXCEPTION("Exception"),
    @XmlEnumValue("RecurringMaster")
    RECURRING_MASTER("RecurringMaster");
    private final String value;

    CalendarItemTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarItemTypeType fromValue(String v) {
        for (CalendarItemTypeType c: CalendarItemTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
