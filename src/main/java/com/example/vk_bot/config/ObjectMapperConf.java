package com.example.vk_bot.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectMapperConf {
    @Bean
    public ObjectMapper mapper() {
        return new ObjectMapper();
    }
}
