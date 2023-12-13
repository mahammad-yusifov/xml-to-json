package com.freshcells.xmljsonconverter.model.giata;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeoData {

    private Integer giataId;
    private Double latitude;
    private Double longitude;
    private Integer accuracy;


    @XmlElement(name = "GiataID")
    public Integer getGiataId() {
        return giataId;
    }

    @XmlElement(name = "Latitude")
    public Double getLatitude() {
        return latitude;
    }

    @XmlElement(name = "Longitude")
    public Double getLongitude() {
        return longitude;
    }

    @XmlElement(name = "Accuracy")
    public Integer getAccuracy() {
        return accuracy;
    }
}
