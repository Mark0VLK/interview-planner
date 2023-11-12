package com.mark.valkanouski.interview.schedular.exeption;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceNotFoundException extends RuntimeException {
    private String message;
    private String code;

    public ResourceNotFoundException(String message, String code) {
        this.message = message;
        this.code = code;
    }
}
