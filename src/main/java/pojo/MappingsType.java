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
 * <p>Java class for mappingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mappingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadataSystem" type="{}metadataSystemType" maxOccurs="unbounded"/>
 *         &lt;element name="metadataCustom" type="{}metadataCustomType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mappingsType", propOrder = {
    "metadataSystem",
    "metadataCustom"
})
public class MappingsType {

    @XmlElement(required = true)
    protected List<MetadataSystemType> metadataSystem;
    @XmlElement(required = true)
    protected List<MetadataCustomType> metadataCustom;

    /**
     * Gets the value of the metadataSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataSystemType }
     * 
     * 
     */
    public List<MetadataSystemType> getMetadataSystem() {
        if (metadataSystem == null) {
            metadataSystem = new ArrayList<MetadataSystemType>();
        }
        return this.metadataSystem;
    }

    /**
     * Gets the value of the metadataCustom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataCustom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataCustom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataCustomType }
     * 
     * 
     */
    public List<MetadataCustomType> getMetadataCustom() {
        if (metadataCustom == null) {
            metadataCustom = new ArrayList<MetadataCustomType>();
        }
        return this.metadataCustom;
    }

}