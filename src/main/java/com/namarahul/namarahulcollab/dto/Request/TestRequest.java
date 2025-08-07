package com.namarahul.namarahulcollab.dto.Request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * TestRequest is a DTO for incoming test requests.
 */
@Getter
@Service
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestRequest {

    /**
     * The message to be sent in the request.
     */
    private String message;
}
