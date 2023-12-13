package com.freshcells.xmljsonconverter.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "content")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Content implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Hotel hotel;
}
