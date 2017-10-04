
package de.dumischbaenger.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PullSubscriptionRequestType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PullSubscriptionRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseSubscriptionRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Timeout" type="{http://schemas.microsoft.com/exchange/services/2006/types}SubscriptionTimeoutType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PullSubscriptionRequestType", propOrder = {
    "timeout"
})
public class PullSubscriptionRequestType
    extends BaseSubscriptionRequestType
{

    @XmlElement(name = "Timeout")
    protected int timeout;

    /**
     * Ruft den Wert der timeout-Eigenschaft ab.
     * 
     */
    public int getTimeout() {
        return timeout;
    }

    /**
     * Legt den Wert der timeout-Eigenschaft fest.
     * 
     */
    public void setTimeout(int value) {
        this.timeout = value;
    }

}
