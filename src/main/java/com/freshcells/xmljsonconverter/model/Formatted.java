package com.freshcells.xmljsonconverter.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Formatted {

    private List<String> lines;
    @XmlElement(name = "line")
    public List<String> getLines() {
        return lines;
    }
}
