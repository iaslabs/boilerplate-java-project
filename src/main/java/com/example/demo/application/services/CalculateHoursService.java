package com.example.demo.application.services;

import com.example.demo.application.commons.operation.credentials.ApplicationCredentials;
import com.example.demo.application.model.CalculateHoursRequest;
import com.example.demo.application.model.CalculateHoursResponse;
import com.example.demo.application.ports.in.CalculateHoursUseCase;
import com.example.demo.application.ports.out.ServicesRepository;

public class CalculateHoursService implements CalculateHoursUseCase {
    private final ServicesRepository repository;


    public CalculateHoursService(ServicesRepository repository) {
        this.repository = repository;
    }


    @Override
    public CalculateHoursResponse execute(CalculateHoursRequest calculateHoursRequest, ApplicationCredentials credentials) {
        // business logic
        return null;
    }
}
