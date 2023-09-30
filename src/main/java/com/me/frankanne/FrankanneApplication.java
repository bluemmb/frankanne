package com.me.frankanne;

import com.me.frankanne.common.EventsPublisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class FrankanneApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrankanneApplication.class, args);
	}

	@Bean
	public CommandLineRunner eventRun(ApplicationContext ctx, EventsPublisher publisher)
	{
		return args -> {
			SampleEvent event = new SampleEvent();
			publisher.publish(event);
		};
	}

	@EventListener
	public void listener(SampleEvent sampleEvent)
	{
		System.out.println("I got an event with uuid: " + sampleEvent.getEventId());
	}
}
