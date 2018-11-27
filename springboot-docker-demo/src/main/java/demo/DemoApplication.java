package demo;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map.Entry;
import java.util.Properties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.PropertySource;

@Slf4j
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        log.info("## Check args : {}", Arrays.toString(args));
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        log.info("## Active profile : {}", Arrays.toString(ctx.getEnvironment().getActiveProfiles()));
        log.info("## ctx.getEnvironment() : {}", ctx.getEnvironment().getProperty("spring.config.location"));
        log.info("## System.getProperty : {}", System.getProperty("spring.config.location"));

        log.info("-- System.getProperties display --");
        Properties properties = System.getProperties();
        Enumeration<?> names = properties.propertyNames();
        while (names.hasMoreElements()) {
            Object key = names.nextElement();
            log.info("key : {} | value : {}", key, properties.get(key));
        }
        log.info("-------------------------------------");
    }
}
