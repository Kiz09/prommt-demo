package com.prommt.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class PaymentControllerExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ErrorResponse handlerEception(Exception e){
        return ErrorResponse.builder(e, HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage()).build();
    }

}
