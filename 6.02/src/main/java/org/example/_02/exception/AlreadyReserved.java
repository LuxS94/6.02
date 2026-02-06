package org.example._02.exception;

public class AlreadyReserved extends RuntimeException {
    public AlreadyReserved(String message) {
        super(message);
    }
}
