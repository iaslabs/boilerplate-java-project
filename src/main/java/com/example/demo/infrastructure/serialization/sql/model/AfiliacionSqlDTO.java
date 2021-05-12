package com.example.demo.infrastructure.serialization.sql.model;

import com.example.demo.application.domain.NumeroPoliza;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class AfiliacionSqlDTO {
    @Id
    private NumeroPoliza number;
    private Instant createdAt;
    private Instant validoHasta;

    public AfiliacionSqlDTO(NumeroPoliza number, Instant createdAt, Instant validoHasta) {
        this.number = number;
        this.createdAt = createdAt;
        this.validoHasta = validoHasta;
    }

    public AfiliacionSqlDTO() {
    }

    public NumeroPoliza getNumber() {
        return number;
    }

    public void setNumber(NumeroPoliza number) {
        this.number = number;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getValidoHasta() {
        return validoHasta;
    }

    public void setValidoHasta(Instant validoHasta) {
        this.validoHasta = validoHasta;
    }
}
