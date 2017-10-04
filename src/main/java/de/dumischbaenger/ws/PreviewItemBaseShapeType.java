
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PreviewItemBaseShapeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="PreviewItemBaseShapeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Compact"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PreviewItemBaseShapeType")
@XmlEnum
public enum PreviewItemBaseShapeType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Compact")
    COMPACT("Compact");
    private final String value;

    PreviewItemBaseShapeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreviewItemBaseShapeType fromValue(String v) {
        for (PreviewItemBaseShapeType c: PreviewItemBaseShapeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
