package com.bluecomet.accounts.exception;

import com.bluecomet.accounts.model.exchange.ErrorResponseEXG;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomerAlreadyExistsException.class)
    public ResponseEntity<ErrorResponseEXG> handleCustomerAlreadyExistsException (CustomerAlreadyExistsException exception, WebRequest request) {
        ErrorResponseEXG errorResponseEXG = new ErrorResponseEXG(
                request.getDescription(false),
                HttpStatus.BAD_REQUEST,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseEXG, HttpStatus.BAD_REQUEST);
    }
}
