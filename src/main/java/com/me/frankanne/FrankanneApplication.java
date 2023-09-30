package com.me.frankanne;

import com.me.frankanne.anne.Anne;
import com.me.frankanne.frank.Frank;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class FrankanneApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
			.parent(FrankanneApplication.class)
			.child(Frank.class).web(WebApplicationType.SERVLET)
			.sibling(Anne.class).web(WebApplicationType.NONE)
			.run(args);
	}
}
