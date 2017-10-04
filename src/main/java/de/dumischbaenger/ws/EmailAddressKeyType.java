
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EmailAddressKeyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailAddressKeyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EmailAddress1"/&gt;
 *     &lt;enumeration value="EmailAddress2"/&gt;
 *     &lt;enumeration value="EmailAddress3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmailAddressKeyType")
@XmlEnum
public enum EmailAddressKeyType {

    @XmlEnumValue("EmailAddress1")
    EMAIL_ADDRESS_1("EmailAddress1"),
    @XmlEnumValue("EmailAddress2")
    EMAIL_ADDRESS_2("EmailAddress2"),
    @XmlEnumValue("EmailAddress3")
    EMAIL_ADDRESS_3("EmailAddress3");
    private final String value;

    EmailAddressKeyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailAddressKeyType fromValue(String v) {
        for (EmailAddressKeyType c: EmailAddressKeyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
