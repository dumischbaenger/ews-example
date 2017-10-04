
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NotificationEventTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="NotificationEventTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CopiedEvent"/&gt;
 *     &lt;enumeration value="CreatedEvent"/&gt;
 *     &lt;enumeration value="DeletedEvent"/&gt;
 *     &lt;enumeration value="ModifiedEvent"/&gt;
 *     &lt;enumeration value="MovedEvent"/&gt;
 *     &lt;enumeration value="NewMailEvent"/&gt;
 *     &lt;enumeration value="FreeBusyChangedEvent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationEventTypeType")
@XmlEnum
public enum NotificationEventTypeType {

    @XmlEnumValue("CopiedEvent")
    COPIED_EVENT("CopiedEvent"),
    @XmlEnumValue("CreatedEvent")
    CREATED_EVENT("CreatedEvent"),
    @XmlEnumValue("DeletedEvent")
    DELETED_EVENT("DeletedEvent"),
    @XmlEnumValue("ModifiedEvent")
    MODIFIED_EVENT("ModifiedEvent"),
    @XmlEnumValue("MovedEvent")
    MOVED_EVENT("MovedEvent"),
    @XmlEnumValue("NewMailEvent")
    NEW_MAIL_EVENT("NewMailEvent"),
    @XmlEnumValue("FreeBusyChangedEvent")
    FREE_BUSY_CHANGED_EVENT("FreeBusyChangedEvent");
    private final String value;

    NotificationEventTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotificationEventTypeType fromValue(String v) {
        for (NotificationEventTypeType c: NotificationEventTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
