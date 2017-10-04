
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für CreateManagedFolderRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CreateManagedFolderRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FolderNames" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfFolderNamesType"/&gt;
 *         &lt;element name="Mailbox" type="{http://schemas.microsoft.com/exchange/services/2006/types}EmailAddressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateManagedFolderRequestType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "folderNames",
    "mailbox"
})
public class CreateManagedFolderRequestType
    extends BaseRequestType
{

    @XmlElement(name = "FolderNames", required = true)
    protected NonEmptyArrayOfFolderNamesType folderNames;
    @XmlElement(name = "Mailbox")
    protected EmailAddressType mailbox;

    /**
     * Ruft den Wert der folderNames-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfFolderNamesType }
     *     
     */
    public NonEmptyArrayOfFolderNamesType getFolderNames() {
        return folderNames;
    }

    /**
     * Legt den Wert der folderNames-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfFolderNamesType }
     *     
     */
    public void setFolderNames(NonEmptyArrayOfFolderNamesType value) {
        this.folderNames = value;
    }

    /**
     * Ruft den Wert der mailbox-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressType }
     *     
     */
    public EmailAddressType getMailbox() {
        return mailbox;
    }

    /**
     * Legt den Wert der mailbox-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressType }
     *     
     */
    public void setMailbox(EmailAddressType value) {
        this.mailbox = value;
    }

}
