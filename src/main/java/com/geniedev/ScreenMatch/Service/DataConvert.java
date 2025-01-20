package com.geniedev.ScreenMatch.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.DataSeries;

import java.io.IOException;
import java.util.Map;

public class DataConvert implements IDataConvert {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T obtainData(String json, Class<T> claseData) {
        try {
            return objectMapper.readValue(json, claseData);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
