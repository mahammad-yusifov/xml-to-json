package com.freshcells.xmljsonconverter.model.usps;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class AttributeDto {

    public AttributeDto() {
        this.attributes = new Attributes2();
    }

    @JsonProperty("@attributes")
    private Attributes2 attributes;

    @JsonIgnore
    private String priority;
    @JsonIgnore
    private String rating;

    private String usp;

    @XmlAttribute(name = "priority")
    public String getPriority() {
        return attributes.getPriority();
    }

    public void setPriority(String priority) {
        attributes.setPriority(priority);
    }

    public void setRating(String rating) {
        attributes.setRating(rating);
    }

    @XmlAttribute(name = "rating")
    public String getRating() {
        return attributes.getRating();
    }

    @XmlValue
    public String getUsp() {
        return usp;
    }

    public void setUsp(String usp) {
        this.usp = usp;
    }
}
