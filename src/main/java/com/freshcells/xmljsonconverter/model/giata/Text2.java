package com.freshcells.xmljsonconverter.model.giata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.freshcells.xmljsonconverter.model.usps.Attributes2;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.PROPERTY)
public class Text2 {

    public Text2() {
        this.attributes = new Attributes10();
    }

    @JsonProperty("@attributes")
    private Attributes10 attributes;

    private String value;

    @JsonIgnore
    private String lang;

    @XmlAttribute(name = "lang")
    public String getLang() {
        return attributes.getLang();
    }

    public void setLang(String lang) {
        attributes.setLang(lang);
    }

    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
