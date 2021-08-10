package com.epam.jwd.firstTask.exception;

public class TooManyDotsException extends Exception {
    private String message;

    public TooManyDotsException(String message) {
        super(message);
        this.message = message;
    }
}
