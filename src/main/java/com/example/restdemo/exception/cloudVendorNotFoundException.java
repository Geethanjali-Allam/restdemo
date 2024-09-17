package com.example.restdemo.exception;

public class cloudVendorNotFoundException extends RuntimeException {
    public cloudVendorNotFoundException(String message) {
        super(message);
    }

    public cloudVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
