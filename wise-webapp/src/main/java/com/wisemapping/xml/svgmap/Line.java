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
 *       &lt;attribute name="fill-opacity" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="stroke" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stroke-opacity" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" />
 *       &lt;attribute name="stroke-width" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="1px" />
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="visibility">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="hidden"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="x1" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="x2" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="y1" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="y2" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "line")
public class Line {

    @XmlAttribute(name = "fill-opacity")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fillOpacity;
    @XmlAttribute(required = true)
    protected String stroke;
    @XmlAttribute(name = "stroke-opacity")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String strokeOpacity;
    @XmlAttribute(name = "stroke-width", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String strokeWidth;
    @XmlAttribute
    protected String style;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;
    @XmlAttribute(required = true)
    protected float x1;
    @XmlAttribute(required = true)
    protected float x2;
    @XmlAttribute(required = true)
    protected float y1;
    @XmlAttribute(required = true)
    protected float y2;

    /**
     * Gets the value of the fillOpacity property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFillOpacity() {
        return fillOpacity;
    }

    /**
     * Sets the value of the fillOpacity property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFillOpacity(String value) {
        this.fillOpacity = value;
    }

    /**
     * Gets the value of the stroke property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStroke() {
        return stroke;
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
     * Gets the value of the strokeOpacity property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStrokeOpacity() {
        return strokeOpacity;
    }

    /**
     * Sets the value of the strokeOpacity property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStrokeOpacity(String value) {
        this.strokeOpacity = value;
    }

    /**
     * Gets the value of the strokeWidth property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStrokeWidth() {
        if (strokeWidth == null) {
            return "1px";
        } else {
            return strokeWidth;
        }
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
     * Gets the value of the style property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStyle(String value) {
        this.style = value;
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
     * Gets the value of the x1 property.
     */
    public float getX1() {
        return x1;
    }

    /**
     * Sets the value of the x1 property.
     */
    public void setX1(float value) {
        this.x1 = value;
    }

    /**
     * Gets the value of the x2 property.
     */
    public float getX2() {
        return x2;
    }

    /**
     * Sets the value of the x2 property.
     */
    public void setX2(float value) {
        this.x2 = value;
    }

    /**
     * Gets the value of the y1 property.
     */
    public float getY1() {
        return y1;
    }

    /**
     * Sets the value of the y1 property.
     */
    public void setY1(float value) {
        this.y1 = value;
    }

    /**
     * Gets the value of the y2 property.
     */
    public float getY2() {
        return y2;
    }

    /**
     * Sets the value of the y2 property.
     */
    public void setY2(float value) {
        this.y2 = value;
    }

}
