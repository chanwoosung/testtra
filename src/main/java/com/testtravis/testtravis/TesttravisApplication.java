package com.testtravis.testtravis;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TesttravisApplication {
    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
            + "/app/config/springboot-webservice/real-application.yml";
    public static void main(String[] args) {
        new SpringApplicationBuilder(TesttravisApplication.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }
}
