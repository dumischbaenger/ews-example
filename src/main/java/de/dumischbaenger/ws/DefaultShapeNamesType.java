
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DefaultShapeNamesType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DefaultShapeNamesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IdOnly"/&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="AllProperties"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DefaultShapeNamesType")
@XmlEnum
public enum DefaultShapeNamesType {

    @XmlEnumValue("IdOnly")
    ID_ONLY("IdOnly"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("AllProperties")
    ALL_PROPERTIES("AllProperties");
    private final String value;

    DefaultShapeNamesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DefaultShapeNamesType fromValue(String v) {
        for (DefaultShapeNamesType c: DefaultShapeNamesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
