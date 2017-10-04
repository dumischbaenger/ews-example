
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SyncFolderItemsScopeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SyncFolderItemsScopeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NormalItems"/&gt;
 *     &lt;enumeration value="NormalAndAssociatedItems"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SyncFolderItemsScopeType")
@XmlEnum
public enum SyncFolderItemsScopeType {

    @XmlEnumValue("NormalItems")
    NORMAL_ITEMS("NormalItems"),
    @XmlEnumValue("NormalAndAssociatedItems")
    NORMAL_AND_ASSOCIATED_ITEMS("NormalAndAssociatedItems");
    private final String value;

    SyncFolderItemsScopeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SyncFolderItemsScopeType fromValue(String v) {
        for (SyncFolderItemsScopeType c: SyncFolderItemsScopeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
