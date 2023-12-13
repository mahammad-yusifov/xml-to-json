package com.freshcells.xmljsonconverter.model;

import com.freshcells.xmljsonconverter.model.attributes.Attributes4;
import com.freshcells.xmljsonconverter.model.images.Images;
import com.freshcells.xmljsonconverter.model.ratings.Ratings;
import com.freshcells.xmljsonconverter.model.usps.Usps;
import com.freshcells.xmljsonconverter.model.videos.Videos;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "hotel")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Hotel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer giataId;
    private Integer iff;
    private String name;
    private Double latitude;
    private Double longitude;
    private Address address;
    private String phone;
    private String email;
    private String url;
    private String updateTimestamp;
    private String category;
    private String regionCode;
    private String countryName;
    private Texts texts;
    private Usps usps;
    private String additionalTexts;
    private Images images;
    private Videos videos;
    private Attributes4 attributes;
    private Ratings ratings;
    private String hotelAwards;

    @XmlElement(name = "giata_id")
    public Integer getGiataId() {
        return giataId;
    }

    @XmlElement(name = "update_timestamp")
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }
}
