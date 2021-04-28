package com.example.demo.application.errors;

import com.example.demo.application.commons.operation.errors.ClientError;

public class CredentialsError extends ClientError {
    private final String message;

    public CredentialsError(String message) {
        this.message = message;
    }

    @Override
    public String errorCode() {
        return "CREDENTIALS_ERROR";
    }

    @Override
    public int statusCode() {
        return 401;
    }

    @Override
    public String message() {
        return message;
    }
}
