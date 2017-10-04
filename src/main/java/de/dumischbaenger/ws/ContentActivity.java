
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ContentActivity complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContentActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/&gt;
 *         &lt;element name="SharedBy" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContentLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContentActivityType"/&gt;
 *         &lt;element name="MediaType" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContentActivityMediaType"/&gt;
 *         &lt;element name="Acl" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContentActivityAcl"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentActivity", propOrder = {
    "id",
    "sharedBy",
    "contentLocation",
    "startTime",
    "endTime",
    "type",
    "mediaType",
    "acl"
})
public class ContentActivity {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SharedBy", required = true)
    protected String sharedBy;
    @XmlElement(name = "ContentLocation", required = true)
    protected String contentLocation;
    @XmlElement(name = "StartTime", required = true)
    protected String startTime;
    @XmlElement(name = "EndTime", required = true)
    protected String endTime;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected ContentActivityType type;
    @XmlElement(name = "MediaType", required = true)
    @XmlSchemaType(name = "string")
    protected ContentActivityMediaType mediaType;
    @XmlElement(name = "Acl", required = true)
    @XmlSchemaType(name = "string")
    protected ContentActivityAcl acl;

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der sharedBy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharedBy() {
        return sharedBy;
    }

    /**
     * Legt den Wert der sharedBy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharedBy(String value) {
        this.sharedBy = value;
    }

    /**
     * Ruft den Wert der contentLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /**
     * Legt den Wert der contentLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentLocation(String value) {
        this.contentLocation = value;
    }

    /**
     * Ruft den Wert der startTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Legt den Wert der startTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Ruft den Wert der endTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Legt den Wert der endTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContentActivityType }
     *     
     */
    public ContentActivityType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentActivityType }
     *     
     */
    public void setType(ContentActivityType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der mediaType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContentActivityMediaType }
     *     
     */
    public ContentActivityMediaType getMediaType() {
        return mediaType;
    }

    /**
     * Legt den Wert der mediaType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentActivityMediaType }
     *     
     */
    public void setMediaType(ContentActivityMediaType value) {
        this.mediaType = value;
    }

    /**
     * Ruft den Wert der acl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContentActivityAcl }
     *     
     */
    public ContentActivityAcl getAcl() {
        return acl;
    }

    /**
     * Legt den Wert der acl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentActivityAcl }
     *     
     */
    public void setAcl(ContentActivityAcl value) {
        this.acl = value;
    }

}
