package com.example.demo.repository;

import com.example.demo.model.ServiceReport;
import com.example.demo.model.TechnicianId;

import java.time.LocalDate;
import java.util.List;


public interface ServicesRepository {
    List<ServiceReport> getReportsByTechnicianId(TechnicianId technicianId, LocalDate weekDate);

    ServiceReport storeServiceReport(ServiceReport serviceReport);
}
