package com.example.demo.application.commons.operation.errors;

public abstract class ApplicationError extends RuntimeException {

    public abstract String errorCode();

    public abstract int statusCode();

    public abstract String message();
}
