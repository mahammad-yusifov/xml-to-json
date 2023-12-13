package com.freshcells.xmljsonconverter.model.ratings;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelRating {
    private String overall;
    private String single;
    private String couple;
    private String family;
    private String friends;
    private String beach;
    @XmlElement(name = "wintersport")
    private String winterSport;
    private String other;
}
