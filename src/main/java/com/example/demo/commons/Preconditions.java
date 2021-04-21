package com.example.demo.commons;

public class Preconditions {

    private Preconditions() {}

    public static void isTrue(boolean condition, String message) {
        if (!condition) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void checkNotNull(Object object, String message) {
        if(object == null) {
            throw new NullPointerException(message);
        }
    }
}
