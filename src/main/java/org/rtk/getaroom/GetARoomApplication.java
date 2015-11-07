package org.rtk.getaroom;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GetARoomApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetARoomApplication.class, args);
    }

    @Bean
    public StartupRunner schedulerRunner() {
        return new StartupRunner();
    }

    @Bean
    public CommandLineRunner configValuePrinter(@Value("${my.config.value:}") String configValue) {
        return args -> LogFactory.getLog(getClass()).info("Value of my.config.value property is: " + configValue);
    }
}
