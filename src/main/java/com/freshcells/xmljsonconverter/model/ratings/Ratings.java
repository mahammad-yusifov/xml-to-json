package com.freshcells.xmljsonconverter.model.ratings;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.freshcells.xmljsonconverter.model.Attributes;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
public class Ratings {

    public Ratings() {
        this.attributes = new Attributes7();
    }

    @JsonProperty("@attributes")
    private Attributes7 attributes;

    @JsonIgnore
    private String source;

    @JsonProperty("hc_id")
    private String hcId;

    @JsonProperty("recommendation_rate")
    private Double recommendationRate;

    private Double rating;

    private Integer reviews;

    private String url;

    private DetailedRating detailedRating;

    @XmlAttribute(name = "source")
    public String getSource() {
        return attributes.getSource();
    }

    public void setSource(String source) {
        attributes.setSource(source);
    }

    @XmlElement(name = "hc_id")
    public String getHcId() {
        return hcId;
    }

    @XmlElement(name = "recommendation_rate")
    public Double getRecommendationRate() {
        return recommendationRate;
    }
}
