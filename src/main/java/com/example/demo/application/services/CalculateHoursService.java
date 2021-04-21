package com.example.demo.application.services;

import com.example.demo.application.domain.Calculation;
import com.example.demo.application.domain.ServiceInformation;
import com.example.demo.application.ports.in.CalculateHoursUseCase;
import com.example.demo.application.ports.out.ServicesRepository;

public class CalculateHoursService implements CalculateHoursUseCase {
    private final ServicesRepository repository;

    public CalculateHoursService(ServicesRepository repository) {
        this.repository = repository;
    }


    @Override
    public Calculation execute(ServiceInformation information) {
        // business logic
        return null;
    }
}
