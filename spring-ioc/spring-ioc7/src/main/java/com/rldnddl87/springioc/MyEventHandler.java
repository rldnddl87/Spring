package com.rldnddl87.springioc;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler{

    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public void onHandle(MyEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트 받음. 데이터는 " +  event.getData());
    }
}
