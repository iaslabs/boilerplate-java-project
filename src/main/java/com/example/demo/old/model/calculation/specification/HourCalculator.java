package com.example.demo.old.model.calculation.specification;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class HourCalculator {

    private HourCalculator() {
        throw new UnsupportedOperationException();
    }

    public static Set<LocalDateTime> createHoursStream(LocalDateTime init, LocalDateTime end) {
        long hoursDifference = ChronoUnit.HOURS.between(init, end);
        return LongStream.range(0, hoursDifference)
                .mapToObj(value -> init.plusHours(value)
                        .withMinute(0)
                        .withSecond(0)
                        .withNano(0))
                .collect(Collectors.toSet());
    }


    public static Integer amountOfHoursWorked(
            HoursGroupSpec spec,
            LocalDateTime init,
            LocalDateTime end
    ) {
        var workedSet = createHoursStream(init, end);

        var daysDifference = ChronoUnit.DAYS.between(
                init.toLocalDate(),
                end.toLocalDate()
        );
        return LongStream.rangeClosed(0, daysDifference)
                .mapToInt(value -> {
                    LocalDateTime baseLocalDateTime = init
                            .plusDays(value);
                    var allowedInit = baseLocalDateTime
                            .with(spec.initHour());
                    var allowedEnd = baseLocalDateTime
                            .with(spec.endHour());
                    var allowedRangeByDay = createHoursStream(
                            allowedInit,
                            allowedEnd
                    );
                    return intersect(workedSet, allowedRangeByDay)
                            .size();
                })
                .sum();
    }


    private static <T> Set<T> intersect(Set<T> A, Set<T> B) {
        Set<T> rtnList = new HashSet<>();
        for (T dto : A) {
            if (B.contains(dto)) {
                rtnList.add(dto);
            }
        }
        return rtnList;
    }
}
