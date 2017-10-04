
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FolderInfoResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FolderInfoResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Folders" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfFoldersType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderInfoResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "folders"
})
public class FolderInfoResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "Folders")
    protected ArrayOfFoldersType folders;

    /**
     * Ruft den Wert der folders-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFoldersType }
     *     
     */
    public ArrayOfFoldersType getFolders() {
        return folders;
    }

    /**
     * Legt den Wert der folders-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFoldersType }
     *     
     */
    public void setFolders(ArrayOfFoldersType value) {
        this.folders = value;
    }

}
