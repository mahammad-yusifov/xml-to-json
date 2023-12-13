package com.freshcells.xmljsonconverter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelDto {

    private Hotel hotel;
    private com.freshcells.xmljsonconverter.model.giata.Data data;
}
