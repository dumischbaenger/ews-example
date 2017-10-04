
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MemberStatusType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MemberStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unrecognized"/&gt;
 *     &lt;enumeration value="Normal"/&gt;
 *     &lt;enumeration value="Demoted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MemberStatusType")
@XmlEnum
public enum MemberStatusType {

    @XmlEnumValue("Unrecognized")
    UNRECOGNIZED("Unrecognized"),
    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("Demoted")
    DEMOTED("Demoted");
    private final String value;

    MemberStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MemberStatusType fromValue(String v) {
        for (MemberStatusType c: MemberStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
