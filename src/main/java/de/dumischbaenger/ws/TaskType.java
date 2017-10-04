
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für TaskType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TaskType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}ItemType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualWork" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AssignedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="BillingInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChangeCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Companies" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="CompleteDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Contacts" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfStringsType" minOccurs="0"/&gt;
 *         &lt;element name="DelegationState" type="{http://schemas.microsoft.com/exchange/services/2006/types}TaskDelegateStateType" minOccurs="0"/&gt;
 *         &lt;element name="Delegator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsAssignmentEditable" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsRecurring" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsTeamTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Mileage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PercentComplete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Recurrence" type="{http://schemas.microsoft.com/exchange/services/2006/types}TaskRecurrenceType" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://schemas.microsoft.com/exchange/services/2006/types}TaskStatusType" minOccurs="0"/&gt;
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalWork" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskType", propOrder = {
    "actualWork",
    "assignedTime",
    "billingInformation",
    "changeCount",
    "companies",
    "completeDate",
    "contacts",
    "delegationState",
    "delegator",
    "dueDate",
    "isAssignmentEditable",
    "isComplete",
    "isRecurring",
    "isTeamTask",
    "mileage",
    "owner",
    "percentComplete",
    "recurrence",
    "startDate",
    "status",
    "statusDescription",
    "totalWork"
})
public class TaskType
    extends ItemType
{

    @XmlElement(name = "ActualWork")
    protected Integer actualWork;
    @XmlElement(name = "AssignedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignedTime;
    @XmlElement(name = "BillingInformation")
    protected String billingInformation;
    @XmlElement(name = "ChangeCount")
    protected Integer changeCount;
    @XmlElement(name = "Companies")
    protected ArrayOfStringsType companies;
    @XmlElement(name = "CompleteDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completeDate;
    @XmlElement(name = "Contacts")
    protected ArrayOfStringsType contacts;
    @XmlElement(name = "DelegationState")
    @XmlSchemaType(name = "string")
    protected TaskDelegateStateType delegationState;
    @XmlElement(name = "Delegator")
    protected String delegator;
    @XmlElement(name = "DueDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dueDate;
    @XmlElement(name = "IsAssignmentEditable")
    protected Integer isAssignmentEditable;
    @XmlElement(name = "IsComplete")
    protected Boolean isComplete;
    @XmlElement(name = "IsRecurring")
    protected Boolean isRecurring;
    @XmlElement(name = "IsTeamTask")
    protected Boolean isTeamTask;
    @XmlElement(name = "Mileage")
    protected String mileage;
    @XmlElement(name = "Owner")
    protected String owner;
    @XmlElement(name = "PercentComplete")
    protected Double percentComplete;
    @XmlElement(name = "Recurrence")
    protected TaskRecurrenceType recurrence;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected TaskStatusType status;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "TotalWork")
    protected Integer totalWork;

    /**
     * Ruft den Wert der actualWork-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActualWork() {
        return actualWork;
    }

    /**
     * Legt den Wert der actualWork-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActualWork(Integer value) {
        this.actualWork = value;
    }

    /**
     * Ruft den Wert der assignedTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignedTime() {
        return assignedTime;
    }

    /**
     * Legt den Wert der assignedTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignedTime(XMLGregorianCalendar value) {
        this.assignedTime = value;
    }

    /**
     * Ruft den Wert der billingInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingInformation() {
        return billingInformation;
    }

    /**
     * Legt den Wert der billingInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingInformation(String value) {
        this.billingInformation = value;
    }

    /**
     * Ruft den Wert der changeCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChangeCount() {
        return changeCount;
    }

    /**
     * Legt den Wert der changeCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChangeCount(Integer value) {
        this.changeCount = value;
    }

    /**
     * Ruft den Wert der companies-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getCompanies() {
        return companies;
    }

    /**
     * Legt den Wert der companies-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setCompanies(ArrayOfStringsType value) {
        this.companies = value;
    }

    /**
     * Ruft den Wert der completeDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompleteDate() {
        return completeDate;
    }

    /**
     * Legt den Wert der completeDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompleteDate(XMLGregorianCalendar value) {
        this.completeDate = value;
    }

    /**
     * Ruft den Wert der contacts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public ArrayOfStringsType getContacts() {
        return contacts;
    }

    /**
     * Legt den Wert der contacts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfStringsType }
     *     
     */
    public void setContacts(ArrayOfStringsType value) {
        this.contacts = value;
    }

    /**
     * Ruft den Wert der delegationState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaskDelegateStateType }
     *     
     */
    public TaskDelegateStateType getDelegationState() {
        return delegationState;
    }

    /**
     * Legt den Wert der delegationState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskDelegateStateType }
     *     
     */
    public void setDelegationState(TaskDelegateStateType value) {
        this.delegationState = value;
    }

    /**
     * Ruft den Wert der delegator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegator() {
        return delegator;
    }

    /**
     * Legt den Wert der delegator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegator(String value) {
        this.delegator = value;
    }

    /**
     * Ruft den Wert der dueDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDate() {
        return dueDate;
    }

    /**
     * Legt den Wert der dueDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDate(XMLGregorianCalendar value) {
        this.dueDate = value;
    }

    /**
     * Ruft den Wert der isAssignmentEditable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIsAssignmentEditable() {
        return isAssignmentEditable;
    }

    /**
     * Legt den Wert der isAssignmentEditable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIsAssignmentEditable(Integer value) {
        this.isAssignmentEditable = value;
    }

    /**
     * Ruft den Wert der isComplete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsComplete() {
        return isComplete;
    }

    /**
     * Legt den Wert der isComplete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsComplete(Boolean value) {
        this.isComplete = value;
    }

    /**
     * Ruft den Wert der isRecurring-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRecurring() {
        return isRecurring;
    }

    /**
     * Legt den Wert der isRecurring-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRecurring(Boolean value) {
        this.isRecurring = value;
    }

    /**
     * Ruft den Wert der isTeamTask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTeamTask() {
        return isTeamTask;
    }

    /**
     * Legt den Wert der isTeamTask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTeamTask(Boolean value) {
        this.isTeamTask = value;
    }

    /**
     * Ruft den Wert der mileage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileage() {
        return mileage;
    }

    /**
     * Legt den Wert der mileage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileage(String value) {
        this.mileage = value;
    }

    /**
     * Ruft den Wert der owner-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Legt den Wert der owner-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Ruft den Wert der percentComplete-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentComplete() {
        return percentComplete;
    }

    /**
     * Legt den Wert der percentComplete-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentComplete(Double value) {
        this.percentComplete = value;
    }

    /**
     * Ruft den Wert der recurrence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaskRecurrenceType }
     *     
     */
    public TaskRecurrenceType getRecurrence() {
        return recurrence;
    }

    /**
     * Legt den Wert der recurrence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskRecurrenceType }
     *     
     */
    public void setRecurrence(TaskRecurrenceType value) {
        this.recurrence = value;
    }

    /**
     * Ruft den Wert der startDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Legt den Wert der startDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TaskStatusType }
     *     
     */
    public TaskStatusType getStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskStatusType }
     *     
     */
    public void setStatus(TaskStatusType value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der statusDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Legt den Wert der statusDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Ruft den Wert der totalWork-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalWork() {
        return totalWork;
    }

    /**
     * Legt den Wert der totalWork-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalWork(Integer value) {
        this.totalWork = value;
    }

}
