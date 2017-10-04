
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ExchangeVersionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeVersionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Exchange2007"/&gt;
 *     &lt;enumeration value="Exchange2007_SP1"/&gt;
 *     &lt;enumeration value="Exchange2009"/&gt;
 *     &lt;enumeration value="Exchange2010"/&gt;
 *     &lt;enumeration value="Exchange2010_SP1"/&gt;
 *     &lt;enumeration value="Exchange2010_SP2"/&gt;
 *     &lt;enumeration value="Exchange2012"/&gt;
 *     &lt;enumeration value="Exchange2013"/&gt;
 *     &lt;enumeration value="Exchange2013_SP1"/&gt;
 *     &lt;enumeration value="Exchange2015"/&gt;
 *     &lt;enumeration value="Exchange2016"/&gt;
 *     &lt;enumeration value="V2015_10_05"/&gt;
 *     &lt;enumeration value="V2016_01_06"/&gt;
 *     &lt;enumeration value="V2016_04_13"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExchangeVersionType")
@XmlEnum
public enum ExchangeVersionType {

    @XmlEnumValue("Exchange2007")
    EXCHANGE_2007("Exchange2007"),
    @XmlEnumValue("Exchange2007_SP1")
    EXCHANGE_2007_SP_1("Exchange2007_SP1"),
    @XmlEnumValue("Exchange2009")
    EXCHANGE_2009("Exchange2009"),
    @XmlEnumValue("Exchange2010")
    EXCHANGE_2010("Exchange2010"),
    @XmlEnumValue("Exchange2010_SP1")
    EXCHANGE_2010_SP_1("Exchange2010_SP1"),
    @XmlEnumValue("Exchange2010_SP2")
    EXCHANGE_2010_SP_2("Exchange2010_SP2"),
    @XmlEnumValue("Exchange2012")
    EXCHANGE_2012("Exchange2012"),
    @XmlEnumValue("Exchange2013")
    EXCHANGE_2013("Exchange2013"),
    @XmlEnumValue("Exchange2013_SP1")
    EXCHANGE_2013_SP_1("Exchange2013_SP1"),
    @XmlEnumValue("Exchange2015")
    EXCHANGE_2015("Exchange2015"),
    @XmlEnumValue("Exchange2016")
    EXCHANGE_2016("Exchange2016"),
    @XmlEnumValue("V2015_10_05")
    V_2015_10_05("V2015_10_05"),
    @XmlEnumValue("V2016_01_06")
    V_2016_01_06("V2016_01_06"),
    @XmlEnumValue("V2016_04_13")
    V_2016_04_13("V2016_04_13");
    private final String value;

    ExchangeVersionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExchangeVersionType fromValue(String v) {
        for (ExchangeVersionType c: ExchangeVersionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
