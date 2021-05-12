package com.example.demo.infrastructure.adapters.in;

import com.example.demo.application.commons.operation.credentials.AnonymousCredentials;
import com.example.demo.application.domain.UserId;
import com.example.demo.application.domain.UserName;
import com.example.demo.application.model.AfiliacionRequest;
import com.example.demo.application.model.AfiliacionResponse;
import com.example.demo.application.ports.in.AfiliarUsuarioUseCase;
import com.example.demo.infrastructure.commons.HttpUseCase;
import com.example.demo.infrastructure.serialization.json.AfiliacionRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/afilicion")
public class AfiliacionController {
    private final AfiliarUsuarioUseCase afiliarUsuarioUseCase;

    public AfiliacionController(AfiliarUsuarioUseCase afiliarUsuarioUseCase) {
        this.afiliarUsuarioUseCase = afiliarUsuarioUseCase;
    }

    @PostMapping
    public ResponseEntity<AfiliacionResponse> afiliarUsuario(
            @RequestBody AfiliacionRequestDTO request
    ) {
        // httpRequest[body, queryParams, urlParams]
        // ----- credentials
        //  -> INPUT
        //  -> useCase.execute
        //  -> Output
        //      -- Error Handling
        //  ->

        return HttpUseCase.executeUseCase(
                afiliarUsuarioUseCase,
                new AnonymousCredentials(),
                () -> new AfiliacionRequest(
                        new UserName(request.getUserName()),
                        new UserId(request.getUserId())
                )
        );
    }
}
