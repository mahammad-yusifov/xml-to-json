package com.freshcells.xmljsonconverter.model.videos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Videos {

    private List<String> video;

    public List<String> getVideo() {
        return new ArrayList<>();
    }
}
