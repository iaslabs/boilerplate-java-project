package com.example.demo.old.services;

import com.example.demo.old.model.TechnicianId;
import com.example.demo.old.repository.ServicesRepository;

import java.time.LocalDate;
import java.util.stream.Stream;

public class CalculateTechnicianPlainService {
    private final ServicesRepository repository;

    public CalculateTechnicianPlainService(ServicesRepository repository) {
        this.repository = repository;
    }


    public void calculate(TechnicianId technicianId, LocalDate localDate) {
        repository.getReportsByTechnicianId(technicianId, localDate)
                .stream()
                .flatMap(serviceReport -> {
                    return Stream.empty();
                });
    }
}
