package com.example.demo.application.model;

import com.example.demo.application.commons.operation.ApplicationResponse;
import com.example.demo.application.domain.Poliza;

import java.util.Objects;

public class AfiliacionResponse extends ApplicationResponse {
    private final Poliza poliza;

    public AfiliacionResponse(Poliza poliza) {
        this.poliza = Objects.requireNonNull(poliza);
    }

    public Poliza getPoliza() {
        return poliza;
    }
}
