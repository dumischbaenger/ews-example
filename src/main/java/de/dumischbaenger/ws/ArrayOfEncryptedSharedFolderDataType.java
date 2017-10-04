
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArrayOfEncryptedSharedFolderDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEncryptedSharedFolderDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="EncryptedSharedFolderData" type="{http://schemas.microsoft.com/exchange/services/2006/types}EncryptedSharedFolderDataType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEncryptedSharedFolderDataType", propOrder = {
    "encryptedSharedFolderData"
})
public class ArrayOfEncryptedSharedFolderDataType {

    @XmlElement(name = "EncryptedSharedFolderData")
    protected List<EncryptedSharedFolderDataType> encryptedSharedFolderData;

    /**
     * Gets the value of the encryptedSharedFolderData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the encryptedSharedFolderData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEncryptedSharedFolderData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptedSharedFolderDataType }
     * 
     * 
     */
    public List<EncryptedSharedFolderDataType> getEncryptedSharedFolderData() {
        if (encryptedSharedFolderData == null) {
            encryptedSharedFolderData = new ArrayList<EncryptedSharedFolderDataType>();
        }
        return this.encryptedSharedFolderData;
    }

}
