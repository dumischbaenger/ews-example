
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ImAddressKeyType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ImAddressKeyType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ImAddress1"/&gt;
 *     &lt;enumeration value="ImAddress2"/&gt;
 *     &lt;enumeration value="ImAddress3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ImAddressKeyType")
@XmlEnum
public enum ImAddressKeyType {

    @XmlEnumValue("ImAddress1")
    IM_ADDRESS_1("ImAddress1"),
    @XmlEnumValue("ImAddress2")
    IM_ADDRESS_2("ImAddress2"),
    @XmlEnumValue("ImAddress3")
    IM_ADDRESS_3("ImAddress3");
    private final String value;

    ImAddressKeyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImAddressKeyType fromValue(String v) {
        for (ImAddressKeyType c: ImAddressKeyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
