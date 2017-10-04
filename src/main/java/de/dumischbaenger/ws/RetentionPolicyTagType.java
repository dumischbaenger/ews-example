
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Retention policy tag.
 *       
 * 
 * <p>Java-Klasse für RetentionPolicyTagType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RetentionPolicyTagType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RetentionId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType"/&gt;
 *         &lt;element name="RetentionPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Type" type="{http://schemas.microsoft.com/exchange/services/2006/types}ElcFolderType"/&gt;
 *         &lt;element name="RetentionAction" type="{http://schemas.microsoft.com/exchange/services/2006/types}RetentionActionType"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsVisible" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OptedInto" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsArchive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetentionPolicyTagType", propOrder = {
    "displayName",
    "retentionId",
    "retentionPeriod",
    "type",
    "retentionAction",
    "description",
    "isVisible",
    "optedInto",
    "isArchive"
})
public class RetentionPolicyTagType {

    @XmlElement(name = "DisplayName", required = true)
    protected String displayName;
    @XmlElement(name = "RetentionId", required = true)
    protected String retentionId;
    @XmlElement(name = "RetentionPeriod")
    protected int retentionPeriod;
    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected ElcFolderType type;
    @XmlElement(name = "RetentionAction", required = true)
    @XmlSchemaType(name = "string")
    protected RetentionActionType retentionAction;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "IsVisible")
    protected boolean isVisible;
    @XmlElement(name = "OptedInto")
    protected boolean optedInto;
    @XmlElement(name = "IsArchive")
    protected boolean isArchive;

    /**
     * Ruft den Wert der displayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Ruft den Wert der retentionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetentionId() {
        return retentionId;
    }

    /**
     * Legt den Wert der retentionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetentionId(String value) {
        this.retentionId = value;
    }

    /**
     * Ruft den Wert der retentionPeriod-Eigenschaft ab.
     * 
     */
    public int getRetentionPeriod() {
        return retentionPeriod;
    }

    /**
     * Legt den Wert der retentionPeriod-Eigenschaft fest.
     * 
     */
    public void setRetentionPeriod(int value) {
        this.retentionPeriod = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ElcFolderType }
     *     
     */
    public ElcFolderType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ElcFolderType }
     *     
     */
    public void setType(ElcFolderType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der retentionAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RetentionActionType }
     *     
     */
    public RetentionActionType getRetentionAction() {
        return retentionAction;
    }

    /**
     * Legt den Wert der retentionAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RetentionActionType }
     *     
     */
    public void setRetentionAction(RetentionActionType value) {
        this.retentionAction = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der isVisible-Eigenschaft ab.
     * 
     */
    public boolean isIsVisible() {
        return isVisible;
    }

    /**
     * Legt den Wert der isVisible-Eigenschaft fest.
     * 
     */
    public void setIsVisible(boolean value) {
        this.isVisible = value;
    }

    /**
     * Ruft den Wert der optedInto-Eigenschaft ab.
     * 
     */
    public boolean isOptedInto() {
        return optedInto;
    }

    /**
     * Legt den Wert der optedInto-Eigenschaft fest.
     * 
     */
    public void setOptedInto(boolean value) {
        this.optedInto = value;
    }

    /**
     * Ruft den Wert der isArchive-Eigenschaft ab.
     * 
     */
    public boolean isIsArchive() {
        return isArchive;
    }

    /**
     * Legt den Wert der isArchive-Eigenschaft fest.
     * 
     */
    public void setIsArchive(boolean value) {
        this.isArchive = value;
    }

}
