package com.me.frankanne.common;

import org.springframework.context.ApplicationEventPublisher;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ForwardEventPublisher implements EventsPublisher {
    private final ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void publish(DomainEvent event) {
        applicationEventPublisher.publishEvent(event);
    }
}
