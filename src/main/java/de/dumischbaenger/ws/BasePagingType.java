
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BasePagingType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BasePagingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="MaxEntriesReturned" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePagingType")
@XmlSeeAlso({
    IndexedPageViewType.class,
    FractionalPageViewType.class,
    SeekToConditionPageViewType.class,
    CalendarViewType.class,
    ContactsViewType.class
})
public abstract class BasePagingType {

    @XmlAttribute(name = "MaxEntriesReturned")
    protected Integer maxEntriesReturned;

    /**
     * Ruft den Wert der maxEntriesReturned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxEntriesReturned() {
        return maxEntriesReturned;
    }

    /**
     * Legt den Wert der maxEntriesReturned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxEntriesReturned(Integer value) {
        this.maxEntriesReturned = value;
    }

}
