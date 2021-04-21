package com.example.demo.old.controller;

import com.example.demo.old.model.ServiceReport;
import com.example.demo.old.services.GetServiceReportsByTechnician;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {
    private final GetServiceReportsByTechnician getServiceReportsByTechnician;

    public ServiceController(GetServiceReportsByTechnician getServiceReportsByTechnician) {
        this.getServiceReportsByTechnician = getServiceReportsByTechnician;
    }


    @GetMapping("/{technicianId}/{weekNumber}")
    public List<ServiceReport> getServicesByTechnician(@RequestParam("technicianId") String technicianId){
       // return getServiceReportsByTechnician.getList(technicianId);
        return List.of();
    }

    @PostMapping
    public void storeServiceReport(@RequestBody ServiceReport report) {
        System.out.println("report = " + report);
    }
}
