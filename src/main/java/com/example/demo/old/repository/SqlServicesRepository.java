package com.example.demo.old.repository;

import com.example.demo.old.model.ServiceReport;
import com.example.demo.old.model.TechnicianId;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

@Repository
public class SqlServicesRepository implements ServicesRepository {
    private final JdbcTemplate jdbcTemplate;

    public SqlServicesRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<ServiceReport> getReportsByTechnicianId(TechnicianId technicianId, LocalDate weekDate) {
        Pair<LocalDateTime, LocalDateTime> weekDates = getWeekDates(weekDate);
        PreparedStatementSetter preparedStatementSetter = ps -> {
            ps.setString(1, technicianId.getValue());
            ps.setTimestamp(2, Timestamp.valueOf(weekDates.getLeft()));
            ps.setTimestamp(3, Timestamp.valueOf(weekDates.getRight()));
        };
        RowMapper<ServiceReport> rowMapper = (rs, rowNum) -> {
            return new ServiceReport(
                    UUID.fromString(rs.getString("id")),
                    new TechnicianId(rs.getString("technicianId")),
                    rs.getString("serviceId"),
                    rs.getTimestamp("initDateTime").toLocalDateTime(),
                    rs.getTimestamp("endDateTime").toLocalDateTime()
            );
        };
        String query = "SELECT * FROM SERVICES WHERE technicianId = ? AND initDateTime > ? AND endDateTime < ?";
        return jdbcTemplate.query(
                query,
                preparedStatementSetter,
                rowMapper
        );
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
        TemporalField dayOfWeek = WeekFields.of(Locale.getDefault()).dayOfWeek();
        LocalDateTime initialDate = localDate.with(dayOfWeek, 1).atStartOfDay();
        LocalDateTime endDate = localDate.with(dayOfWeek, 7).atTime(LocalTime.MAX);
        return Pair.of(initialDate, endDate);
    }
}
