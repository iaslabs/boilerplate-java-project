package com.example.demo.application.domain;

public class Calculation {
    private final WeekNumber weekNumber;
    private final Integer total;

    public Calculation(WeekNumber weekNumber, Integer total) {
        this.weekNumber = weekNumber;
        this.total = total;
    }

    public WeekNumber getWeekNumber() {
        return weekNumber;
    }

    public Integer getTotal() {
        return total;
    }
}
