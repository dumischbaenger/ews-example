
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für GetPrivateCatalogAddInsResponseType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetPrivateCatalogAddInsResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddIns" type="{http://schemas.microsoft.com/exchange/services/2006/messages}ArrayOfPrivateCatalogAddInsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPrivateCatalogAddInsResponseType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "addIns"
})
public class GetPrivateCatalogAddInsResponseType
    extends ResponseMessageType
{

    @XmlElement(name = "AddIns")
    protected ArrayOfPrivateCatalogAddInsType addIns;

    /**
     * Ruft den Wert der addIns-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPrivateCatalogAddInsType }
     *     
     */
    public ArrayOfPrivateCatalogAddInsType getAddIns() {
        return addIns;
    }

    /**
     * Legt den Wert der addIns-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPrivateCatalogAddInsType }
     *     
     */
    public void setAddIns(ArrayOfPrivateCatalogAddInsType value) {
        this.addIns = value;
    }

}
