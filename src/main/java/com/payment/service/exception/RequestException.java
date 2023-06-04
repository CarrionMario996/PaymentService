package com.payment.service.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class RequestException extends RuntimeException{
    private String code;
    private HttpStatus status;

    public RequestException(String message, String code,HttpStatus status) {
        super(message);
        this.status=status;
        this.code = code;
    }
}
