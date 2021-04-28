package com.example.demo.application.domain;

import com.example.demo.commons.Preconditions;

import java.util.Objects;

public class UserId {
    private final String value;

    public UserId(String value) {
        Objects.requireNonNull(value);
        Preconditions.isTrue(value.length() == 10, "Invalid user id lenght");
        this.value = value;
    }


    public String getValue() {
        return value;
    }
}
