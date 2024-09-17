package com.example.restdemo.exception;

import org.springframework.http.HttpStatus;

public class cloudVendorException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    public cloudVendorException(HttpStatus httpStatus, String message, Throwable throwable) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.throwable = throwable;
    }
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }


}
