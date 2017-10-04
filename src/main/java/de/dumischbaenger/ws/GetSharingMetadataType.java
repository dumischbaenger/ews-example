
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetSharingMetadataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetSharingMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdOfFolderToShare" type="{http://schemas.microsoft.com/exchange/services/2006/types}FolderIdType"/&gt;
 *         &lt;element name="SenderSmtpAddress" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyStringType"/&gt;
 *         &lt;element name="Recipients" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfSmtpAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSharingMetadataType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "idOfFolderToShare",
    "senderSmtpAddress",
    "recipients"
})
public class GetSharingMetadataType
    extends BaseRequestType
{

    @XmlElement(name = "IdOfFolderToShare", required = true)
    protected FolderIdType idOfFolderToShare;
    @XmlElement(name = "SenderSmtpAddress", required = true)
    protected String senderSmtpAddress;
    @XmlElement(name = "Recipients", required = true)
    protected ArrayOfSmtpAddressType recipients;

    /**
     * Ruft den Wert der idOfFolderToShare-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FolderIdType }
     *     
     */
    public FolderIdType getIdOfFolderToShare() {
        return idOfFolderToShare;
    }

    /**
     * Legt den Wert der idOfFolderToShare-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FolderIdType }
     *     
     */
    public void setIdOfFolderToShare(FolderIdType value) {
        this.idOfFolderToShare = value;
    }

    /**
     * Ruft den Wert der senderSmtpAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderSmtpAddress() {
        return senderSmtpAddress;
    }

    /**
     * Legt den Wert der senderSmtpAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderSmtpAddress(String value) {
        this.senderSmtpAddress = value;
    }

    /**
     * Ruft den Wert der recipients-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public ArrayOfSmtpAddressType getRecipients() {
        return recipients;
    }

    /**
     * Legt den Wert der recipients-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSmtpAddressType }
     *     
     */
    public void setRecipients(ArrayOfSmtpAddressType value) {
        this.recipients = value;
    }

}
