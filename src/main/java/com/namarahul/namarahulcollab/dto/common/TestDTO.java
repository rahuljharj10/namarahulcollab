package com.namarahul.namarahulcollab.dto.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * TestDTO is a simple Data Transfer Object for test responses.
 */
@Getter
@Service
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestDTO {

    /**
     * The message for the test response.
     */
    private String message;
}
