
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetSharingFolderResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetSharingFolderResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="SharingFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderIdType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSharingFolderResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "sharingFolderId"
})
public class GetSharingFolderResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "SharingFolderId")
    protected FolderIdType sharingFolderId;

    /**
     * Ruft den Wert der sharingFolderId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FolderIdType }
     *     
     */
    public FolderIdType getSharingFolderId() {
        return sharingFolderId;
    }

    /**
     * Legt den Wert der sharingFolderId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderIdType }
     *     
     */
    public void setSharingFolderId(FolderIdType value) {
        this.sharingFolderId = value;
    }

}
