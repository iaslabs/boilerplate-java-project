package com.example.demo.infrastructure.serialization.json;

import com.example.demo.application.domain.Id;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class IdDeserializer extends JsonDeserializer<Id> {
    @Override
    public Id deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String valueAsString = jsonParser.getValueAsString();
        return new Id(valueAsString);
    }
}
