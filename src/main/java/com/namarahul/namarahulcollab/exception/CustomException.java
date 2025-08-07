package com.namarahul.namarahulcollab.exception;

/**
 * CustomException is a runtime exception used for custom error handling in the application.
 * Extend this exception to provide specific error messages for business logic failures.
 */
public class CustomException extends RuntimeException {

    /**
     * Constructs a new CustomException with the specified detail message.
     *
     * @param message the detail message for the exception
     */
    public CustomException(String message) {
        super(message);
    }
}