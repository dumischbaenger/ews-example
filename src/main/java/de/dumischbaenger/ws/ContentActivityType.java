
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContentActivityType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentActivityType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Poll"/&gt;
 *     &lt;enumeration value="WhiteBoard"/&gt;
 *     &lt;enumeration value="QAndA"/&gt;
 *     &lt;enumeration value="Chat"/&gt;
 *     &lt;enumeration value="Meeting"/&gt;
 *     &lt;enumeration value="Annotations"/&gt;
 *     &lt;enumeration value="SharedNotes"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ContentActivityType")
@XmlEnum
public enum ContentActivityType {

    @XmlEnumValue("Poll")
    POLL("Poll"),
    @XmlEnumValue("WhiteBoard")
    WHITE_BOARD("WhiteBoard"),
    @XmlEnumValue("QAndA")
    Q_AND_A("QAndA"),
    @XmlEnumValue("Chat")
    CHAT("Chat"),
    @XmlEnumValue("Meeting")
    MEETING("Meeting"),
    @XmlEnumValue("Annotations")
    ANNOTATIONS("Annotations"),
    @XmlEnumValue("SharedNotes")
    SHARED_NOTES("SharedNotes");
    private final String value;

    ContentActivityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentActivityType fromValue(String v) {
        for (ContentActivityType c: ContentActivityType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
