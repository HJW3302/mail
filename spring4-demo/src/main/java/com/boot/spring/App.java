package com.boot.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.boot.spring");
        User user = context.getBean(User.class);
        System.out.println(user);
        context.close();
    }
}
