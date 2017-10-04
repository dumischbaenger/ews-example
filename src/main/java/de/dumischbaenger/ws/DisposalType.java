
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DisposalType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DisposalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HardDelete"/&gt;
 *     &lt;enumeration value="SoftDelete"/&gt;
 *     &lt;enumeration value="MoveToDeletedItems"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisposalType")
@XmlEnum
public enum DisposalType {

    @XmlEnumValue("HardDelete")
    HARD_DELETE("HardDelete"),
    @XmlEnumValue("SoftDelete")
    SOFT_DELETE("SoftDelete"),
    @XmlEnumValue("MoveToDeletedItems")
    MOVE_TO_DELETED_ITEMS("MoveToDeletedItems");
    private final String value;

    DisposalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisposalType fromValue(String v) {
        for (DisposalType c: DisposalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
