
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SyncFolderHierarchyResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SyncFolderHierarchyResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SyncState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncludesLastFolderInRange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Changes" type="{http://schemas.microsoft.com/exchange/services/2006/types}SyncFolderHierarchyChangesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncFolderHierarchyResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "syncState",
    "includesLastFolderInRange",
    "changes"
})
public class SyncFolderHierarchyResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "SyncState")
    protected String syncState;
    @XmlElement(name = "IncludesLastFolderInRange")
    protected Boolean includesLastFolderInRange;
    @XmlElement(name = "Changes")
    protected SyncFolderHierarchyChangesType changes;

    /**
     * Ruft den Wert der syncState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncState() {
        return syncState;
    }

    /**
     * Legt den Wert der syncState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncState(String value) {
        this.syncState = value;
    }

    /**
     * Ruft den Wert der includesLastFolderInRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludesLastFolderInRange() {
        return includesLastFolderInRange;
    }

    /**
     * Legt den Wert der includesLastFolderInRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludesLastFolderInRange(Boolean value) {
        this.includesLastFolderInRange = value;
    }

    /**
     * Ruft den Wert der changes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SyncFolderHierarchyChangesType }
     *     
     */
    public SyncFolderHierarchyChangesType getChanges() {
        return changes;
    }

    /**
     * Legt den Wert der changes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncFolderHierarchyChangesType }
     *     
     */
    public void setChanges(SyncFolderHierarchyChangesType value) {
        this.changes = value;
    }

}
