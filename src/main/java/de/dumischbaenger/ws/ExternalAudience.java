
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExternalAudience.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExternalAudience"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Known"/&gt;
 *     &lt;enumeration value="All"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExternalAudience")
@XmlEnum
public enum ExternalAudience {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Known")
    KNOWN("Known"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    ExternalAudience(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExternalAudience fromValue(String v) {
        for (ExternalAudience c: ExternalAudience.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
