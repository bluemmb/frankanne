package com.me.frankanne;

import com.me.frankanne.common.DomainEvent;

import java.time.Instant;
import java.util.UUID;

public class SampleEvent implements DomainEvent {
    @Override
    public UUID getEventId() {
        return UUID.randomUUID();
    }

    @Override
    public UUID getAggregateId() {
        return UUID.randomUUID();
    }

    @Override
    public Instant getWhen() {
        return Instant.now();
    }
}
