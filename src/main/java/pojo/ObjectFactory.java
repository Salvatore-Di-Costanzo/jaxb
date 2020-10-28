//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.28 at 11:04:33 AM CET 
//


package pojo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pojo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pojo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MetadataDoc }
     * 
     */
    public MetadataDoc createMetadataDoc() {
        return new MetadataDoc();
    }

    /**
     * Create an instance of {@link MetadataSystemType }
     * 
     */
    public MetadataSystemType createMetadataSystemType() {
        return new MetadataSystemType();
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link PreservationConfiguration.ClassiDocumentali }
     * 
     */
    public PreservationConfiguration.ClassiDocumentali createPreservationConfigurationClassiDocumentali() {
        return new PreservationConfiguration.ClassiDocumentali();
    }

    /**
     * Create an instance of {@link MetadataAllegati }
     * 
     */
    public MetadataAllegati createMetadataAllegati() {
        return new MetadataAllegati();
    }

    /**
     * Create an instance of {@link KeyType }
     * 
     */
    public KeyType createKeyType() {
        return new KeyType();
    }

    /**
     * Create an instance of {@link MetadataCustomType }
     * 
     */
    public MetadataCustomType createMetadataCustomType() {
        return new MetadataCustomType();
    }

    /**
     * Create an instance of {@link MappingsType }
     * 
     */
    public MappingsType createMappingsType() {
        return new MappingsType();
    }

    /**
     * Create an instance of {@link PreservationConfiguration }
     * 
     */
    public PreservationConfiguration createPreservationConfiguration() {
        return new PreservationConfiguration();
    }

}