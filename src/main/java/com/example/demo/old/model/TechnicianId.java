package com.example.demo.old.model;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import java.util.Objects;

public class TechnicianId {
    private final String value;

    public TechnicianId(String value) {
        Validate.notNull(value, "Technician Id can not be null");
        Validate.isTrue(StringUtils.isNotBlank(value), "Technician id can not be blank.");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TechnicianId that = (TechnicianId) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "TechnicianId{" +
                "value='" + value + '\'' +
                '}';
    }
}
