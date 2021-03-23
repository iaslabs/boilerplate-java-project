package com.example.demo.services;

import com.example.demo.model.ServiceReport;
import com.example.demo.model.TechnicianId;
import com.example.demo.repository.ServicesRepository;
import org.apache.commons.lang3.Validate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetServiceReportsByTechnician {
    private final ServicesRepository repository;

    public GetServiceReportsByTechnician(ServicesRepository repository) {
        this.repository = repository;
    }


    public List<ServiceReport> getList(TechnicianId technicianId) {
        Validate.notNull(technicianId);
        return List.of();
    }


}
