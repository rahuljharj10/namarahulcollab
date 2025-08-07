package com.namarahul.namarahulcollab.service;

import com.namarahul.namarahulcollab.dto.Response.MessageResponse;
import com.namarahul.namarahulcollab.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * TestService is a service class that provides methods for testing purposes.
 * It interacts with the TestRepository to fetch test messages.
 */
@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    /**
     * This method retrieves a test message from the TestRepository.
     *
     * @return A string message for testing purposes.
     */
    public MessageResponse getTestMessage() {

        return MessageResponse.builder()
                .message(testRepository.fetchTestMessage())
                .build();
    }
}
