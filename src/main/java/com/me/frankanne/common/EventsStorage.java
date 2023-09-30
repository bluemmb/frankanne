package com.me.frankanne.common;

import java.util.ArrayList;

public interface EventsStorage {
    void store(DomainEvent event);

    ArrayList<DomainEvent> toPublish();

    void published(ArrayList<DomainEvent> events);
}
