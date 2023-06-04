package com.payment.service.controller;

import com.payment.service.exception.RequestException;
import com.payment.service.model.dto.ErrorDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(value= RequestException.class)
    public ResponseEntity<ErrorDto>runtimeExceptionHandler(RequestException ex){
        ErrorDto error=ErrorDto.builder().code(ex.getCode()).message(ex.getMessage()).build();
        return new ResponseEntity<>(error, ex.getStatus());
    }
}
