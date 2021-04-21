package com.example.demo.old.services;

import com.example.demo.old.model.ServiceReport;
import com.example.demo.old.model.TechnicianId;
import com.example.demo.old.repository.ServicesRepository;
import org.apache.commons.lang3.Validate;

import java.util.List;

public class GetAverageHoursByWeek {
    private final ServicesRepository repository;

    public GetAverageHoursByWeek(ServicesRepository repository) {
        this.repository = repository;
    }

    public List<ServiceReport> getList(TechnicianId technicianId) {
        Validate.notNull(technicianId);
        return List.of();
    }
}
