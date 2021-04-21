package com.example.demo.old.model.calculation.specification;

import com.example.demo.old.model.calculation.HourType;

import java.time.LocalTime;

public class NormalHoursSpec implements HoursGroupSpec {

    @Override
    public HourType hourType() {
        return HourType.NORMAL;
    }

    @Override
    public LocalTime initHour() {
        return LocalTime.of(7, 0);
    }

    @Override
    public LocalTime endHour() {
        return LocalTime.of(20, 0);
    }
}
