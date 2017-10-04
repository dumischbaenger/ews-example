
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für SetImListMigrationCompletedType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SetImListMigrationCompletedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImListMigrationCompleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetImListMigrationCompletedType", namespace = "http://schemas.microsoft.com/exchange/services/2006/messages", propOrder = {
    "imListMigrationCompleted"
})
public class SetImListMigrationCompletedType
    extends BaseRequestType
{

    @XmlElement(name = "ImListMigrationCompleted")
    protected boolean imListMigrationCompleted;

    /**
     * Ruft den Wert der imListMigrationCompleted-Eigenschaft ab.
     * 
     */
    public boolean isImListMigrationCompleted() {
        return imListMigrationCompleted;
    }

    /**
     * Legt den Wert der imListMigrationCompleted-Eigenschaft fest.
     * 
     */
    public void setImListMigrationCompleted(boolean value) {
        this.imListMigrationCompleted = value;
    }

}
