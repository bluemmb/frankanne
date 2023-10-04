
package com.me.frankanne.frank;

import com.me.frankanne.common.DomainEventsConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableAutoConfiguration
@Import({
        DomainEventsConfig.class,
        FrankDatabaseConfig.class,
})
@ComponentScan
public class Frank {
}
