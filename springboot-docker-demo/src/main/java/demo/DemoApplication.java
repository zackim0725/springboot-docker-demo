package demo;

import java.util.Arrays;
import java.util.Map.Entry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        log.info("## Active profile : {}", Arrays.toString(ctx.getEnvironment().getActiveProfiles()));
        log.info("## App properties file : {}", System.getProperty("spring.config.location"));
    }
}
