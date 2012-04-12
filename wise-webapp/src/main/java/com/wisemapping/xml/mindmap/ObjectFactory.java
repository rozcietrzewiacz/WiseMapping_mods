//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.16 at 11:06:29 AM ART 
//


package com.wisemapping.xml.mindmap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wisemapping.xml.mindmap package. 
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

    private final static QName _Topic_QNAME = new QName("", "topic");
    private final static QName _Relationship_QNAME = new QName("", "relationship");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wisemapping.xml.mindmap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link Icon }
     * 
     */
    public Icon createIcon() {
        return new Icon();
    }

    /**
     * Create an instance of {@link TopicType }
     * 
     */
    public TopicType createTopicType() {
        return new TopicType();
    }

    /**
     * Create an instance of {@link Map }
     * 
     */
    public Map createMap() {
        return new Map();
    }

    /**
     * Create an instance of {@link RelationshipType }
     * 
     */
    public RelationshipType createRelationshipType() {
        return new RelationshipType();
    }

    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopicType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "topic")
    public JAXBElement<TopicType> createTopic(TopicType value) {
        return new JAXBElement<TopicType>(_Topic_QNAME, TopicType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationshipType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "relationship")
    public JAXBElement<RelationshipType> createRelationship(RelationshipType value) {
        return new JAXBElement<RelationshipType>(_Relationship_QNAME, RelationshipType.class, null, value);
    }

}
