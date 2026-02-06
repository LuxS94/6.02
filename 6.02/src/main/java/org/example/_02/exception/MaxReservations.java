package org.example._02.exception;

public class MaxReservations extends RuntimeException {
    public MaxReservations(String message) {
        super(message);
    }
}
