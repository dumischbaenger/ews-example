
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CompleteActionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CompleteActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Commit"/&gt;
 *     &lt;enumeration value="Abandon"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompleteActionType")
@XmlEnum
public enum CompleteActionType {

    @XmlEnumValue("Commit")
    COMMIT("Commit"),
    @XmlEnumValue("Abandon")
    ABANDON("Abandon");
    private final String value;

    CompleteActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompleteActionType fromValue(String v) {
        for (CompleteActionType c: CompleteActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
