package com.example.demo.application.errors;

import com.example.demo.application.commons.operation.errors.ClientError;

public class InvalidInputData extends ClientError {
    private final String message;

    public InvalidInputData(String message) {
        this.message = message;
    }

    @Override
    public String errorCode() {
        return "INVALID_INPUT_DATA";
    }

    @Override
    public int statusCode() {
        return 400;
    }

    @Override
    public String message() {
        return message;
    }
}
