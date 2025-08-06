package com.namarahul.namarahulcollab.client;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * TestClient is a component that uses RestTemplate to make HTTP requests.
 * It contains a method to perform a dummy call to an external API.
 */
@Component
@RequiredArgsConstructor
public class TestClient {

    private final RestTemplate restTemplate;

    /**
     * This method performs a dummy HTTP GET request to an external API.
     * It returns the response body as a String.
     *
     * @return The response body from the external API.
     */
    public String dummyCall() {

        String url = "https://jsonplaceholder.typicode.com/todos/1";

        return restTemplate.exchange(url, HttpMethod.GET, null, String.class).getBody();
    }
}
