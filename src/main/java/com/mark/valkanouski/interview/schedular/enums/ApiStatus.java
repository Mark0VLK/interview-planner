package com.mark.valkanouski.interview.schedular.enums;

public enum ApiStatus {
    SUCCESS("Success"),
    FAILURE("Failure");
    private final String value;

    ApiStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
