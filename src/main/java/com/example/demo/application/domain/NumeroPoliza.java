package com.example.demo.application.domain;

import com.example.demo.commons.Preconditions;

public class NumeroPoliza {
    private final int value;

    public NumeroPoliza(int value) {
        Preconditions.isTrue(value > 0, "El numero de poliza no es valido");
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "NumeroPoliza{" +
                "value=" + value +
                '}';
    }
}
