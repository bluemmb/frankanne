package com.me.frankanne;

import com.me.frankanne.common.DomainEvent;
import com.me.frankanne.frank.domain.Gift;
import lombok.AllArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
public class SampleEvent implements DomainEvent {
    Gift gift;

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

    public Gift getGift() {
        return gift;
    }
}
