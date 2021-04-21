package com.example.demo.infrastructure.serialization.sql.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SqlService {

    @Id
    private String id;
    private String initDate;
    private String endDate;

    public SqlService() {
    }

    public SqlService(String id, String initDate, String endDate) {
        this.id = id;
        this.initDate = initDate;
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInitDate() {
        return initDate;
    }

    public void setInitDate(String initDate) {
        this.initDate = initDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
