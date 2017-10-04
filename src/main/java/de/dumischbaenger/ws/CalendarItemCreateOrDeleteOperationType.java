
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CalendarItemCreateOrDeleteOperationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarItemCreateOrDeleteOperationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SendToNone"/&gt;
 *     &lt;enumeration value="SendOnlyToAll"/&gt;
 *     &lt;enumeration value="SendToAllAndSaveCopy"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CalendarItemCreateOrDeleteOperationType")
@XmlEnum
public enum CalendarItemCreateOrDeleteOperationType {

    @XmlEnumValue("SendToNone")
    SEND_TO_NONE("SendToNone"),
    @XmlEnumValue("SendOnlyToAll")
    SEND_ONLY_TO_ALL("SendOnlyToAll"),
    @XmlEnumValue("SendToAllAndSaveCopy")
    SEND_TO_ALL_AND_SAVE_COPY("SendToAllAndSaveCopy");
    private final String value;

    CalendarItemCreateOrDeleteOperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarItemCreateOrDeleteOperationType fromValue(String v) {
        for (CalendarItemCreateOrDeleteOperationType c: CalendarItemCreateOrDeleteOperationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
