package com.intuit.timesheets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TimeSheetsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimeSheetsApplication.class, args);
    }

}
