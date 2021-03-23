package com.example.demo.repository;

import com.example.demo.model.ServiceReport;
import com.example.demo.model.TechnicianId;
import org.springframework.stereotype.Repository;

import java.util.List;



public interface ServicesRepository {
    List<ServiceReport> getReportsByTechnicianId(TechnicianId technicianId, int weekNumber);

    ServiceReport storeServiceReport(ServiceReport serviceReport);
}
