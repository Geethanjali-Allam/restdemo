package com.example.restdemo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class CloudVendorExceptionHandler {
    @ExceptionHandler(value = {cloudVendorNotFoundException.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundException(cloudVendorNotFoundException cloudVendorNotFoundException){
        cloudVendorException cloudVendorException = new cloudVendorException(
                HttpStatus.NOT_FOUND, cloudVendorNotFoundException.getMessage(), cloudVendorNotFoundException.getCause()
                );
        return new ResponseEntity<>(cloudVendorException, HttpStatus.NOT_FOUND);
    }
}
