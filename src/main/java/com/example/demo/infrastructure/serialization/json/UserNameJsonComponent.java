package com.example.demo.infrastructure.serialization.json;

import com.example.demo.application.domain.UserName;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;


@JsonComponent
public class UserNameJsonComponent {
    public static class Serializer extends JsonSerializer<UserName> {
        @Override
        public void serialize(UserName userName, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeString(userName.getValue());
        }
    }

    public static class Deserializer extends JsonDeserializer<UserName> {
        @Override
        public UserName deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            return new UserName(jsonParser.getValueAsString());
        }
    }
}
