
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Response message type for the GetUserRetentionPolicyTags web method.
 *       
 * 
 * <p>Java-Klasse für GetUserRetentionPolicyTagsResponseMessageType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GetUserRetentionPolicyTagsResponseMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}ResponseMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RetentionPolicyTags" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRetentionPolicyTagsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserRetentionPolicyTagsResponseMessageType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "retentionPolicyTags"
})
public class GetUserRetentionPolicyTagsResponseMessageType
    extends ResponseMessageType
{

    @XmlElement(name = "RetentionPolicyTags", required = true)
    protected ArrayOfRetentionPolicyTagsType retentionPolicyTags;

    /**
     * Ruft den Wert der retentionPolicyTags-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRetentionPolicyTagsType }
     *     
     */
    public ArrayOfRetentionPolicyTagsType getRetentionPolicyTags() {
        return retentionPolicyTags;
    }

    /**
     * Legt den Wert der retentionPolicyTags-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRetentionPolicyTagsType }
     *     
     */
    public void setRetentionPolicyTags(ArrayOfRetentionPolicyTagsType value) {
        this.retentionPolicyTags = value;
    }

}
