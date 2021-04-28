package com.example.demo.application.ports.in;

import com.example.demo.application.commons.operation.UseCase;
import com.example.demo.application.domain.Calculation;
import com.example.demo.application.domain.ServiceInformation;
import com.example.demo.application.model.CalculateHoursRequest;
import com.example.demo.application.model.CalculateHoursResponse;

public interface CalculateHoursUseCase extends UseCase<CalculateHoursRequest, CalculateHoursResponse> {

}
