package com.condition.config.bootconditionconfig.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(BeanImportSelector.class)
public class ImportApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ImportApplication.class);
        System.out.println(context.getBean(User.class));
        System.out.println(context.getBean(Book.class));

        context.close();


    }
}
