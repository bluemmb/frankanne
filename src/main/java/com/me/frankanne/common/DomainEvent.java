package com.me.frankanne.common;

import java.time.Instant;
import java.util.UUID;

public interface DomainEvent {
    UUID getEventId();

    UUID getAggregateId();

    Instant getWhen();
}
