package com.web.exception;

public class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
}