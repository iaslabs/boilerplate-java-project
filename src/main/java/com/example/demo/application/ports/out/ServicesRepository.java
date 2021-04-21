package com.example.demo.application.ports.out;

import com.example.demo.application.domain.Id;
import com.example.demo.application.domain.ServiceInformation;

import java.util.List;

public interface ServicesRepository {
    void storeService(ServiceInformation information);

    List<Integer> getWeekHours(Id technician);
}
