package com.me.frankanne.common;

import java.util.ArrayList;

public interface EventsPublisher {
    void publish(DomainEvent event);

    default void publish(ArrayList<DomainEvent> events) {
        events.forEach(this::publish);
    }
}
