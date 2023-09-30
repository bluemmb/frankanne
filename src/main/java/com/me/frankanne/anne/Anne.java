package com.me.frankanne.anne;

import com.me.frankanne.SampleEvent;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
@EnableAutoConfiguration
public class Anne {

    @EventListener
    public void listener(SampleEvent sampleEvent)
    {
        System.out.println("Anne got an event with uuid: " + sampleEvent.getEventId());
    }
}
