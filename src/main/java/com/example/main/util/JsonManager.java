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

    /**
     * Reads the specified JSON file and returns a corresponding POJO of the specified type that matched the object in the JSON file.
     * @param fileName The name of the JSON file to be read.
     * @param type The class of the object in the JSON file and the object to be returned.
     * @param <T> A generic type that will be returned that is specified in the second argument.
     * @return The corresponding POJO of the JSON object if reading done successfully, otherwise null.
     */
    public <T> T readJSON(String fileName, Class<T> type) {
        try {
            return objectMapper.readValue(new File(fileName), type);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Converts a POJO into a JSON object and pretty prints it in the specified file.
     * @param fileName The name of the resulting file.
     * @param object The POJO to be converted into a JSON object.
     * @return True if writing is done successfully, otherwise false.
     */
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
