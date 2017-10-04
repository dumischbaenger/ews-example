
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ContactSourceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ActiveDirectory"/&gt;
 *     &lt;enumeration value="Store"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContactSourceType")
@XmlEnum
public enum ContactSourceType {

    @XmlEnumValue("ActiveDirectory")
    ACTIVE_DIRECTORY("ActiveDirectory"),
    @XmlEnumValue("Store")
    STORE("Store");
    private final String value;

    ContactSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactSourceType fromValue(String v) {
        for (ContactSourceType c: ContactSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
