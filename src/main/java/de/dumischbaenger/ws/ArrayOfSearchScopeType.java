
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArrayOfSearchScopeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSearchScopeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryMailboxSearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}PrimaryMailboxSearchScopeType" minOccurs="0"/&gt;
 *         &lt;element name="LargeArchiveSearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}LargeArchiveSearchScopeType" minOccurs="0"/&gt;
 *         &lt;element name="GroupSearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}GroupSearchScopeType" minOccurs="0"/&gt;
 *         &lt;element name="CustomSearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}CustomSearchScopeType" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="OneDriveSearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}OneDriveSearchScopeType" minOccurs="0"/&gt;
 *         &lt;element name="SingleLargeArchiveSearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}SingleLargeArchiveSearchScopeType" minOccurs="0"/&gt;
 *         &lt;element name="DelveSearchScope" type="{http://schemas.microsoft.com/exchange/services/2006/types}DelveSearchScopeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSearchScopeType", propOrder = {
    "primaryMailboxSearchScope",
    "largeArchiveSearchScope",
    "groupSearchScope",
    "customSearchScope",
    "oneDriveSearchScope",
    "singleLargeArchiveSearchScope",
    "delveSearchScope"
})
public class ArrayOfSearchScopeType {

    @XmlElement(name = "PrimaryMailboxSearchScope")
    protected PrimaryMailboxSearchScopeType primaryMailboxSearchScope;
    @XmlElement(name = "LargeArchiveSearchScope")
    protected LargeArchiveSearchScopeType largeArchiveSearchScope;
    @XmlElement(name = "GroupSearchScope")
    protected GroupSearchScopeType groupSearchScope;
    @XmlElement(name = "CustomSearchScope")
    protected List<CustomSearchScopeType> customSearchScope;
    @XmlElement(name = "OneDriveSearchScope")
    protected OneDriveSearchScopeType oneDriveSearchScope;
    @XmlElement(name = "SingleLargeArchiveSearchScope")
    protected SingleLargeArchiveSearchScopeType singleLargeArchiveSearchScope;
    @XmlElement(name = "DelveSearchScope")
    protected DelveSearchScopeType delveSearchScope;

    /**
     * Ruft den Wert der primaryMailboxSearchScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryMailboxSearchScopeType }
     *     
     */
    public PrimaryMailboxSearchScopeType getPrimaryMailboxSearchScope() {
        return primaryMailboxSearchScope;
    }

    /**
     * Legt den Wert der primaryMailboxSearchScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryMailboxSearchScopeType }
     *     
     */
    public void setPrimaryMailboxSearchScope(PrimaryMailboxSearchScopeType value) {
        this.primaryMailboxSearchScope = value;
    }

    /**
     * Ruft den Wert der largeArchiveSearchScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LargeArchiveSearchScopeType }
     *     
     */
    public LargeArchiveSearchScopeType getLargeArchiveSearchScope() {
        return largeArchiveSearchScope;
    }

    /**
     * Legt den Wert der largeArchiveSearchScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LargeArchiveSearchScopeType }
     *     
     */
    public void setLargeArchiveSearchScope(LargeArchiveSearchScopeType value) {
        this.largeArchiveSearchScope = value;
    }

    /**
     * Ruft den Wert der groupSearchScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupSearchScopeType }
     *     
     */
    public GroupSearchScopeType getGroupSearchScope() {
        return groupSearchScope;
    }

    /**
     * Legt den Wert der groupSearchScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupSearchScopeType }
     *     
     */
    public void setGroupSearchScope(GroupSearchScopeType value) {
        this.groupSearchScope = value;
    }

    /**
     * Gets the value of the customSearchScope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSearchScope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSearchScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSearchScopeType }
     * 
     * 
     */
    public List<CustomSearchScopeType> getCustomSearchScope() {
        if (customSearchScope == null) {
            customSearchScope = new ArrayList<CustomSearchScopeType>();
        }
        return this.customSearchScope;
    }

    /**
     * Ruft den Wert der oneDriveSearchScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OneDriveSearchScopeType }
     *     
     */
    public OneDriveSearchScopeType getOneDriveSearchScope() {
        return oneDriveSearchScope;
    }

    /**
     * Legt den Wert der oneDriveSearchScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OneDriveSearchScopeType }
     *     
     */
    public void setOneDriveSearchScope(OneDriveSearchScopeType value) {
        this.oneDriveSearchScope = value;
    }

    /**
     * Ruft den Wert der singleLargeArchiveSearchScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SingleLargeArchiveSearchScopeType }
     *     
     */
    public SingleLargeArchiveSearchScopeType getSingleLargeArchiveSearchScope() {
        return singleLargeArchiveSearchScope;
    }

    /**
     * Legt den Wert der singleLargeArchiveSearchScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleLargeArchiveSearchScopeType }
     *     
     */
    public void setSingleLargeArchiveSearchScope(SingleLargeArchiveSearchScopeType value) {
        this.singleLargeArchiveSearchScope = value;
    }

    /**
     * Ruft den Wert der delveSearchScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DelveSearchScopeType }
     *     
     */
    public DelveSearchScopeType getDelveSearchScope() {
        return delveSearchScope;
    }

    /**
     * Legt den Wert der delveSearchScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DelveSearchScopeType }
     *     
     */
    public void setDelveSearchScope(DelveSearchScopeType value) {
        this.delveSearchScope = value;
    }

}
