
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SearchFolderScopeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchFolderScopeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderIdType"/&gt;
 *         &lt;element name="WellKnownFolder" type="{http://schemas.microsoft.com/exchange/services/2006/types}DistinguishedFolderIdType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchFolderScopeType", propOrder = {
    "folderId",
    "wellKnownFolder"
})
public class SearchFolderScopeType {

    @XmlElement(name = "FolderId")
    protected FolderIdType folderId;
    @XmlElement(name = "WellKnownFolder")
    protected DistinguishedFolderIdType wellKnownFolder;

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
     * Ruft den Wert der wellKnownFolder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedFolderIdType }
     *     
     */
    public DistinguishedFolderIdType getWellKnownFolder() {
        return wellKnownFolder;
    }

    /**
     * Legt den Wert der wellKnownFolder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedFolderIdType }
     *     
     */
    public void setWellKnownFolder(DistinguishedFolderIdType value) {
        this.wellKnownFolder = value;
    }

}
