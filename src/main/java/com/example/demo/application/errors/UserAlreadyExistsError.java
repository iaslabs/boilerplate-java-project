package com.example.demo.application.errors;

import com.example.demo.application.commons.operation.errors.ClientError;
import com.example.demo.application.domain.UserId;

public class UserAlreadyExistsError extends ClientError {
    private final UserId userId;

    public UserAlreadyExistsError(UserId userId) {
        this.userId = userId;
    }

    @Override
    public String errorCode() {
        return "USER_ALREADY_EXISTS";
    }

    @Override
    public int statusCode() {
        return 400;
    }

    @Override
    public String message() {
        return "The user with id: " + userId + " already exists.";
    }
}
