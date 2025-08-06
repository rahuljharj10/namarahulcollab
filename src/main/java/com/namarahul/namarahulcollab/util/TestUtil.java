package com.namarahul.namarahulcollab.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * TestUtil is a utility class that provides static methods for testing purposes.
 * It is marked as private to prevent instantiation.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TestUtil {

    /**
     * This method returns a static test message.
     * It is used for testing purposes to verify that the method can be called successfully.
     *
     * @return A string message indicating that the method has been called successfully.
     */
    public static String getTestMessage() {

        return "This is a static test message.";
    }
}
