package com.example.demo.old.model.calculation.specification;

import com.example.demo.old.model.calculation.HourType;

import java.time.LocalTime;

public interface HoursGroupSpec {
    HourType hourType();

    LocalTime initHour();

    LocalTime endHour();
}
