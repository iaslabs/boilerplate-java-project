package com.example.demo.application.commons.operation;

import com.example.demo.application.commons.operation.credentials.ApplicationCredentials;

public interface UseCase<INPUT extends ApplicationRequest, OUTPUT extends ApplicationResponse> {
    OUTPUT execute(INPUT input, ApplicationCredentials credentials);
}
