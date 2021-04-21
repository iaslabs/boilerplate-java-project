package com.example.demo.application.domain;

import com.example.demo.commons.Preconditions;

public class Id {
    private final String value;

    public Id(String value) {
        Preconditions.checkNotNull(value, "El id no puede ser nulo");
        Preconditions.isTrue(value.length() == 8, "El id es invalido");
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
