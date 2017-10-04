
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FolderQueryTraversalType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FolderQueryTraversalType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Shallow"/&gt;
 *     &lt;enumeration value="Deep"/&gt;
 *     &lt;enumeration value="SoftDeleted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FolderQueryTraversalType")
@XmlEnum
public enum FolderQueryTraversalType {

    @XmlEnumValue("Shallow")
    SHALLOW("Shallow"),
    @XmlEnumValue("Deep")
    DEEP("Deep"),
    @XmlEnumValue("SoftDeleted")
    SOFT_DELETED("SoftDeleted");
    private final String value;

    FolderQueryTraversalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FolderQueryTraversalType fromValue(String v) {
        for (FolderQueryTraversalType c: FolderQueryTraversalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
