
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CreateActionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CreateActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CreateNew"/&gt;
 *     &lt;enumeration value="Update"/&gt;
 *     &lt;enumeration value="UpdateOrCreate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CreateActionType")
@XmlEnum
public enum CreateActionType {

    @XmlEnumValue("CreateNew")
    CREATE_NEW("CreateNew"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("UpdateOrCreate")
    UPDATE_OR_CREATE("UpdateOrCreate");
    private final String value;

    CreateActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreateActionType fromValue(String v) {
        for (CreateActionType c: CreateActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
