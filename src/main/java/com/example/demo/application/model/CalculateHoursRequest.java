package com.example.demo.application.model;

import com.example.demo.application.commons.operation.ApplicationRequest;
import com.example.demo.application.domain.ServiceInformation;

public class CalculateHoursRequest extends ApplicationRequest {
    private final ServiceInformation information;

    public CalculateHoursRequest(ServiceInformation information) {
        this.information = information;
    }

    public ServiceInformation getInformation() {
        return information;
    }
}
