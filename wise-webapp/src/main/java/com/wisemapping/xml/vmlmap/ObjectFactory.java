/*
*    Copyright [2011] [wisemapping]
*
*   Licensed under WiseMapping Public License, Version 1.0 (the "License").
*   It is basically the Apache License, Version 2.0 (the "License") plus the
*   "powered by wisemapping" text requirement on every single page;
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the license at
*
*       http://www.wisemapping.org/license
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.14 at 05:18:25 PM ART 
//


package com.wisemapping.xml.vmlmap;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.mindmap.xml.vmlmap package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mindmap.xml.vmlmap
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Textbox }
     */
    public Textbox createTextbox() {
        return new Textbox();
    }

    /**
     * Create an instance of {@link Shape }
     */
    public Shape createShape() {
        return new Shape();
    }

    /**
     * Create an instance of {@link Roundrect }
     */
    public Roundrect createRoundrect() {
        return new Roundrect();
    }

    /**
     * Create an instance of {@link Oval }
     */
    public Oval createOval() {
        return new Oval();
    }

    /**
     * Create an instance of {@link Textbox.SPAN }
     */
    public Textbox.SPAN createTextboxSPAN() {
        return new Textbox.SPAN();
    }

    /**
     * Create an instance of {@link Rect }
     */
    public Rect createRect() {
        return new Rect();
    }

    /**
     * Create an instance of {@link Element }
     */
    public Element createElement() {
        return new Element();
    }

    /**
     * Create an instance of {@link Line }
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link Group }
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link Stroke }
     */
    public Stroke createStroke() {
        return new Stroke();
    }

    /**
     * Create an instance of {@link Polyline }
     */
    public Polyline createPolyline() {
        return new Polyline();
    }

    /**
     * Create an instance of {@link Fill }
     */
    public Fill createFill() {
        return new Fill();
    }

}
