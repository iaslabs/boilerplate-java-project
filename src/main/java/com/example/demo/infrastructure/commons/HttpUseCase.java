package com.example.demo.infrastructure.commons;


import com.example.demo.application.commons.operation.ApplicationRequest;
import com.example.demo.application.commons.operation.ApplicationResponse;
import com.example.demo.application.commons.operation.UseCase;
import com.example.demo.application.commons.operation.credentials.ApplicationCredentials;
import com.example.demo.application.commons.operation.errors.ApplicationError;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.http.ResponseEntity;

import java.util.function.Supplier;

public class HttpUseCase {

    private HttpUseCase() {
        throw new NotImplementedException();
    }

    public static <INPUT extends ApplicationRequest, OUTPUT extends ApplicationResponse> ResponseEntity<OUTPUT> executeUseCase(
            UseCase<INPUT, OUTPUT> useCase,
            ApplicationCredentials credentials,
            Supplier<INPUT> inputSupplier
    ) {
        try {
            INPUT input = inputSupplier.get();
            OUTPUT execute = useCase.execute(input, credentials);
            return ResponseEntity.ok(execute);
        } catch (ApplicationError exception) {
            return ResponseEntity.status(exception.statusCode())
                    .body(null);
        } catch (RuntimeException e) {
            return ResponseEntity.status(500)
                    .body(null);
        }
    }


}
