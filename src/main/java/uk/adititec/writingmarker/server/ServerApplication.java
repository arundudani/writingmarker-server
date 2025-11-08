package uk.adititec.writingmarker.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Locale;
import java.util.function.Function;

@SpringBootApplication
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Bean
    public Function<String, String> function() {
        return value -> value.toUpperCase(Locale.ROOT);
    }
}
