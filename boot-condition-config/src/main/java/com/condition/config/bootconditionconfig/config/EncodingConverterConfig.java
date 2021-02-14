package com.condition.config.bootconditionconfig.config;

import com.condition.config.bootconditionconfig.condition.GBKCondition;
import com.condition.config.bootconditionconfig.condition.UTF8Condition;
import com.condition.config.bootconditionconfig.converter.EncodingConverter;
import com.condition.config.bootconditionconfig.converter.GBKEncodingConverter;
import com.condition.config.bootconditionconfig.converter.UTF8EncodingConverter;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * 使用按照条件装配的过程：
 * 1、@Conditional [value值必须是实现Condition接口的类]
 * 2、根据接口中的matches方法的返回结果确定是否装配bean对象到spring容器中
 * false 不装配 ，true 就会装配到spring 容器中
 */
@SpringBootConfiguration
public class EncodingConverterConfig {
    @Bean
    @Conditional(UTF8Condition.class)
    public EncodingConverter createUTF8Converter(){
        return new UTF8EncodingConverter();
    }
    @Bean
    @Conditional(GBKCondition.class)
    public EncodingConverter createGBKConverter(){
        return new GBKEncodingConverter();
    }
}
