
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConsentStateType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConsentStateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotResponded"/&gt;
 *     &lt;enumeration value="NotConsented"/&gt;
 *     &lt;enumeration value="Consented"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConsentStateType")
@XmlEnum
public enum ConsentStateType {

    @XmlEnumValue("NotResponded")
    NOT_RESPONDED("NotResponded"),
    @XmlEnumValue("NotConsented")
    NOT_CONSENTED("NotConsented"),
    @XmlEnumValue("Consented")
    CONSENTED("Consented");
    private final String value;

    ConsentStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConsentStateType fromValue(String v) {
        for (ConsentStateType c: ConsentStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
