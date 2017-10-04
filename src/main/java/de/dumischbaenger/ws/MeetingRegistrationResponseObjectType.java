
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für MeetingRegistrationResponseObjectType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeetingRegistrationResponseObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}WellKnownResponseObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProposedStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ProposedEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRegistrationResponseObjectType", propOrder = {
    "proposedStart",
    "proposedEnd"
})
@XmlSeeAlso({
    AcceptItemType.class,
    TentativelyAcceptItemType.class,
    DeclineItemType.class
})
public class MeetingRegistrationResponseObjectType
    extends WellKnownResponseObjectType
{

    @XmlElement(name = "ProposedStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar proposedStart;
    @XmlElement(name = "ProposedEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar proposedEnd;

    /**
     * Ruft den Wert der proposedStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProposedStart() {
        return proposedStart;
    }

    /**
     * Legt den Wert der proposedStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProposedStart(XMLGregorianCalendar value) {
        this.proposedStart = value;
    }

    /**
     * Ruft den Wert der proposedEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProposedEnd() {
        return proposedEnd;
    }

    /**
     * Legt den Wert der proposedEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProposedEnd(XMLGregorianCalendar value) {
        this.proposedEnd = value;
    }

}
