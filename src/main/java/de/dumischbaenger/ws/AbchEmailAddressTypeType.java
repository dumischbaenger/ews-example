
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AbchEmailAddressTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AbchEmailAddressTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Passport"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AbchEmailAddressTypeType")
@XmlEnum
public enum AbchEmailAddressTypeType {

    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Passport")
    PASSPORT("Passport");
    private final String value;

    AbchEmailAddressTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AbchEmailAddressTypeType fromValue(String v) {
        for (AbchEmailAddressTypeType c: AbchEmailAddressTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
