package com.namarahul.namarahulcollab.exception;

/**
 * TestException is a custom runtime exception used for testing purposes.
 * It extends RuntimeException and can be thrown to indicate an error condition
 * in the application.
 */
public class TestException extends RuntimeException {

    /**
     * Default constructor for TestException.
     * It initializes the exception with no message.
     */
    public TestException(String message) {
        super(message);
    }
}
