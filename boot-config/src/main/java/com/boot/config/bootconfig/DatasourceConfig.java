package com.boot.config.bootconfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatasourceConfig {
    @Bean
    @ConfigurationProperties(prefix = "gerry.datasource")
    public DatasourceProperties dp(){
        return new DatasourceProperties();
    }
}
