package com.me.frankanne.anne;

import com.me.frankanne.frank.domain.GiftCreatedEvent;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
@EnableAutoConfiguration
public class Anne {

    @EventListener
    public void listener(GiftCreatedEvent sampleEvent)
    {
        System.out.println("Anne got a gift with uuid: " + sampleEvent.getGift().getGiftId());
    }
}
