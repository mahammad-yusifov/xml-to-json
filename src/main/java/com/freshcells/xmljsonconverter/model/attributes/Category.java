package com.freshcells.xmljsonconverter.model.attributes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlValue;
import lombok.Data;

import java.util.List;

@Data
public class Category {

    public Category() {
        this.attributes = new Attributes6();
    }

    @JsonProperty("@attributes")
    private Attributes6 attributes;

    @JsonIgnore
    private String name;

    @XmlAttribute(name = "name")
    public String getName() {
        return attributes.getName();
    }

    public void setName(String name) {
        attributes.setName(name);
    }

    private List<String> attribute;

    @XmlElement(name = "attribute")
    public List<String> getAttribute() {
        return attribute;
    }

}
