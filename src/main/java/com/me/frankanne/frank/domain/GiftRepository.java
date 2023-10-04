package com.me.frankanne.frank.domain;

import java.util.UUID;

public interface GiftRepository {
    Gift find(UUID id) throws Exception;

    void save(Gift gift);
}
