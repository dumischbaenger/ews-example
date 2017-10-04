
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FolderChangeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FolderChangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="FolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderIdType"/&gt;
 *           &lt;element name="DistinguishedFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}DistinguishedFolderIdType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Updates" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfFolderChangeDescriptionsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderChangeType", propOrder = {
    "folderId",
    "distinguishedFolderId",
    "updates"
})
public class FolderChangeType {

    @XmlElement(name = "FolderId")
    protected FolderIdType folderId;
    @XmlElement(name = "DistinguishedFolderId")
    protected DistinguishedFolderIdType distinguishedFolderId;
    @XmlElement(name = "Updates", required = true)
    protected NonEmptyArrayOfFolderChangeDescriptionsType updates;

    /**
     * Ruft den Wert der folderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FolderIdType }
     *     
     */
    public FolderIdType getFolderId() {
        return folderId;
    }

    /**
     * Legt den Wert der folderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderIdType }
     *     
     */
    public void setFolderId(FolderIdType value) {
        this.folderId = value;
    }

    /**
     * Ruft den Wert der distinguishedFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedFolderIdType }
     *     
     */
    public DistinguishedFolderIdType getDistinguishedFolderId() {
        return distinguishedFolderId;
    }

    /**
     * Legt den Wert der distinguishedFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedFolderIdType }
     *     
     */
    public void setDistinguishedFolderId(DistinguishedFolderIdType value) {
        this.distinguishedFolderId = value;
    }

    /**
     * Ruft den Wert der updates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfFolderChangeDescriptionsType }
     *     
     */
    public NonEmptyArrayOfFolderChangeDescriptionsType getUpdates() {
        return updates;
    }

    /**
     * Legt den Wert der updates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfFolderChangeDescriptionsType }
     *     
     */
    public void setUpdates(NonEmptyArrayOfFolderChangeDescriptionsType value) {
        this.updates = value;
    }

}
