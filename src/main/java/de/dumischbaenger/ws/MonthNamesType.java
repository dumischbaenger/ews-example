
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MonthNamesType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MonthNamesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="January"/&gt;
 *     &lt;enumeration value="February"/&gt;
 *     &lt;enumeration value="March"/&gt;
 *     &lt;enumeration value="April"/&gt;
 *     &lt;enumeration value="May"/&gt;
 *     &lt;enumeration value="June"/&gt;
 *     &lt;enumeration value="July"/&gt;
 *     &lt;enumeration value="August"/&gt;
 *     &lt;enumeration value="September"/&gt;
 *     &lt;enumeration value="October"/&gt;
 *     &lt;enumeration value="November"/&gt;
 *     &lt;enumeration value="December"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MonthNamesType")
@XmlEnum
public enum MonthNamesType {

    @XmlEnumValue("January")
    JANUARY("January"),
    @XmlEnumValue("February")
    FEBRUARY("February"),
    @XmlEnumValue("March")
    MARCH("March"),
    @XmlEnumValue("April")
    APRIL("April"),
    @XmlEnumValue("May")
    MAY("May"),
    @XmlEnumValue("June")
    JUNE("June"),
    @XmlEnumValue("July")
    JULY("July"),
    @XmlEnumValue("August")
    AUGUST("August"),
    @XmlEnumValue("September")
    SEPTEMBER("September"),
    @XmlEnumValue("October")
    OCTOBER("October"),
    @XmlEnumValue("November")
    NOVEMBER("November"),
    @XmlEnumValue("December")
    DECEMBER("December");
    private final String value;

    MonthNamesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MonthNamesType fromValue(String v) {
        for (MonthNamesType c: MonthNamesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
