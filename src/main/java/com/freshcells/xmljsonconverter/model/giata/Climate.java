package com.freshcells.xmljsonconverter.model.giata;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.freshcells.xmljsonconverter.model.usps.Attributes2;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
public class Climate {

    public Climate() {
        this.attributes = new Attributes11();
    }

    @JsonProperty("@attributes")
    private Attributes11 attributes;

    @JsonIgnore
    private String kind;

    @JsonIgnore
    private String id;

    private Months dayTemperature;

    private Months nightTemperature;

    private Months sunshine;

    private Months rainDay;

    private Months waterTemperature;

    @XmlAttribute(name = "kind")
    public String getKind() {
        return attributes.getKind();
    }

    public void setKind(String kind) {
        attributes.setKind(kind);
    }

    @XmlAttribute(name = "id")
    public String getId() {
        return attributes.getId();
    }

    public void setId(String id) {
        attributes.setId(id);
    }

    @XmlElement(name = "day_temperature")
    public Months getDayTemperature() {
        return dayTemperature;
    }

    @XmlElement(name = "night_temperature")
    public Months getNightTemperature() {
        return nightTemperature;
    }

    @XmlElement(name = "sunshine")
    public Months getSunshine() {
        return sunshine;
    }

    @XmlElement(name = "rainday")
    public Months getRainDay() {
        return rainDay;
    }

    @XmlElement(name = "water_temperature")
    public Months getWaterTemperature() {
        return waterTemperature;
    }
}
