package com.freshcells.xmljsonconverter.model.giata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;
import lombok.Data;

//@Data
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Oc {

    public Oc() {
        this.attributes = new Attributes9();
    }

    @JsonProperty("@attributes")
    private Attributes9 attributes;

    @JsonIgnore
    private String seq;

    private String value;

    @XmlAttribute(name = "seq")
    public String getSeq() {
        return attributes.getSeq();
    }

    public void setSeq(String seq) {
        attributes.setSeq(seq);
    }

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
