package com.mark.valkanouski.interview.schedular.exeption;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.mark.valkanouski.interview.schedular.util.ResponseUtil;
import com.mark.valkanouski.interview.schedular.dto.ResponseDto;

@ControllerAdvice
@Slf4j
public class InterviewSchedulerExceptionHandler {
    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<ResponseDto<?>> notFoundException(ResourceNotFoundException notFoundException) {
        log.info("Resource not found");
        return new ResponseEntity<>(ResponseUtil.getFailureResponse(notFoundException.getMessage()), notFoundException.getCode());
    }
}
