package com.example.demo.application.ports.out;

import com.example.demo.application.domain.UserId;

import java.util.Optional;

public interface ClientRepository {
    Optional<Object> getUserById(UserId userId);
}
