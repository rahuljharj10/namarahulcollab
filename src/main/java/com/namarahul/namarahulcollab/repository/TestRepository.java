package com.namarahul.namarahulcollab.repository;

import com.namarahul.namarahulcollab.constants.Constants;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

    /**
     * This method simulates fetching a test message.
     *
     * @return A string message for testing purposes.
     */
    public String fetchTestMessage() {

        return Constants.TEST_MESSAGE;
    }
}
