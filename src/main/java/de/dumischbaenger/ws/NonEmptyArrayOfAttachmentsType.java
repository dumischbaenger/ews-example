
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für NonEmptyArrayOfAttachmentsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonEmptyArrayOfAttachmentsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="ItemAttachment" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemAttachmentType"/&gt;
 *         &lt;element name="FileAttachment" type="{http://schemas.microsoft.com/exchange/services/2006/types}FileAttachmentType"/&gt;
 *         &lt;element name="ReferenceAttachment" type="{http://schemas.microsoft.com/exchange/services/2006/types}ReferenceAttachmentType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEmptyArrayOfAttachmentsType", propOrder = {
    "itemAttachmentOrFileAttachmentOrReferenceAttachment"
})
public class NonEmptyArrayOfAttachmentsType {

    @XmlElements({
        @XmlElement(name = "ItemAttachment", type = ItemAttachmentType.class),
        @XmlElement(name = "FileAttachment", type = FileAttachmentType.class),
        @XmlElement(name = "ReferenceAttachment", type = ReferenceAttachmentType.class)
    })
    protected List<AttachmentType> itemAttachmentOrFileAttachmentOrReferenceAttachment;

    /**
     * Gets the value of the itemAttachmentOrFileAttachmentOrReferenceAttachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemAttachmentOrFileAttachmentOrReferenceAttachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemAttachmentOrFileAttachmentOrReferenceAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemAttachmentType }
     * {@link FileAttachmentType }
     * {@link ReferenceAttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getItemAttachmentOrFileAttachmentOrReferenceAttachment() {
        if (itemAttachmentOrFileAttachmentOrReferenceAttachment == null) {
            itemAttachmentOrFileAttachmentOrReferenceAttachment = new ArrayList<AttachmentType>();
        }
        return this.itemAttachmentOrFileAttachmentOrReferenceAttachment;
    }

}
