package com.example.demo.application.domain;

import java.time.Instant;
import java.util.Objects;

public class Poliza {
    private final NumeroPoliza number;
    private final Instant createdAt;
    private final Instant validoHasta;

    public Poliza(NumeroPoliza number, Instant createdAt, Instant validoHasta) {
        this.number = Objects.requireNonNull(number);
        this.createdAt = Objects.requireNonNull(createdAt);
        this.validoHasta = Objects.requireNonNull(validoHasta);
    }

    public NumeroPoliza getNumber() {
        return number;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getValidoHasta() {
        return validoHasta;
    }
}
