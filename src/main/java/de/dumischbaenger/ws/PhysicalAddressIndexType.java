
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PhysicalAddressIndexType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PhysicalAddressIndexType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Home"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhysicalAddressIndexType")
@XmlEnum
public enum PhysicalAddressIndexType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PhysicalAddressIndexType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhysicalAddressIndexType fromValue(String v) {
        for (PhysicalAddressIndexType c: PhysicalAddressIndexType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
