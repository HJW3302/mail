package com.condition.config.bootconditionconfig.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class BootConditionConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(BootConditionConfigApplication.class, args);
       /* Map<String, EncodingConverter> beansOfType = context.getBeansOfType(EncodingConverter.class);
        System.out.println(beansOfType);

        System.out.println(System.getProperty("file.encoding"));*/
        RunnableDemo bean = context.getBean(RunnableDemo.class);
        System.out.println("start");
        bean.run();
        System.out.println("end");
        context.close();
    }

}
