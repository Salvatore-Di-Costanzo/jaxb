//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.28 at 11:04:33 AM CET 
//


package pojo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metadataSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metadataSystemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docPrincipale" type="{}metadataDoc" maxOccurs="unbounded"/>
 *         &lt;element name="allegati" type="{}metadataAllegati" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadataSystemType", propOrder = {
    "docPrincipale",
    "allegati"
})
public class MetadataSystemType {

    @XmlElement(required = true)
    protected List<MetadataDoc> docPrincipale;
    @XmlElement(required = true)
    protected List<MetadataAllegati> allegati;

    /**
     * Gets the value of the docPrincipale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docPrincipale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocPrincipale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataDoc }
     * 
     * 
     */
    public List<MetadataDoc> getDocPrincipale() {
        if (docPrincipale == null) {
            docPrincipale = new ArrayList<MetadataDoc>();
        }
        return this.docPrincipale;
    }

    /**
     * Gets the value of the allegati property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allegati property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllegati().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataAllegati }
     * 
     * 
     */
    public List<MetadataAllegati> getAllegati() {
        if (allegati == null) {
            allegati = new ArrayList<MetadataAllegati>();
        }
        return this.allegati;
    }

}
