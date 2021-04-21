package com.example.demo.old.services;

import com.example.demo.old.model.ServiceReport;
import com.example.demo.old.model.TechnicianId;
import com.example.demo.old.repository.ServicesRepository;
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
