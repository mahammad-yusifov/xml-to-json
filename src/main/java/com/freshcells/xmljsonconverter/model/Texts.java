package com.freshcells.xmljsonconverter.model;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Texts {

    private Text text;
    @XmlElement(name = "text")
    public Text getText() {
        return text;
    }
}
