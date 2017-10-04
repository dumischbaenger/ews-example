
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für LocationSourceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="LocationServices"/&gt;
 *     &lt;enumeration value="PhonebookServices"/&gt;
 *     &lt;enumeration value="Device"/&gt;
 *     &lt;enumeration value="Contact"/&gt;
 *     &lt;enumeration value="Resource"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationSourceType")
@XmlEnum
public enum LocationSourceType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("LocationServices")
    LOCATION_SERVICES("LocationServices"),
    @XmlEnumValue("PhonebookServices")
    PHONEBOOK_SERVICES("PhonebookServices"),
    @XmlEnumValue("Device")
    DEVICE("Device"),
    @XmlEnumValue("Contact")
    CONTACT("Contact"),
    @XmlEnumValue("Resource")
    RESOURCE("Resource");
    private final String value;

    LocationSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationSourceType fromValue(String v) {
        for (LocationSourceType c: LocationSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
