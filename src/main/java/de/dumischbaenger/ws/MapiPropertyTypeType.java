
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MapiPropertyTypeType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MapiPropertyTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ApplicationTime"/&gt;
 *     &lt;enumeration value="ApplicationTimeArray"/&gt;
 *     &lt;enumeration value="Binary"/&gt;
 *     &lt;enumeration value="BinaryArray"/&gt;
 *     &lt;enumeration value="Boolean"/&gt;
 *     &lt;enumeration value="CLSID"/&gt;
 *     &lt;enumeration value="CLSIDArray"/&gt;
 *     &lt;enumeration value="Currency"/&gt;
 *     &lt;enumeration value="CurrencyArray"/&gt;
 *     &lt;enumeration value="Double"/&gt;
 *     &lt;enumeration value="DoubleArray"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *     &lt;enumeration value="Float"/&gt;
 *     &lt;enumeration value="FloatArray"/&gt;
 *     &lt;enumeration value="Integer"/&gt;
 *     &lt;enumeration value="IntegerArray"/&gt;
 *     &lt;enumeration value="Long"/&gt;
 *     &lt;enumeration value="LongArray"/&gt;
 *     &lt;enumeration value="Null"/&gt;
 *     &lt;enumeration value="Object"/&gt;
 *     &lt;enumeration value="ObjectArray"/&gt;
 *     &lt;enumeration value="Short"/&gt;
 *     &lt;enumeration value="ShortArray"/&gt;
 *     &lt;enumeration value="SystemTime"/&gt;
 *     &lt;enumeration value="SystemTimeArray"/&gt;
 *     &lt;enumeration value="String"/&gt;
 *     &lt;enumeration value="StringArray"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MapiPropertyTypeType")
@XmlEnum
public enum MapiPropertyTypeType {

    @XmlEnumValue("ApplicationTime")
    APPLICATION_TIME("ApplicationTime"),
    @XmlEnumValue("ApplicationTimeArray")
    APPLICATION_TIME_ARRAY("ApplicationTimeArray"),
    @XmlEnumValue("Binary")
    BINARY("Binary"),
    @XmlEnumValue("BinaryArray")
    BINARY_ARRAY("BinaryArray"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    CLSID("CLSID"),
    @XmlEnumValue("CLSIDArray")
    CLSID_ARRAY("CLSIDArray"),
    @XmlEnumValue("Currency")
    CURRENCY("Currency"),
    @XmlEnumValue("CurrencyArray")
    CURRENCY_ARRAY("CurrencyArray"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("DoubleArray")
    DOUBLE_ARRAY("DoubleArray"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Float")
    FLOAT("Float"),
    @XmlEnumValue("FloatArray")
    FLOAT_ARRAY("FloatArray"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("IntegerArray")
    INTEGER_ARRAY("IntegerArray"),
    @XmlEnumValue("Long")
    LONG("Long"),
    @XmlEnumValue("LongArray")
    LONG_ARRAY("LongArray"),
    @XmlEnumValue("Null")
    NULL("Null"),
    @XmlEnumValue("Object")
    OBJECT("Object"),
    @XmlEnumValue("ObjectArray")
    OBJECT_ARRAY("ObjectArray"),
    @XmlEnumValue("Short")
    SHORT("Short"),
    @XmlEnumValue("ShortArray")
    SHORT_ARRAY("ShortArray"),
    @XmlEnumValue("SystemTime")
    SYSTEM_TIME("SystemTime"),
    @XmlEnumValue("SystemTimeArray")
    SYSTEM_TIME_ARRAY("SystemTimeArray"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("StringArray")
    STRING_ARRAY("StringArray");
    private final String value;

    MapiPropertyTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MapiPropertyTypeType fromValue(String v) {
        for (MapiPropertyTypeType c: MapiPropertyTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
