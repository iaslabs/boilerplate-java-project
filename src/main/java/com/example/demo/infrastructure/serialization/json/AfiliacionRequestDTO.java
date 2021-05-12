package com.example.demo.infrastructure.serialization.json;

public class AfiliacionRequestDTO {
    private String userName;
    private String userId;

    public AfiliacionRequestDTO() {
    }

    public AfiliacionRequestDTO(String userName, String userId) {
        this.userName = userName;
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
