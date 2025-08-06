package com.namarahul.namarahulcollab.service;

import com.namarahul.namarahulcollab.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestRepository testRepository;

    /**
     * This method retrieves a test message from the TestRepository.
     *
     * @return A string message for testing purposes.
     */
    public String getTestMessage() {

        return testRepository.fetchTestMessage();
    }
}
