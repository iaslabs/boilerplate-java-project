package com.example.demo.old.services;

import com.example.demo.old.model.TechnicianId;
import com.example.demo.old.repository.ServicesRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.stream.Stream;

@Service
public class CalculateTechnicianWeekHoursService {
    private final ServicesRepository repository;

    public CalculateTechnicianWeekHoursService(ServicesRepository repository) {
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
