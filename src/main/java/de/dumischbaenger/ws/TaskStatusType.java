
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TaskStatusType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotStarted"/&gt;
 *     &lt;enumeration value="InProgress"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *     &lt;enumeration value="WaitingOnOthers"/&gt;
 *     &lt;enumeration value="Deferred"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaskStatusType")
@XmlEnum
public enum TaskStatusType {

    @XmlEnumValue("NotStarted")
    NOT_STARTED("NotStarted"),
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("WaitingOnOthers")
    WAITING_ON_OTHERS("WaitingOnOthers"),
    @XmlEnumValue("Deferred")
    DEFERRED("Deferred");
    private final String value;

    TaskStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskStatusType fromValue(String v) {
        for (TaskStatusType c: TaskStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
