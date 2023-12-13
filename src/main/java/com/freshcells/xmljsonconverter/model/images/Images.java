package com.freshcells.xmljsonconverter.model.images;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

import java.util.List;

@Data
public class Images {

    public Images() {
        this.attributes = new Attributes3();
    }

    @JsonProperty("@attributes")
    private Attributes3 attributes;

    private List<Image> image;

    @XmlElement(name = "image")
    public List<Image> getImage() {
        return image;
    }

    @JsonIgnore
    private String source;
    @JsonIgnore
    private String sourceLong;
    @JsonIgnore
    private String katalogId;
    @JsonIgnore
    private String katalogName;

    @XmlAttribute(name = "source")
    public String getSource() {
        return attributes.getSource();
    }

    public void setSource(String source) {
        attributes.setSource(source);
    }

    @XmlAttribute(name = "sourceLong")
    public String getSourceLong() {
        return attributes.getSourceLong();
    }

    public void setSourceLong(String sourceLong) {
        attributes.setSourceLong(sourceLong);
    }

    @XmlAttribute(name = "katalogId")
    public String getKatalogId() {
        return attributes.getKatalogId();
    }

    public void setKatalogId(String katalogId) {
        attributes.setKatalogId(katalogId);
    }

    @XmlAttribute(name = "katalogName")
    public String getKatalogName() {
        return attributes.getKatalogName();
    }

    public void setKatalogName(String katalogName) {
        attributes.setKatalogName(katalogName);
    }
}
