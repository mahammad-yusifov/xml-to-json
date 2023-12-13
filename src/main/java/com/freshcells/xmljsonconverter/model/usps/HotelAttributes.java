package com.freshcells.xmljsonconverter.model.usps;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

import java.util.List;

@Data
public class HotelAttributes {

    public HotelAttributes() {
        this.attributes = new Attributes1();
    }

    @JsonProperty("@attributes")
    private Attributes1 attributes;

    @JsonIgnore
    private String source;

    @XmlAttribute(name = "source")
    public String getSource() {
        return attributes.getSource();
    }

    public void setSource(String source) {
        attributes.setSource(source);
    }


    private List<AttributeDto> attribute;

    @XmlElement(name = "attribute")
    public List<AttributeDto> getAttribute() {
        return attribute;
    }
}
