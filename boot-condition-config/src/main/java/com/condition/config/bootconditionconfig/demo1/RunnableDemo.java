package com.condition.config.bootconditionconfig.demo1;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RunnableDemo implements Runnable{

    @Async
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("---------------"+(i+1));
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
