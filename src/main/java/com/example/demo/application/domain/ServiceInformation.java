package com.example.demo.application.domain;

import java.time.LocalDateTime;

public class ServiceInformation {
    private final Id personId;
    private final LocalDateTime initDateTime;
    private final LocalDateTime endDateTime;

    public ServiceInformation(Id personId, LocalDateTime initDateTime, LocalDateTime endDateTime) {
        this.personId = personId;
        this.initDateTime = initDateTime;
        this.endDateTime = endDateTime;
    }


    public Id getPersonId() {
        return personId;
    }

    public LocalDateTime getInitDateTime() {
        return initDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }
}
