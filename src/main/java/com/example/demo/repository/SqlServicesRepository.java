package com.example.demo.repository;

import com.example.demo.model.ServiceReport;
import com.example.demo.model.TechnicianId;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

@Repository
public class SqlServicesRepository implements ServicesRepository {
    private final JdbcTemplate jdbcTemplate;

    public SqlServicesRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<ServiceReport> getReportsByTechnicianId(TechnicianId technicianId, LocalDate weekDate) {
        PreparedStatementSetter preparedStatementSetter = ps -> {
            ps.setString(1, technicianId.getValue());

        };
        RowMapper<ServiceReport> rowMapper = (rs, rowNum) -> {
            return null;
        };
        String query = "SELECT * FROM SERVICES WHERE technicianId = ? AND initDateTime > ? AND endDateTime < ?";
        jdbcTemplate.query(
                query,
                preparedStatementSetter,
                rowMapper
        );
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


    private Pair<LocalDateTime, LocalDateTime> getWeekDates(LocalDate localDate) {
        Objects.requireNonNull(localDate);
        TemporalField weekOfYear = WeekFields.of(Locale.getDefault()).weekOfYear();
        localDate.get(weekOfYear);
        LocalDateTime initialDate = null;
        LocalDateTime endDate = null;
        return Pair.of(initialDate, endDate);
    }
}
