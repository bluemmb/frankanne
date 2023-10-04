package com.me.frankanne.frank.infra;

import com.me.frankanne.frank.domain.Gift;
import com.me.frankanne.frank.domain.GiftRepository;

import java.util.UUID;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

@AllArgsConstructor
public class GiftDatabaseRepository implements GiftRepository {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public Gift find(UUID id) throws Exception {
        Gift gift = jdbcTemplate.queryForObject(
                "select * from gifts where gifts.gift_id = ?",
                new BeanPropertyRowMapper<>(Gift.class),
                id.toString()
        );

        if (gift == null) {
            throw new Exception("Gift was not found!");
        }

        return gift;
    }

    @Override
    public void save(Gift gift) {
        jdbcTemplate.update(
                "INSERT INTO gifts (gift_id, content) values (?, ?)",
                gift.getGiftId(), gift.getContent()
        );
    }
}
