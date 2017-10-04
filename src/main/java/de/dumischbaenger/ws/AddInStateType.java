
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AddInStateType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AddInStateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Flagged"/&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Removed"/&gt;
 *     &lt;enumeration value="Undefined"/&gt;
 *     &lt;enumeration value="WithdrawingSoon"/&gt;
 *     &lt;enumeration value="Withdrawn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddInStateType")
@XmlEnum
public enum AddInStateType {

    @XmlEnumValue("Flagged")
    FLAGGED("Flagged"),
    OK("OK"),
    @XmlEnumValue("Removed")
    REMOVED("Removed"),
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),
    @XmlEnumValue("WithdrawingSoon")
    WITHDRAWING_SOON("WithdrawingSoon"),
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn");
    private final String value;

    AddInStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AddInStateType fromValue(String v) {
        for (AddInStateType c: AddInStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
