package com.example.demo.common.handler;

import com.example.demo.common.ErrorResult;
import com.example.demo.exception.EmployeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseBody
    public ResponseEntity<ErrorResult> handleException(EmployeeNotFoundException e) {
        ErrorResult err = ErrorResult.builder().errorCode("1234").errMsg(e.getMessage()).build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<ErrorResult> handleException(Exception e) {
        ErrorResult commonError = ErrorResult.builder().errorCode("1000").errMsg(e.getMessage()).build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(commonError);
    }

}
