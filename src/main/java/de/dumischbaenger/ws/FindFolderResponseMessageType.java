
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für FindFolderResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FindFolderResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RootFolder" type="{http://schemas.microsoft.com/exchange/services/2006/types}FindFolderParentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindFolderResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "rootFolder"
})
public class FindFolderResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "RootFolder")
    protected FindFolderParentType rootFolder;

    /**
     * Ruft den Wert der rootFolder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FindFolderParentType }
     *     
     */
    public FindFolderParentType getRootFolder() {
        return rootFolder;
    }

    /**
     * Legt den Wert der rootFolder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FindFolderParentType }
     *     
     */
    public void setRootFolder(FindFolderParentType value) {
        this.rootFolder = value;
    }

}
