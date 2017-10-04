
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ResolveNamesSearchScopeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ResolveNamesSearchScopeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ActiveDirectory"/&gt;
 *     &lt;enumeration value="ActiveDirectoryContacts"/&gt;
 *     &lt;enumeration value="Contacts"/&gt;
 *     &lt;enumeration value="ContactsActiveDirectory"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResolveNamesSearchScopeType")
@XmlEnum
public enum ResolveNamesSearchScopeType {

    @XmlEnumValue("ActiveDirectory")
    ACTIVE_DIRECTORY("ActiveDirectory"),
    @XmlEnumValue("ActiveDirectoryContacts")
    ACTIVE_DIRECTORY_CONTACTS("ActiveDirectoryContacts"),
    @XmlEnumValue("Contacts")
    CONTACTS("Contacts"),
    @XmlEnumValue("ContactsActiveDirectory")
    CONTACTS_ACTIVE_DIRECTORY("ContactsActiveDirectory");
    private final String value;

    ResolveNamesSearchScopeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResolveNamesSearchScopeType fromValue(String v) {
        for (ResolveNamesSearchScopeType c: ResolveNamesSearchScopeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
