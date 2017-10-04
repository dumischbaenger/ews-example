
package de.dumischbaenger.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ArrayOfMeetingTimeCandidate complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMeetingTimeCandidate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MeetingTimeCandidate" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingTimeCandidate" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMeetingTimeCandidate", propOrder = {
    "meetingTimeCandidate"
})
public class ArrayOfMeetingTimeCandidate {

    @XmlElement(name = "MeetingTimeCandidate", required = true)
    protected List<MeetingTimeCandidate> meetingTimeCandidate;

    /**
     * Gets the value of the meetingTimeCandidate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meetingTimeCandidate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeetingTimeCandidate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeetingTimeCandidate }
     * 
     * 
     */
    public List<MeetingTimeCandidate> getMeetingTimeCandidate() {
        if (meetingTimeCandidate == null) {
            meetingTimeCandidate = new ArrayList<MeetingTimeCandidate>();
        }
        return this.meetingTimeCandidate;
    }

}
