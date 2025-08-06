package com.namarahul.namarahulcollab.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TestDTO is a Data Transfer Object used for testing purposes.
 * It contains a single field 'message' to hold a string message.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestDTO {

    /**
     * The message field holds a string message.
     */
    private String message;
}
