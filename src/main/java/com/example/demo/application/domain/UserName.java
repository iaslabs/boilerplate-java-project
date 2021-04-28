package com.example.demo.application.domain;

import com.example.demo.commons.Preconditions;

import java.util.Objects;

public class UserName {
    private final String value;

    public UserName(String value) {
        Objects.requireNonNull(value);
        Preconditions.isTrue(value.length() >= 2, "Invalid user name length");
        this.value = value;
    }


    public String getValue() {
        return value;
    }
}
