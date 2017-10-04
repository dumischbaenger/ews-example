
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ItemQueryTraversalType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemQueryTraversalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Shallow"/&gt;
 *     &lt;enumeration value="SoftDeleted"/&gt;
 *     &lt;enumeration value="Associated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemQueryTraversalType")
@XmlEnum
public enum ItemQueryTraversalType {

    @XmlEnumValue("Shallow")
    SHALLOW("Shallow"),
    @XmlEnumValue("SoftDeleted")
    SOFT_DELETED("SoftDeleted"),
    @XmlEnumValue("Associated")
    ASSOCIATED("Associated");
    private final String value;

    ItemQueryTraversalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemQueryTraversalType fromValue(String v) {
        for (ItemQueryTraversalType c: ItemQueryTraversalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
