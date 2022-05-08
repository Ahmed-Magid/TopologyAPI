package com.example.main.util;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;

public class JsonManager {
    private final ObjectMapper objectMapper;

    public JsonManager() {
        objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public <T> T readJSON(String fileName, Class<T> type) {
        try {
            return objectMapper.readValue(new File(fileName), type);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean writeJSON(String fileName, Object object) {
        try {
            ObjectWriter writer = objectMapper.writer(new DefaultPrettyPrinter());
            writer.writeValue(new File(fileName), object);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
