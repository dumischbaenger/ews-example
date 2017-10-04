
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GroupSummaryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GroupSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GroupCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UnreadCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="InstanceKey" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="GroupByValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupSummaryType", propOrder = {
    "groupCount",
    "unreadCount",
    "instanceKey",
    "groupByValue"
})
public class GroupSummaryType {

    @XmlElement(name = "GroupCount")
    protected int groupCount;
    @XmlElement(name = "UnreadCount")
    protected int unreadCount;
    @XmlElement(name = "InstanceKey", required = true)
    protected byte[] instanceKey;
    @XmlElement(name = "GroupByValue", required = true)
    protected String groupByValue;

    /**
     * Ruft den Wert der groupCount-Eigenschaft ab.
     * 
     */
    public int getGroupCount() {
        return groupCount;
    }

    /**
     * Legt den Wert der groupCount-Eigenschaft fest.
     * 
     */
    public void setGroupCount(int value) {
        this.groupCount = value;
    }

    /**
     * Ruft den Wert der unreadCount-Eigenschaft ab.
     * 
     */
    public int getUnreadCount() {
        return unreadCount;
    }

    /**
     * Legt den Wert der unreadCount-Eigenschaft fest.
     * 
     */
    public void setUnreadCount(int value) {
        this.unreadCount = value;
    }

    /**
     * Ruft den Wert der instanceKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInstanceKey() {
        return instanceKey;
    }

    /**
     * Legt den Wert der instanceKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInstanceKey(byte[] value) {
        this.instanceKey = value;
    }

    /**
     * Ruft den Wert der groupByValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupByValue() {
        return groupByValue;
    }

    /**
     * Legt den Wert der groupByValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupByValue(String value) {
        this.groupByValue = value;
    }

}
