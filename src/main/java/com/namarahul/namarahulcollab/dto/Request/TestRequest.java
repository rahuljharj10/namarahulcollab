package com.namarahul.namarahulcollab.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * TestRequest is a DTO for incoming test requests.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class TestRequest {

    /**
     * The message to be sent in the request.
     */
    private String message;
}
