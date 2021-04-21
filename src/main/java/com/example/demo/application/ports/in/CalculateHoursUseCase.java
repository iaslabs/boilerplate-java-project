package com.example.demo.application.ports.in;

import com.example.demo.application.domain.Calculation;
import com.example.demo.application.domain.ServiceInformation;

public interface CalculateHoursUseCase {
    Calculation execute(ServiceInformation information);
}
