package com.example.demo.infrastructure.serialization.sql.mapper;

import com.example.demo.application.domain.Id;
import com.example.demo.application.domain.ServiceInformation;
import com.example.demo.infrastructure.serialization.sql.model.SqlService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SqlServiceMapper {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

    public static ServiceInformation toDomain(SqlService sqlService) {
        return new ServiceInformation(
                new Id(sqlService.getId()),
                LocalDateTime.parse(sqlService.getInitDate(), formatter),
                LocalDateTime.parse(sqlService.getEndDate(), formatter)
        );
    }


    public static SqlService fromDomain(ServiceInformation serviceInformation) {
        return new SqlService(
                serviceInformation.getPersonId().getValue(),
                formatter.format(serviceInformation.getInitDateTime()),
                formatter.format(serviceInformation.getEndDateTime())
        );
    }
}
