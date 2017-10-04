
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für MeetingInstanceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetingInstanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChangeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JoinUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateTimeCreated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateTimeModified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Meadata" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentGoid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParticipantActivities" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfParticipantActivities" minOccurs="0"/&gt;
 *         &lt;element name="ContentActivities" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfContentActivities" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingInstanceType", propOrder = {
    "id",
    "changeKey",
    "version",
    "joinUrl",
    "dateTimeCreated",
    "dateTimeModified",
    "meadata",
    "tag",
    "parentGoid",
    "participantActivities",
    "contentActivities"
})
public class MeetingInstanceType {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ChangeKey")
    protected String changeKey;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "JoinUrl")
    protected String joinUrl;
    @XmlElement(name = "DateTimeCreated")
    protected String dateTimeCreated;
    @XmlElement(name = "DateTimeModified")
    protected String dateTimeModified;
    @XmlElement(name = "Meadata")
    protected String meadata;
    @XmlElement(name = "Tag")
    protected String tag;
    @XmlElement(name = "ParentGoid")
    protected String parentGoid;
    @XmlElement(name = "ParticipantActivities")
    protected NonEmptyArrayOfParticipantActivities participantActivities;
    @XmlElement(name = "ContentActivities")
    protected NonEmptyArrayOfContentActivities contentActivities;

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
     * Ruft den Wert der changeKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeKey() {
        return changeKey;
    }

    /**
     * Legt den Wert der changeKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeKey(String value) {
        this.changeKey = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der joinUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinUrl() {
        return joinUrl;
    }

    /**
     * Legt den Wert der joinUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinUrl(String value) {
        this.joinUrl = value;
    }

    /**
     * Ruft den Wert der dateTimeCreated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeCreated() {
        return dateTimeCreated;
    }

    /**
     * Legt den Wert der dateTimeCreated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeCreated(String value) {
        this.dateTimeCreated = value;
    }

    /**
     * Ruft den Wert der dateTimeModified-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeModified() {
        return dateTimeModified;
    }

    /**
     * Legt den Wert der dateTimeModified-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeModified(String value) {
        this.dateTimeModified = value;
    }

    /**
     * Ruft den Wert der meadata-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeadata() {
        return meadata;
    }

    /**
     * Legt den Wert der meadata-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeadata(String value) {
        this.meadata = value;
    }

    /**
     * Ruft den Wert der tag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Legt den Wert der tag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Ruft den Wert der parentGoid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGoid() {
        return parentGoid;
    }

    /**
     * Legt den Wert der parentGoid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGoid(String value) {
        this.parentGoid = value;
    }

    /**
     * Ruft den Wert der participantActivities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfParticipantActivities }
     *     
     */
    public NonEmptyArrayOfParticipantActivities getParticipantActivities() {
        return participantActivities;
    }

    /**
     * Legt den Wert der participantActivities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfParticipantActivities }
     *     
     */
    public void setParticipantActivities(NonEmptyArrayOfParticipantActivities value) {
        this.participantActivities = value;
    }

    /**
     * Ruft den Wert der contentActivities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfContentActivities }
     *     
     */
    public NonEmptyArrayOfContentActivities getContentActivities() {
        return contentActivities;
    }

    /**
     * Legt den Wert der contentActivities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfContentActivities }
     *     
     */
    public void setContentActivities(NonEmptyArrayOfContentActivities value) {
        this.contentActivities = value;
    }

}
