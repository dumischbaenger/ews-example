
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für ApprovalRequestDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApprovalRequestDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsUndecidedApprovalRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalDecision" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalDecisionMaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalDecisionTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalRequestDataType", propOrder = {
    "isUndecidedApprovalRequest",
    "approvalDecision",
    "approvalDecisionMaker",
    "approvalDecisionTime"
})
public class ApprovalRequestDataType {

    @XmlElement(name = "IsUndecidedApprovalRequest")
    protected Boolean isUndecidedApprovalRequest;
    @XmlElement(name = "ApprovalDecision")
    protected Integer approvalDecision;
    @XmlElement(name = "ApprovalDecisionMaker")
    protected String approvalDecisionMaker;
    @XmlElement(name = "ApprovalDecisionTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvalDecisionTime;

    /**
     * Ruft den Wert der isUndecidedApprovalRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUndecidedApprovalRequest() {
        return isUndecidedApprovalRequest;
    }

    /**
     * Legt den Wert der isUndecidedApprovalRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUndecidedApprovalRequest(Boolean value) {
        this.isUndecidedApprovalRequest = value;
    }

    /**
     * Ruft den Wert der approvalDecision-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApprovalDecision() {
        return approvalDecision;
    }

    /**
     * Legt den Wert der approvalDecision-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApprovalDecision(Integer value) {
        this.approvalDecision = value;
    }

    /**
     * Ruft den Wert der approvalDecisionMaker-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalDecisionMaker() {
        return approvalDecisionMaker;
    }

    /**
     * Legt den Wert der approvalDecisionMaker-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalDecisionMaker(String value) {
        this.approvalDecisionMaker = value;
    }

    /**
     * Ruft den Wert der approvalDecisionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovalDecisionTime() {
        return approvalDecisionTime;
    }

    /**
     * Legt den Wert der approvalDecisionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovalDecisionTime(XMLGregorianCalendar value) {
        this.approvalDecisionTime = value;
    }

}
