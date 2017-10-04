
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PathToExceptionFieldType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PathToExceptionFieldType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BasePathToElementType"&gt;
 *       &lt;attribute name="FieldURI" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}ExceptionPropertyURIType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathToExceptionFieldType")
public class PathToExceptionFieldType
    extends BasePathToElementType
{

    @XmlAttribute(name = "FieldURI", required = true)
    protected ExceptionPropertyURIType fieldURI;

    /**
     * Ruft den Wert der fieldURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionPropertyURIType }
     *     
     */
    public ExceptionPropertyURIType getFieldURI() {
        return fieldURI;
    }

    /**
     * Legt den Wert der fieldURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionPropertyURIType }
     *     
     */
    public void setFieldURI(ExceptionPropertyURIType value) {
        this.fieldURI = value;
    }

}
