
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetSharingMetadataResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetSharingMetadataResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="EncryptedSharedFolderDataCollection" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfEncryptedSharedFolderDataType"/&gt;
 *         &lt;element name="InvalidRecipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfInvalidRecipientsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSharingMetadataResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "encryptedSharedFolderDataCollection",
    "invalidRecipients"
})
public class GetSharingMetadataResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "EncryptedSharedFolderDataCollection")
    protected ArrayOfEncryptedSharedFolderDataType encryptedSharedFolderDataCollection;
    @XmlElement(name = "InvalidRecipients")
    protected ArrayOfInvalidRecipientsType invalidRecipients;

    /**
     * Ruft den Wert der encryptedSharedFolderDataCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEncryptedSharedFolderDataType }
     *     
     */
    public ArrayOfEncryptedSharedFolderDataType getEncryptedSharedFolderDataCollection() {
        return encryptedSharedFolderDataCollection;
    }

    /**
     * Legt den Wert der encryptedSharedFolderDataCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEncryptedSharedFolderDataType }
     *     
     */
    public void setEncryptedSharedFolderDataCollection(ArrayOfEncryptedSharedFolderDataType value) {
        this.encryptedSharedFolderDataCollection = value;
    }

    /**
     * Ruft den Wert der invalidRecipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInvalidRecipientsType }
     *     
     */
    public ArrayOfInvalidRecipientsType getInvalidRecipients() {
        return invalidRecipients;
    }

    /**
     * Legt den Wert der invalidRecipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInvalidRecipientsType }
     *     
     */
    public void setInvalidRecipients(ArrayOfInvalidRecipientsType value) {
        this.invalidRecipients = value;
    }

}
