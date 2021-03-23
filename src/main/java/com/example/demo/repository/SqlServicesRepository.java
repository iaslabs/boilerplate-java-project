package com.example.demo.repository;

import com.example.demo.model.ServiceReport;
import com.example.demo.model.TechnicianId;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class SqlServicesRepository implements ServicesRepository {
    private final JdbcTemplate jdbcTemplate;

    public SqlServicesRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<ServiceReport> getReportsByTechnicianId(TechnicianId technicianId, int weekNumber) {
        jdbcTemplate.query("SELECT * FROM SERVICES WHERE technicianId = ? AND initDateTime > ? AND endDateTime < ?", ps -> {}, (rs, rowNum) -> {


        });
        return null;
    }

    @Override
    public ServiceReport storeServiceReport(ServiceReport serviceReport) {
        String sql = "INSERT INTO SERVICES(id, serviceId, technicianId, initDateTime, endDateTime) VALUES ( ?, ?, ?, ?, ? )";
        jdbcTemplate.update(sql, ps -> {
            ps.setString(1, serviceReport.getId().toString());
            ps.setString(2, serviceReport.getServiceId());
            ps.setString(3, serviceReport.getTechnicianId().getValue());
            ps.setTimestamp(4, Timestamp.valueOf(serviceReport.getStartDate()));
            ps.setTimestamp(5, Timestamp.valueOf(serviceReport.getEndDate()));
        });
        return serviceReport;
    }
}
