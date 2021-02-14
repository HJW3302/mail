package com.boot.config.eventdemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class HandlerEvent {
    @EventListener(MyApplicationEvent.class)
    public void handlerEvent(MyApplicationEvent event ){
        System.out.println("接收到，事件"+event.getClass());
        System.out.println("接收到，事件源"+event.getSource());
    }

    @EventListener(ContextClosedEvent.class)
    public void handlerEvent(Object event){
        System.out.println("接收到，事件"+event.getClass());
    }
}
