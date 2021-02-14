package com.boot.auto.config.bootauto;

import com.boot.config.core.DatasourceProperties;
import com.boot.congif.core.domain.Order;
import com.boot.congif.core.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class BootAutoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BootAutoApplication.class, args);
        System.out.println(context.getBean(Order.class));
        System.out.println(context.getBean(Product.class));
        System.out.println(context.getBean(DatasourceProperties.class).getDriverClassName());
        context.close();

        System.out.println("q启动成功");

    }

}
