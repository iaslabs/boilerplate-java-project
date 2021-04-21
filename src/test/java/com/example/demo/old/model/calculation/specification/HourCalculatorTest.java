package com.example.demo.old.model.calculation.specification;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class HourCalculatorTest {

    @Test
    void createHoursStream() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        LocalDateTime end = now.plusHours(20);
        System.out.println("end = " + end);
        var hoursStream = HourCalculator.createHoursStream(now, end);
        System.out.println("hoursStream = " + hoursStream);
        Integer integer = HourCalculator.amountOfHoursWorked(new NormalHoursSpec(), now, end);
        System.out.println("integer = " + integer);
    }
}