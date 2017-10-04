
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PermissionActionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PermissionActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Owned"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PermissionActionType")
@XmlEnum
public enum PermissionActionType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Owned")
    OWNED("Owned"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    PermissionActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PermissionActionType fromValue(String v) {
        for (PermissionActionType c: PermissionActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
