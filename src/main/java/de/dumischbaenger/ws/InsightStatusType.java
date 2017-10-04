
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für InsightStatusType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="InsightStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Dismissed"/&gt;
 *     &lt;enumeration value="Invalid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InsightStatusType")
@XmlEnum
public enum InsightStatusType {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Dismissed")
    DISMISSED("Dismissed"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid");
    private final String value;

    InsightStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsightStatusType fromValue(String v) {
        for (InsightStatusType c: InsightStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
