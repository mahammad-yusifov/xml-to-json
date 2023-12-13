package com.freshcells.xmljsonconverter.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class JsonParser {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException("Error converting object to JSON", e);
        }
    }
}
