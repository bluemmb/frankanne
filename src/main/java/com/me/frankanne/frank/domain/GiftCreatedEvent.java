package com.me.frankanne.frank.domain;

import com.me.frankanne.common.DomainEvent;
import com.me.frankanne.frank.domain.Gift;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class GiftCreatedEvent implements DomainEvent {
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
}
