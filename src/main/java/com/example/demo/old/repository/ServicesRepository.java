package com.example.demo.old.repository;

import com.example.demo.old.model.ServiceReport;
import com.example.demo.old.model.TechnicianId;

import java.time.LocalDate;
import java.util.List;


public interface ServicesRepository {
    List<ServiceReport> getReportsByTechnicianId(TechnicianId technicianId, LocalDate weekDate);

    ServiceReport storeServiceReport(ServiceReport serviceReport);
}
