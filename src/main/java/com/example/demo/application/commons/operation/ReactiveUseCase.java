package com.example.demo.application.commons.operation;

import com.example.demo.application.commons.operation.credentials.ApplicationCredentials;

import java.util.concurrent.CompletableFuture;

public interface ReactiveUseCase<INPUT extends ApplicationRequest, OUTPUT extends ApplicationResponse> {
    CompletableFuture<OUTPUT> execute(INPUT input, ApplicationCredentials credentials);
}
