package com.example.demo.application.model;

import com.example.demo.application.commons.operation.ApplicationRequest;
import com.example.demo.application.domain.UserId;
import com.example.demo.application.domain.UserName;

import java.util.Objects;

public class AfiliacionRequest extends ApplicationRequest {
    private final UserName userName;
    private final UserId userId;

    public AfiliacionRequest(UserName userName, UserId userId) {
        this.userName = Objects.requireNonNull(userName);
        this.userId = Objects.requireNonNull(userId);
    }

    public UserName getUserName() {
        return userName;
    }

    public UserId getUserId() {
        return userId;
    }
}
