package com.example.demo.common.handler;

import com.example.demo.common.ErrorResult;
import com.example.demo.exception.EmployeeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResult handleException(EmployeeNotFoundException e) {
        return ErrorResult.builder().errorCode("1234").errMsg(e.getMessage()).build();
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResult handleException(Exception e) {
        return ErrorResult.builder().errorCode("1000").errMsg(e.getMessage()).build();
    }

}
