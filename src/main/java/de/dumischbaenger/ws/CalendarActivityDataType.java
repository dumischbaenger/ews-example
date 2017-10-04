
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CalendarActivityDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CalendarActivityDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivityAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ClientId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CasRequestId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/&gt;
 *         &lt;element name="IndexSelected" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarActivityDataType", propOrder = {
    "activityAction",
    "clientId",
    "casRequestId",
    "indexSelected"
})
public class CalendarActivityDataType {

    @XmlElement(name = "ActivityAction", required = true)
    protected String activityAction;
    @XmlElement(name = "ClientId", required = true)
    protected String clientId;
    @XmlElement(name = "CasRequestId", required = true)
    protected String casRequestId;
    @XmlElement(name = "IndexSelected")
    protected int indexSelected;

    /**
     * Ruft den Wert der activityAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityAction() {
        return activityAction;
    }

    /**
     * Legt den Wert der activityAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityAction(String value) {
        this.activityAction = value;
    }

    /**
     * Ruft den Wert der clientId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Legt den Wert der clientId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Ruft den Wert der casRequestId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasRequestId() {
        return casRequestId;
    }

    /**
     * Legt den Wert der casRequestId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasRequestId(String value) {
        this.casRequestId = value;
    }

    /**
     * Ruft den Wert der indexSelected-Eigenschaft ab.
     * 
     */
    public int getIndexSelected() {
        return indexSelected;
    }

    /**
     * Legt den Wert der indexSelected-Eigenschaft fest.
     * 
     */
    public void setIndexSelected(int value) {
        this.indexSelected = value;
    }

}
