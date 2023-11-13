package com.mark.valkanouski.interview.schedular.exeption;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResourceNotFoundException extends RuntimeException {
    private String message;
    private HttpStatus code;

    public ResourceNotFoundException(String message, HttpStatus code) {
        this.message = message;
        this.code = code;
    }
}
