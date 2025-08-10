package com.namarahul.namarahulcollab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class NamarahulcollabApplication {

    public static void main(String[] args) {
        SpringApplication.run(NamarahulcollabApplication.class, args);
    }

}
