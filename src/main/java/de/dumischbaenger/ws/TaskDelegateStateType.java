
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TaskDelegateStateType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskDelegateStateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoMatch"/&gt;
 *     &lt;enumeration value="OwnNew"/&gt;
 *     &lt;enumeration value="Owned"/&gt;
 *     &lt;enumeration value="Accepted"/&gt;
 *     &lt;enumeration value="Declined"/&gt;
 *     &lt;enumeration value="Max"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaskDelegateStateType")
@XmlEnum
public enum TaskDelegateStateType {

    @XmlEnumValue("NoMatch")
    NO_MATCH("NoMatch"),
    @XmlEnumValue("OwnNew")
    OWN_NEW("OwnNew"),
    @XmlEnumValue("Owned")
    OWNED("Owned"),
    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Declined")
    DECLINED("Declined"),
    @XmlEnumValue("Max")
    MAX("Max");
    private final String value;

    TaskDelegateStateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskDelegateStateType fromValue(String v) {
        for (TaskDelegateStateType c: TaskDelegateStateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
