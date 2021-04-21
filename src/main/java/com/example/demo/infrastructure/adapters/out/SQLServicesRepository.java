package com.example.demo.infrastructure.adapters.out;

import com.example.demo.application.domain.Id;
import com.example.demo.application.domain.ServiceInformation;
import com.example.demo.application.ports.out.ServicesRepository;
import com.example.demo.infrastructure.serialization.sql.mapper.SqlServiceMapper;
import com.example.demo.infrastructure.serialization.sql.model.SqlService;

import java.util.List;

public class SQLServicesRepository implements ServicesRepository {

    @Override
    public void storeService(ServiceInformation information) {
        SqlService sqlService = SqlServiceMapper.fromDomain(information);
    }

    @Override
    public List<Integer> getWeekHours(Id technician) {
        return null;
    }
}
