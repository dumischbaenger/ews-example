
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ConnectionFailureCauseType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConnectionFailureCauseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="UserBusy"/&gt;
 *     &lt;enumeration value="NoAnswer"/&gt;
 *     &lt;enumeration value="Unavailable"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConnectionFailureCauseType")
@XmlEnum
public enum ConnectionFailureCauseType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("UserBusy")
    USER_BUSY("UserBusy"),
    @XmlEnumValue("NoAnswer")
    NO_ANSWER("NoAnswer"),
    @XmlEnumValue("Unavailable")
    UNAVAILABLE("Unavailable"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ConnectionFailureCauseType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConnectionFailureCauseType fromValue(String v) {
        for (ConnectionFailureCauseType c: ConnectionFailureCauseType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
