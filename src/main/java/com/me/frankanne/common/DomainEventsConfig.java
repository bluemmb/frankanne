package com.me.frankanne.common;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainEventsConfig {

    @Bean
    EventsPublisher domainEvents(ApplicationEventPublisher applicationEventPublisher) {
        return new ForwardEventPublisher(applicationEventPublisher);
    }
}
