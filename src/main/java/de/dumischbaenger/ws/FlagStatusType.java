
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FlagStatusType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FlagStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotFlagged"/&gt;
 *     &lt;enumeration value="Flagged"/&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlagStatusType")
@XmlEnum
public enum FlagStatusType {

    @XmlEnumValue("NotFlagged")
    NOT_FLAGGED("NotFlagged"),
    @XmlEnumValue("Flagged")
    FLAGGED("Flagged"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete");
    private final String value;

    FlagStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlagStatusType fromValue(String v) {
        for (FlagStatusType c: FlagStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
