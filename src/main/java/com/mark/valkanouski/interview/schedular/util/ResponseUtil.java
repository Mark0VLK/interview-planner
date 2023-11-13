package com.mark.valkanouski.interview.schedular.util;

import com.mark.valkanouski.interview.schedular.dto.ResponseDto;
import com.mark.valkanouski.interview.schedular.enums.ApiStatus;

import java.util.Collections;


public class ResponseUtil {

    public static ResponseDto<Object> getSuccessResponse(Object data) {
        ResponseDto<Object> response = new ResponseDto<>();
        response.setMessage("Data received successfully");
        response.setStatusCode(ApiStatus.SUCCESS.getValue());
        response.setData(Collections.singleton(data));
        return response;
    }

    public static ResponseDto<?> getFailureResponse(String message) {
        ResponseDto<?> response = new ResponseDto<>();
        response.setMessage(message);
        response.setStatusCode(ApiStatus.FAILURE.getValue());
        return response;
    }
}
