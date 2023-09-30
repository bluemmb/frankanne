package com.me.frankanne;

import com.me.frankanne.anne.Anne;
import com.me.frankanne.common.EventsPublisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FrankanneApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
			.parent(FrankanneApplication.class)
			.child(Anne.class)
			.run(args);
	}

	@Bean
	public CommandLineRunner eventRun(EventsPublisher publisher)
	{
		return args -> {
			SampleEvent event = new SampleEvent();
			publisher.publish(event);
		};
	}
}
