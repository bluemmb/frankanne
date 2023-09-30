
package com.me.frankanne.frank;

import com.me.frankanne.SampleEvent;
import com.me.frankanne.common.DomainEventsConfig;
import com.me.frankanne.common.EventsPublisher;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Configuration
@EnableAutoConfiguration
@Controller
@Import({
        DomainEventsConfig.class,
})
@AllArgsConstructor
public class Frank {

    private EventsPublisher publisher;

    @GetMapping("/frank/send")
    ResponseEntity<String> send() {
        SampleEvent event = new SampleEvent();
        publisher.publish(event);

        return ResponseEntity.ok("Sent");
    }
}
