package com.cobot00.csv2json;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Csv2JsonApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Csv2JsonApplication.class, args);
        Csv2JsonApplication app = context.getBean(Csv2JsonApplication.class);
        app.run();
    }

    public void run() {
        System.exit(0);
    }
}
