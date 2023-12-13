package com.freshcells.xmljsonconverter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private Integer zip;
    private String city;
    private String country;
    private Formatted formatted;
}
