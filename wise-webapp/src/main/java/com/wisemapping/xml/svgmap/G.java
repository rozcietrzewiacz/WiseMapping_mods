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
 *       &lt;choice>
 *         &lt;element ref="{http://www.w3.org/2000/svg}ellipse"/>
 *         &lt;element ref="{http://www.w3.org/2000/svg}line"/>
 *         &lt;element ref="{http://www.w3.org/2000/svg}rect"/>
 *         &lt;element ref="{http://www.w3.org/2000/svg}text"/>
 *       &lt;/choice>
 *       &lt;attribute name="focusable" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="true" />
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="100" />
 *       &lt;attribute name="preserveAspectRatio" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="none" />
 *       &lt;attribute name="transform" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" fixed="100" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "ellipse",
        "line",
        "rect",
        "text"
        })
@XmlRootElement(name = "g")
public class G {

    protected Ellipse ellipse;
    protected Line line;
    protected Rect rect;
    protected Text text;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String focusable;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String height;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String preserveAspectRatio;
    @XmlAttribute(required = true)
    protected String transform;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String width;

    /**
     * Gets the value of the ellipse property.
     *
     * @return possible object is
     *         {@link Ellipse }
     */
    public Ellipse getEllipse() {
        return ellipse;
    }

    /**
     * Sets the value of the ellipse property.
     *
     * @param value allowed object is
     *              {@link Ellipse }
     */
    public void setEllipse(Ellipse value) {
        this.ellipse = value;
    }

    /**
     * Gets the value of the line property.
     *
     * @return possible object is
     *         {@link Line }
     */
    public Line getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     *
     * @param value allowed object is
     *              {@link Line }
     */
    public void setLine(Line value) {
        this.line = value;
    }

    /**
     * Gets the value of the rect property.
     *
     * @return possible object is
     *         {@link Rect }
     */
    public Rect getRect() {
        return rect;
    }

    /**
     * Sets the value of the rect property.
     *
     * @param value allowed object is
     *              {@link Rect }
     */
    public void setRect(Rect value) {
        this.rect = value;
    }

    /**
     * Gets the value of the text property.
     *
     * @return possible object is
     *         {@link Text }
     */
    public Text getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value allowed object is
     *              {@link Text }
     */
    public void setText(Text value) {
        this.text = value;
    }

    /**
     * Gets the value of the focusable property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFocusable() {
        if (focusable == null) {
            return "true";
        } else {
            return focusable;
        }
    }

    /**
     * Sets the value of the focusable property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFocusable(String value) {
        this.focusable = value;
    }

    /**
     * Gets the value of the height property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getHeight() {
        if (height == null) {
            return "100";
        } else {
            return height;
        }
    }

    /**
     * Sets the value of the height property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the preserveAspectRatio property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getPreserveAspectRatio() {
        if (preserveAspectRatio == null) {
            return "none";
        } else {
            return preserveAspectRatio;
        }
    }

    /**
     * Sets the value of the preserveAspectRatio property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPreserveAspectRatio(String value) {
        this.preserveAspectRatio = value;
    }

    /**
     * Gets the value of the transform property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTransform() {
        return transform;
    }

    /**
     * Sets the value of the transform property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTransform(String value) {
        this.transform = value;
    }

    /**
     * Gets the value of the width property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getWidth() {
        if (width == null) {
            return "100";
        } else {
            return width;
        }
    }

    /**
     * Sets the value of the width property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWidth(String value) {
        this.width = value;
    }

}
