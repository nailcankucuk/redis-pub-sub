package com.nailcankucuk.example.redispubsub.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author nailcankucuk@gmail.com
 * @date 04.11.2018
 */
public class JsonUtil {
    private static Logger logger = LoggerFactory.getLogger(JsonUtil.class);

    public static String toJson(Object object) {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = "";
        try {
            json = ow.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            logger.error("There was an error while convert object to json! Object: {}, Error: {}",
                    object.toString(), e.getMessage());
        }
        return json;
    }
}
