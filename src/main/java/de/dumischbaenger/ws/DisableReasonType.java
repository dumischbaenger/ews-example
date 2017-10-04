
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für DisableReasonType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DisableReasonType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NoReason"/&gt;
 *     &lt;enumeration value="OutlookClientPerformance"/&gt;
 *     &lt;enumeration value="OWAClientPerformance"/&gt;
 *     &lt;enumeration value="MobileClientPerformance"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DisableReasonType")
@XmlEnum
public enum DisableReasonType {

    @XmlEnumValue("NoReason")
    NO_REASON("NoReason"),
    @XmlEnumValue("OutlookClientPerformance")
    OUTLOOK_CLIENT_PERFORMANCE("OutlookClientPerformance"),
    @XmlEnumValue("OWAClientPerformance")
    OWA_CLIENT_PERFORMANCE("OWAClientPerformance"),
    @XmlEnumValue("MobileClientPerformance")
    MOBILE_CLIENT_PERFORMANCE("MobileClientPerformance");
    private final String value;

    DisableReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisableReasonType fromValue(String v) {
        for (DisableReasonType c: DisableReasonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
