package com.example.demo.infrastructure.adapters.in;

import com.example.demo.application.domain.ServiceInformation;
import com.example.demo.application.ports.in.CalculateHoursUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class ServicesController {
    private final CalculateHoursUseCase calculateHoursUseCase;

    public ServicesController(CalculateHoursUseCase calculateHoursUseCase) {
        this.calculateHoursUseCase = calculateHoursUseCase;
    }

    @PostMapping
    public void reportService(@RequestBody ServiceInformation information) {
        calculateHoursUseCase.execute(information);
    }
}
