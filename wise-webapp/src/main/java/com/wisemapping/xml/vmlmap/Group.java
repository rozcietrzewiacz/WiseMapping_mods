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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://mindmap.com/xml/vmlmap}element">
 *       &lt;choice>
 *         &lt;element ref="{http://mindmap.com/xml/vmlmap}group" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://mindmap.com/xml/vmlmap}line" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://mindmap.com/xml/vmlmap}oval" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://mindmap.com/xml/vmlmap}polyline" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://mindmap.com/xml/vmlmap}rect" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://mindmap.com/xml/vmlmap}roundrect" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://mindmap.com/xml/vmlmap}shape" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *       &lt;attribute name="coordorigin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="coordsize" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "group",
        "line",
        "oval",
        "polyline",
        "rect",
        "roundrect",
        "shape"
        })
@XmlRootElement(name = "group")
public class Group
        extends Element {

    protected List<Group> group;
    protected List<Line> line;
    protected List<Oval> oval;
    protected List<Polyline> polyline;
    protected List<Rect> rect;
    protected List<Roundrect> roundrect;
    protected List<Shape> shape;
    @XmlAttribute
    protected String coordorigin;
    @XmlAttribute(required = true)
    protected String coordsize;

    /**
     * Gets the value of the group property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the group property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroup().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Group }
     */
    public List<Group> getGroup() {
        if (group == null) {
            group = new ArrayList<Group>();
        }
        return this.group;
    }

    /**
     * Gets the value of the line property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Line }
     */
    public List<Line> getLine() {
        if (line == null) {
            line = new ArrayList<Line>();
        }
        return this.line;
    }

    /**
     * Gets the value of the oval property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oval property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOval().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Oval }
     */
    public List<Oval> getOval() {
        if (oval == null) {
            oval = new ArrayList<Oval>();
        }
        return this.oval;
    }

    /**
     * Gets the value of the polyline property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polyline property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolyline().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Polyline }
     */
    public List<Polyline> getPolyline() {
        if (polyline == null) {
            polyline = new ArrayList<Polyline>();
        }
        return this.polyline;
    }

    /**
     * Gets the value of the rect property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rect property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRect().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Rect }
     */
    public List<Rect> getRect() {
        if (rect == null) {
            rect = new ArrayList<Rect>();
        }
        return this.rect;
    }

    /**
     * Gets the value of the roundrect property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roundrect property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoundrect().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Roundrect }
     */
    public List<Roundrect> getRoundrect() {
        if (roundrect == null) {
            roundrect = new ArrayList<Roundrect>();
        }
        return this.roundrect;
    }

    /**
     * Gets the value of the shape property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shape property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShape().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Shape }
     */
    public List<Shape> getShape() {
        if (shape == null) {
            shape = new ArrayList<Shape>();
        }
        return this.shape;
    }

    /**
     * Gets the value of the coordorigin property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCoordorigin() {
        return coordorigin;
    }

    /**
     * Sets the value of the coordorigin property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCoordorigin(String value) {
        this.coordorigin = value;
    }

    /**
     * Gets the value of the coordsize property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCoordsize() {
        return coordsize;
    }

    /**
     * Sets the value of the coordsize property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCoordsize(String value) {
        this.coordsize = value;
    }

}
