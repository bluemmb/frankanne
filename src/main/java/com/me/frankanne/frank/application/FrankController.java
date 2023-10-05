package com.me.frankanne.frank.application;

import com.me.frankanne.frank.domain.GiftCreatedEvent;
import com.me.frankanne.common.EventsPublisher;
import com.me.frankanne.frank.domain.Gift;
import com.me.frankanne.frank.domain.GiftRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Configuration
@EnableAutoConfiguration
@Controller
@AllArgsConstructor
public class FrankController {
    private EventsPublisher publisher;
    private GiftRepository giftRepository;

    @GetMapping("/frank/send")
    ResponseEntity<String> send() throws Exception {
        Gift gift = new Gift(UUID.randomUUID(), "To Anne");
        giftRepository.save(gift);

        GiftCreatedEvent event = new GiftCreatedEvent(gift);
        publisher.publish(event);

        Gift foundGift = giftRepository.find(gift.getGiftId());

        return ResponseEntity.ok("Sent, found gift: " + foundGift.getGiftId());
    }
}
