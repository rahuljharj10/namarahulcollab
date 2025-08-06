package com.namarahul.namarahulcollab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplateConfig is a configuration class that provides a RestTemplate bean.
 * This bean can be used to make HTTP requests in the application.
 */
@Configuration
public class RestTemplateConfig {

    /**
     * This method creates a RestTemplate bean that can be used to make HTTP requests.
     *
     * @return A RestTemplate instance.
     */
    @Bean
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }
}
