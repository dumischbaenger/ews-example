
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ClientExtensionTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ClientExtensionTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="Private"/&gt;
 *     &lt;enumeration value="MarketPlace"/&gt;
 *     &lt;enumeration value="PrivateCatalog"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClientExtensionTypeType")
@XmlEnum
public enum ClientExtensionTypeType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Private")
    PRIVATE("Private"),
    @XmlEnumValue("MarketPlace")
    MARKET_PLACE("MarketPlace"),
    @XmlEnumValue("PrivateCatalog")
    PRIVATE_CATALOG("PrivateCatalog");
    private final String value;

    ClientExtensionTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClientExtensionTypeType fromValue(String v) {
        for (ClientExtensionTypeType c: ClientExtensionTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
