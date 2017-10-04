
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ViewFilterType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ViewFilterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All"/&gt;
 *     &lt;enumeration value="Flagged"/&gt;
 *     &lt;enumeration value="HasAttachment"/&gt;
 *     &lt;enumeration value="ToOrCcMe"/&gt;
 *     &lt;enumeration value="Unread"/&gt;
 *     &lt;enumeration value="TaskActive"/&gt;
 *     &lt;enumeration value="TaskOverdue"/&gt;
 *     &lt;enumeration value="TaskCompleted"/&gt;
 *     &lt;enumeration value="NoClutter"/&gt;
 *     &lt;enumeration value="Clutter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ViewFilterType")
@XmlEnum
public enum ViewFilterType {

    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Flagged")
    FLAGGED("Flagged"),
    @XmlEnumValue("HasAttachment")
    HAS_ATTACHMENT("HasAttachment"),
    @XmlEnumValue("ToOrCcMe")
    TO_OR_CC_ME("ToOrCcMe"),
    @XmlEnumValue("Unread")
    UNREAD("Unread"),
    @XmlEnumValue("TaskActive")
    TASK_ACTIVE("TaskActive"),
    @XmlEnumValue("TaskOverdue")
    TASK_OVERDUE("TaskOverdue"),
    @XmlEnumValue("TaskCompleted")
    TASK_COMPLETED("TaskCompleted"),
    @XmlEnumValue("NoClutter")
    NO_CLUTTER("NoClutter"),
    @XmlEnumValue("Clutter")
    CLUTTER("Clutter");
    private final String value;

    ViewFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ViewFilterType fromValue(String v) {
        for (ViewFilterType c: ViewFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
