package com.namarahul.namarahulcollab.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class CaffeineCacheConfiguration {

//    @Bean
//    public Caffeine<Object, Object> caffeineConfig() {
//        return Caffeine.newBuilder()
//                .expireAfterWrite(10, TimeUnit.MINUTES)
//                .maximumSize(100);
//    }

    @Bean
    public Caffeine caffeineConfig() {
        return Caffeine.newBuilder().expireAfterWrite(60, TimeUnit.MINUTES);
    }

    @Bean
    public CacheManager cacheManager(Caffeine caffeine) {
        CaffeineCacheManager caffeineCacheManager = new CaffeineCacheManager();
        caffeineCacheManager.setCaffeine(caffeine);
        return caffeineCacheManager;
    }

//    @Bean
//    public CacheManager cacheManager(Caffeine<Object, Object> caffeine) {
//
//        CaffeineCacheManager cacheManager = new CaffeineCacheManager("myCache");
//        cacheManager.setCaffeine(caffeine);
//
//        return cacheManager;
//    }
}
