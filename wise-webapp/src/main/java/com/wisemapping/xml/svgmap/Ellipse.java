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
// Generated on: 2007.04.14 at 05:27:07 PM ART 
//


package com.wisemapping.xml.svgmap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="cx" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="cy" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="fill" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="#E0E5EF" />
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="rx" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="ry" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="stroke" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="#023BB9" />
 *       &lt;attribute name="stroke-width" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="visibility" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="hidden"/>
 *             &lt;enumeration value="visible"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ellipse")
public class Ellipse {

    @XmlAttribute(required = true)
    protected float cx;
    @XmlAttribute(required = true)
    protected float cy;
    @XmlAttribute(required = true)
    protected String fill;
    @XmlAttribute(required = true)
    protected float height;
    @XmlAttribute(required = true)
    protected float rx;
    @XmlAttribute(required = true)
    protected float ry;
    @XmlAttribute(required = true)
    protected String stroke;
    @XmlAttribute(name = "stroke-width", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String strokeWidth;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;
    @XmlAttribute(required = true)
    protected float width;

    /**
     * Gets the value of the cx property.
     */
    public float getCx() {
        return cx;
    }

    /**
     * Sets the value of the cx property.
     */
    public void setCx(float value) {
        this.cx = value;
    }

    /**
     * Gets the value of the cy property.
     */
    public float getCy() {
        return cy;
    }

    /**
     * Sets the value of the cy property.
     */
    public void setCy(float value) {
        this.cy = value;
    }

    /**
     * Gets the value of the fill property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFill() {
        if (fill == null) {
            return "#E0E5EF";
        } else {
            return fill;
        }
    }

    /**
     * Sets the value of the fill property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFill(String value) {
        this.fill = value;
    }

    /**
     * Gets the value of the height property.
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     */
    public void setHeight(float value) {
        this.height = value;
    }

    /**
     * Gets the value of the rx property.
     */
    public float getRx() {
        return rx;
    }

    /**
     * Sets the value of the rx property.
     */
    public void setRx(float value) {
        this.rx = value;
    }

    /**
     * Gets the value of the ry property.
     */
    public float getRy() {
        return ry;
    }

    /**
     * Sets the value of the ry property.
     */
    public void setRy(float value) {
        this.ry = value;
    }

    /**
     * Gets the value of the stroke property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStroke() {
        if (stroke == null) {
            return "#023BB9";
        } else {
            return stroke;
        }
    }

    /**
     * Sets the value of the stroke property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStroke(String value) {
        this.stroke = value;
    }

    /**
     * Gets the value of the strokeWidth property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStrokeWidth() {
        return strokeWidth;
    }

    /**
     * Sets the value of the strokeWidth property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStrokeWidth(String value) {
        this.strokeWidth = value;
    }

    /**
     * Gets the value of the visibility property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the width property.
     */
    public float getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     */
    public void setWidth(float value) {
        this.width = value;
    }

}
