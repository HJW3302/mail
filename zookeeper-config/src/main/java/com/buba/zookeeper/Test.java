package com.buba.zookeeper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        System.out.println("---sptring容器开始启动----");
        ac.start();
        System.out.println("---sptring容器启动----");
        ac.close();

    }
}
