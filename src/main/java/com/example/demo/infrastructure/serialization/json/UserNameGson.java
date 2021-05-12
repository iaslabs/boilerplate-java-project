package com.example.demo.infrastructure.serialization.json;

import com.example.demo.application.domain.UserName;
import com.google.gson.*;

import java.lang.reflect.Type;

public class UserNameGson implements JsonSerializer<UserName>, JsonDeserializer<UserName> {

    @Override
    public UserName deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new UserName(json.getAsString());
    }

    @Override
    public JsonElement serialize(UserName src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.getValue());
    }
}
