package com.namarahul.namarahulcollab.dto.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * TestDTO is a simple Data Transfer Object for test responses.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestDTO {

    /**
     * The message for the test response.
     */
    private String message;
}
