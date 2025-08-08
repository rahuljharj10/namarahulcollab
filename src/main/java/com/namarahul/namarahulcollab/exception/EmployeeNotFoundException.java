package com.namarahul.namarahulcollab.exception;

/**
 * Custom exception class for handling cases where an employee is not found.
 * This exception extends RuntimeException and can be thrown when an employee
 * with a specific ID does not exist in the system.
 */
public class EmployeeNotFoundException extends NotFoundException {

    /**
     * Default constructor for EmployeeNotFoundException.
     * Initializes the exception with a default message.
     */
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
