package com.namarahul.namarahulcollab.exception;

/**
 * Abstract class representing a Not Found exception.
 * This class extends RuntimeException and can be used to indicate
 * that a requested resource was not found.
 */
public abstract class NotFoundException extends RuntimeException {

    /**
     * Constructor for NotFoundException.
     * Initializes the exception with a specific message.
     *
     * @param message The detail message for the exception.
     */
    public NotFoundException(String message) {
        super(message);
    }
}
