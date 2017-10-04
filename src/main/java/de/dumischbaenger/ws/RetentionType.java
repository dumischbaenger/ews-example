
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RetentionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="RetentionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="Archive"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetentionType")
@XmlEnum
public enum RetentionType {

    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Archive")
    ARCHIVE("Archive");
    private final String value;

    RetentionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RetentionType fromValue(String v) {
        for (RetentionType c: RetentionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
