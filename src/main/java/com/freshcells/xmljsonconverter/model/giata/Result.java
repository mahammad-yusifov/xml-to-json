package com.freshcells.xmljsonconverter.model.giata;

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
@XmlRootElement(name = "result")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Result implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private com.freshcells.xmljsonconverter.model.giata.Data data;

}
