package com.boot.config.eventdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventDemoApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EventDemoApplication.class);
        //1、添加监听事件
        //app.addListeners(new MyApplicationListener());

        ConfigurableApplicationContext context = app.run(args);
        context.publishEvent(new MyApplicationEvent(new Object()));
        context.close();
    }

}
