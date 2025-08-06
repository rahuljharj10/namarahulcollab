package com.namarahul.namarahulcollab.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TestEntity is a simple entity class for demonstration purposes.
 * It contains a single field 'message' to hold a string message.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestEntity {

    /**
     * The message field holds a string message.
     */
    private String message;
}
