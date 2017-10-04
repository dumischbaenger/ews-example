
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SearchApplicationIdType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchApplicationIdType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Outlook"/&gt;
 *     &lt;enumeration value="Owa"/&gt;
 *     &lt;enumeration value="Paw"/&gt;
 *     &lt;enumeration value="Teamspace"/&gt;
 *     &lt;enumeration value="OneDrive"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchApplicationIdType")
@XmlEnum
public enum SearchApplicationIdType {

    @XmlEnumValue("Outlook")
    OUTLOOK("Outlook"),
    @XmlEnumValue("Owa")
    OWA("Owa"),
    @XmlEnumValue("Paw")
    PAW("Paw"),
    @XmlEnumValue("Teamspace")
    TEAMSPACE("Teamspace"),
    @XmlEnumValue("OneDrive")
    ONE_DRIVE("OneDrive"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SearchApplicationIdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchApplicationIdType fromValue(String v) {
        for (SearchApplicationIdType c: SearchApplicationIdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
