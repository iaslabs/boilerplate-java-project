package com.example.demo.application.model;

import com.example.demo.application.commons.operation.ApplicationResponse;
import com.example.demo.application.domain.Calculation;

public class CalculateHoursResponse extends ApplicationResponse {
    private final Calculation calculation;

    public CalculateHoursResponse(Calculation calculation) {
        this.calculation = calculation;
    }

    public Calculation getCalculation() {
        return calculation;
    }
}
