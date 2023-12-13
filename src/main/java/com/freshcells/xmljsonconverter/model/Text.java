package com.freshcells.xmljsonconverter.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;
import java.util.List;

@Data
public class Text {

    public Text() {
        this.attributes = new Attributes();
    }

    @JsonProperty("@attributes")
    private Attributes attributes;

    @JsonIgnore
    private String tourOperator;
    @JsonIgnore
    private String source;
    @JsonIgnore
    private String tourOperatorLong;
    @JsonIgnore
    private String id;
    @JsonIgnore
    private String name;
    private String copyrightText;

    public String getCopyrightText() {
        return copyrightText;
    }

    @XmlAttribute(name = "tourOperator")
    public String getTourOperator() {
        return attributes.getTourOperator();
    }

    public void setTourOperator(String tourOperator) {
        attributes.setTourOperator(tourOperator);
    }

    @XmlAttribute(name = "source")
    public String getSource() {
        return attributes.getSource();
    }

    public void setSource(String source) {
        attributes.setSource(source);
    }

    @XmlAttribute(name = "tourOperatorLong")
    public String getTourOperatorLong() {
        return attributes.getTourOperatorLong();
    }

    public void setTourOperatorLong(String tourOperatorLong) {
        attributes.setTourOperatorLong(tourOperatorLong);
    }

    @XmlAttribute(name = "id")
    public String getId() {
        return this.attributes.getId();
    }

    public void setId(String id) {
        attributes.setId(id);
    }

    @XmlAttribute(name = "name")
    public String getName() {
        return this.attributes.getName();
    }

    public void setName(String name) {
        attributes.setName(name);
    }


    private List<Paragraph> paragraphs;
    @XmlElement(name = "paragraph")
    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }
}

