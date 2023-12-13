package com.freshcells.xmljsonconverter.model.giata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class BildFile {

    public BildFile() {
        this.attributes = new Attributes12();
    }

    @JsonProperty("@attributes")
    private Attributes12 attributes;

    @JsonIgnore
    private String typ;
    @JsonIgnore
    private String seq;
    @JsonIgnore
    private String size;
    @JsonIgnore
    private String width;
    @JsonIgnore
    private String height;
    @JsonIgnore
    private String id;

    private String value;

    @XmlAttribute(name = "typ")
    public String getTyp() {
        return attributes.getTyp();
    }

    public void setTyp(String typ) {
        attributes.setTyp(typ);
    }

    @XmlAttribute(name = "seq")
    public String getSeq() {
        return attributes.getSeq();
    }

    public void setSeq(String seq) {
        attributes.setSeq(seq);
    }

    @XmlAttribute(name = "size")
    public String getSize() {
        return attributes.getSize();
    }

    public void setSize(String size) {
        attributes.setSize(size);
    }

    @XmlAttribute(name = "width")
    public String getWidth() {
        return attributes.getWidth();
    }

    public void setWidth(String width) {
        attributes.setWidth(width);
    }

    @XmlAttribute(name = "height")
    public String getHeight() {
        return attributes.getHeight();
    }

    public void setHeight(String height) {
        attributes.setHeight(height);
    }

    @XmlAttribute(name = "id")
    public String getId() {
        return attributes.getId();
    }

    public void setId(String id) {
        attributes.setId(id);
    }

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
