package com.ryan.tutorials.elasticsearch56;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {
    /**
     * Convert object to JSON string
     *
     * @param obj
     * @return String
     */
    public static String objectToJsonString(Object obj) throws JsonProcessingException {
        String jsonString = null;
        if (obj != null) {
            ObjectMapper mapper = new ObjectMapper();
            jsonString = mapper.writeValueAsString(obj);
        }
        return jsonString;
    }
}
