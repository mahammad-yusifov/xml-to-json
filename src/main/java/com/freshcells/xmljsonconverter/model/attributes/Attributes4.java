package com.freshcells.xmljsonconverter.model.attributes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.freshcells.xmljsonconverter.model.Attributes;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

import java.util.List;

@Data
public class Attributes4 {

    public Attributes4() {
        this.attributes = new Attributes5();
    }

    @JsonProperty("@attributes")
    private Attributes5 attributes;

    @JsonIgnore
    private String source;

    @XmlAttribute(name = "source")
    public String getSource() {
        return attributes.getSource();
    }

    public void setSource(String source) {
        attributes.setSource(source);
    }

    private List<Category> category;

    @XmlElement(name = "category")
    public List<Category> getCategory() {
        return category;
    }
}
