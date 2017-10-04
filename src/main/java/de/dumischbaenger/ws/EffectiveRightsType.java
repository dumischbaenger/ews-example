
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für EffectiveRightsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EffectiveRightsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreateAssociated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CreateContents" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="CreateHierarchy" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Modify" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Read" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ViewPrivateItems" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectiveRightsType", propOrder = {
    "createAssociated",
    "createContents",
    "createHierarchy",
    "delete",
    "modify",
    "read",
    "viewPrivateItems"
})
public class EffectiveRightsType {

    @XmlElement(name = "CreateAssociated")
    protected boolean createAssociated;
    @XmlElement(name = "CreateContents")
    protected boolean createContents;
    @XmlElement(name = "CreateHierarchy")
    protected boolean createHierarchy;
    @XmlElement(name = "Delete")
    protected boolean delete;
    @XmlElement(name = "Modify")
    protected boolean modify;
    @XmlElement(name = "Read")
    protected boolean read;
    @XmlElement(name = "ViewPrivateItems")
    protected Boolean viewPrivateItems;

    /**
     * Ruft den Wert der createAssociated-Eigenschaft ab.
     * 
     */
    public boolean isCreateAssociated() {
        return createAssociated;
    }

    /**
     * Legt den Wert der createAssociated-Eigenschaft fest.
     * 
     */
    public void setCreateAssociated(boolean value) {
        this.createAssociated = value;
    }

    /**
     * Ruft den Wert der createContents-Eigenschaft ab.
     * 
     */
    public boolean isCreateContents() {
        return createContents;
    }

    /**
     * Legt den Wert der createContents-Eigenschaft fest.
     * 
     */
    public void setCreateContents(boolean value) {
        this.createContents = value;
    }

    /**
     * Ruft den Wert der createHierarchy-Eigenschaft ab.
     * 
     */
    public boolean isCreateHierarchy() {
        return createHierarchy;
    }

    /**
     * Legt den Wert der createHierarchy-Eigenschaft fest.
     * 
     */
    public void setCreateHierarchy(boolean value) {
        this.createHierarchy = value;
    }

    /**
     * Ruft den Wert der delete-Eigenschaft ab.
     * 
     */
    public boolean isDelete() {
        return delete;
    }

    /**
     * Legt den Wert der delete-Eigenschaft fest.
     * 
     */
    public void setDelete(boolean value) {
        this.delete = value;
    }

    /**
     * Ruft den Wert der modify-Eigenschaft ab.
     * 
     */
    public boolean isModify() {
        return modify;
    }

    /**
     * Legt den Wert der modify-Eigenschaft fest.
     * 
     */
    public void setModify(boolean value) {
        this.modify = value;
    }

    /**
     * Ruft den Wert der read-Eigenschaft ab.
     * 
     */
    public boolean isRead() {
        return read;
    }

    /**
     * Legt den Wert der read-Eigenschaft fest.
     * 
     */
    public void setRead(boolean value) {
        this.read = value;
    }

    /**
     * Ruft den Wert der viewPrivateItems-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isViewPrivateItems() {
        return viewPrivateItems;
    }

    /**
     * Legt den Wert der viewPrivateItems-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewPrivateItems(Boolean value) {
        this.viewPrivateItems = value;
    }

}
