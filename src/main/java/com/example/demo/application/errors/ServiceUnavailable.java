package com.example.demo.application.errors;

import com.example.demo.application.commons.operation.errors.ServerError;

public class ServiceUnavailable extends ServerError {
    @Override
    public String errorCode() {
        return "SERVICE_UNAVAILABLE";
    }

    @Override
    public int statusCode() {
        return 500;
    }

    @Override
    public String message() {
        return "Service unavailable, please try again later";
    }
}
