
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UpdateFolderType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UpdateFolderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolderChanges" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfFolderChangesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateFolderType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "folderChanges"
})
public class UpdateFolderType
    extends BaseRequestType
{

    @XmlElement(name = "FolderChanges", required = true)
    protected NonEmptyArrayOfFolderChangesType folderChanges;

    /**
     * Ruft den Wert der folderChanges-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfFolderChangesType }
     *     
     */
    public NonEmptyArrayOfFolderChangesType getFolderChanges() {
        return folderChanges;
    }

    /**
     * Legt den Wert der folderChanges-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfFolderChangesType }
     *     
     */
    public void setFolderChanges(NonEmptyArrayOfFolderChangesType value) {
        this.folderChanges = value;
    }

}
