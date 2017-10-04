
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CalendarItemUpdateOperationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarItemUpdateOperationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SendToNone"/&gt;
 *     &lt;enumeration value="SendOnlyToAll"/&gt;
 *     &lt;enumeration value="SendOnlyToChanged"/&gt;
 *     &lt;enumeration value="SendToAllAndSaveCopy"/&gt;
 *     &lt;enumeration value="SendToChangedAndSaveCopy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarItemUpdateOperationType")
@XmlEnum
public enum CalendarItemUpdateOperationType {

    @XmlEnumValue("SendToNone")
    SEND_TO_NONE("SendToNone"),
    @XmlEnumValue("SendOnlyToAll")
    SEND_ONLY_TO_ALL("SendOnlyToAll"),
    @XmlEnumValue("SendOnlyToChanged")
    SEND_ONLY_TO_CHANGED("SendOnlyToChanged"),
    @XmlEnumValue("SendToAllAndSaveCopy")
    SEND_TO_ALL_AND_SAVE_COPY("SendToAllAndSaveCopy"),
    @XmlEnumValue("SendToChangedAndSaveCopy")
    SEND_TO_CHANGED_AND_SAVE_COPY("SendToChangedAndSaveCopy");
    private final String value;

    CalendarItemUpdateOperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarItemUpdateOperationType fromValue(String v) {
        for (CalendarItemUpdateOperationType c: CalendarItemUpdateOperationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
