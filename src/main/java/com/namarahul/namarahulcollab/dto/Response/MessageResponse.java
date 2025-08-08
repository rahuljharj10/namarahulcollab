package com.namarahul.namarahulcollab.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * TestDTO is a Data Transfer Object used for testing purposes.
 * It contains a single field 'message' to hold a string message.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MessageResponse {

    /**
     * The message field holds a string message.
     */
    private String message;
}
