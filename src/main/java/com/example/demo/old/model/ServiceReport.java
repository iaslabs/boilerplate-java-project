package com.example.demo.old.model;

import org.apache.commons.lang3.Validate;

import java.time.LocalDateTime;
import java.util.UUID;


public class ServiceReport {
    private final UUID id;
    private final TechnicianId technicianId;
    private final String serviceId;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;


    public ServiceReport(UUID id, TechnicianId technicianId, String serviceId, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = Validate.notNull(id);
        this.technicianId = Validate.notNull(technicianId, "technicianId can not be null");
        this.serviceId = Validate.notNull(serviceId, "serviceId can not be null");
        this.startDate = Validate.notNull(startDate, "startDate can not be null");
        this.endDate = Validate.notNull(endDate, "endDate can not be null");
    }

    public UUID getId() {
        return id;
    }

    public TechnicianId getTechnicianId() {
        return technicianId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "ServiceReport{" +
                "technicianId='" + technicianId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
