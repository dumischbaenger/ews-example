
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AvailabilityProxyRequestType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AvailabilityProxyRequestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CrossSite"/&gt;
 *     &lt;enumeration value="CrossForest"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AvailabilityProxyRequestType")
@XmlEnum
public enum AvailabilityProxyRequestType {

    @XmlEnumValue("CrossSite")
    CROSS_SITE("CrossSite"),
    @XmlEnumValue("CrossForest")
    CROSS_FOREST("CrossForest");
    private final String value;

    AvailabilityProxyRequestType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AvailabilityProxyRequestType fromValue(String v) {
        for (AvailabilityProxyRequestType c: AvailabilityProxyRequestType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
