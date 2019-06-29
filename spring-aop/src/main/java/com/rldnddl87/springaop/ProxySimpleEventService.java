package com.rldnddl87.springaop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import sun.java2d.pipe.SpanShapeRenderer;

@Primary
@Service
public class ProxySimpleEventService implements EventService {

    @Autowired
    SimpleEventService simpleEventService;

    @Override
    public void createEvent() {
        long begin = System.currentTimeMillis();
        simpleEventService.createEvent();
        System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void publishEvent() {
        long begin = System.currentTimeMillis();
        simpleEventService.publishEvent();
        System.out.println(System.currentTimeMillis() - begin);
    }

    @Override
    public void deleteEvent() {
        simpleEventService.deleteEvent();
    }
}
