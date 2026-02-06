package org.example._02.exception;

public class InvalidLength extends RuntimeException {
    public InvalidLength(String message) {
        super(message);
    }
}
