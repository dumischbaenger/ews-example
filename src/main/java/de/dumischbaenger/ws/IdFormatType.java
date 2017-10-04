
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für IdFormatType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IdFormatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EwsLegacyId"/&gt;
 *     &lt;enumeration value="EwsId"/&gt;
 *     &lt;enumeration value="EntryId"/&gt;
 *     &lt;enumeration value="HexEntryId"/&gt;
 *     &lt;enumeration value="StoreId"/&gt;
 *     &lt;enumeration value="OwaId"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IdFormatType")
@XmlEnum
public enum IdFormatType {

    @XmlEnumValue("EwsLegacyId")
    EWS_LEGACY_ID("EwsLegacyId"),
    @XmlEnumValue("EwsId")
    EWS_ID("EwsId"),
    @XmlEnumValue("EntryId")
    ENTRY_ID("EntryId"),
    @XmlEnumValue("HexEntryId")
    HEX_ENTRY_ID("HexEntryId"),
    @XmlEnumValue("StoreId")
    STORE_ID("StoreId"),
    @XmlEnumValue("OwaId")
    OWA_ID("OwaId");
    private final String value;

    IdFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IdFormatType fromValue(String v) {
        for (IdFormatType c: IdFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
