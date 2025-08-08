package com.namarahul.namarahulcollab.dto.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * DTO for representing error responses in the API.
 * Contains details about the error such as timestamp, status, error type, and message.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    /**
     * Timestamp of when the error occurred.
     * This is typically the current date and time when the error is generated.
     */
    private LocalDateTime timestamp;

    /**
     * HTTP status code representing the error.
     * This indicates the type of error, such as 404 for Not Found or 500 for Internal Server Error.
     */
    private int status;

    /**
     * Type of error that occurred.
     * This is a brief description of the error, such as "Not Found" or "Internal Server Error".
     */
    private String error;

    /**
     * Detailed message describing the error.
     * This provides additional context or information about the error that occurred.
     */
    private String message;
}
