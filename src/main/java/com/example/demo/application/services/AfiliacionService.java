package com.example.demo.application.services;

import com.example.demo.application.commons.operation.credentials.ApplicationCredentials;
import com.example.demo.application.errors.UserAlreadyExistsError;
import com.example.demo.application.model.AfiliacionRequest;
import com.example.demo.application.model.AfiliacionResponse;
import com.example.demo.application.ports.in.AfiliarUsuarioUseCase;
import com.example.demo.application.ports.out.ClientRepository;
import com.example.demo.commons.Preconditions;

import java.util.Optional;

public class AfiliacionService implements AfiliarUsuarioUseCase {
    private final ClientRepository clientRepository;

    public AfiliacionService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    @Override
    public AfiliacionResponse execute(AfiliacionRequest afiliacionRequest, ApplicationCredentials credentials) {
        Preconditions.checkNotNull(afiliacionRequest, "Afiliación request can not be null");
        Preconditions.checkNotNull(credentials, "Credentials can not be null");


        Optional<Object> userById = clientRepository.getUserById(afiliacionRequest.getUserId());

        if (userById.isPresent()) {
            throw new UserAlreadyExistsError(afiliacionRequest.getUserId());
        }

        // business logic
        return null;
    }
}
