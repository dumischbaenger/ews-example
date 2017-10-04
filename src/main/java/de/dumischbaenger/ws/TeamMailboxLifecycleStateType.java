
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TeamMailboxLifecycleStateType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TeamMailboxLifecycleStateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Closed"/&gt;
 *     &lt;enumeration value="Unlinked"/&gt;
 *     &lt;enumeration value="PendingDelete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TeamMailboxLifecycleStateType")
@XmlEnum
public enum TeamMailboxLifecycleStateType {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Closed")
    CLOSED("Closed"),
    @XmlEnumValue("Unlinked")
    UNLINKED("Unlinked"),
    @XmlEnumValue("PendingDelete")
    PENDING_DELETE("PendingDelete");
    private final String value;

    TeamMailboxLifecycleStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TeamMailboxLifecycleStateType fromValue(String v) {
        for (TeamMailboxLifecycleStateType c: TeamMailboxLifecycleStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
