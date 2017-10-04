
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MessageTrackingReportTemplateType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageTrackingReportTemplateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Summary"/&gt;
 *     &lt;enumeration value="RecipientPath"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageTrackingReportTemplateType")
@XmlEnum
public enum MessageTrackingReportTemplateType {

    @XmlEnumValue("Summary")
    SUMMARY("Summary"),
    @XmlEnumValue("RecipientPath")
    RECIPIENT_PATH("RecipientPath");
    private final String value;

    MessageTrackingReportTemplateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageTrackingReportTemplateType fromValue(String v) {
        for (MessageTrackingReportTemplateType c: MessageTrackingReportTemplateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
