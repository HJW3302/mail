package com.boot.config.core;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatasourceConfig {
    @Bean
    @ConfigurationProperties(prefix ="jdbc")
    public DatasourceProperties datasour(){
        return new DatasourceProperties();
    }
}
