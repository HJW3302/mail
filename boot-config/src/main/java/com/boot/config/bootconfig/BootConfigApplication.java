package com.boot.config.bootconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BootConfigApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(BootConfigApplication.class, args);
        //通过spring环境获取对象
        Environment env = context.getEnvironment();
        String ip = env.getProperty("local.ip.addr");
        System.out.println(ip);
        //通过@Value方式获取
        RedisConfig contextBean = context.getBean(RedisConfig.class);
        String namePro = env.getProperty("gerry.name");
        contextBean.show();



        // 通过ConfigurationProperties方式
        DatasourceProperties datasourceProperties = context.getBean(DatasourceProperties.class);
        System.out.println(datasourceProperties);
        context.close();
    }

}
