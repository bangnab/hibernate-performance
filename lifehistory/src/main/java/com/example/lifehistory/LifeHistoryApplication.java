package com.example.lifehistory;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class LifeHistoryApplication {

    private static Logger logger = LoggerFactory.getLogger(LifeHistoryApplication.class);

    public static void main(String[] args) {
        logger.info("Running Spring version: {}", SpringVersion.getVersion());
        SpringApplication.run(LifeHistoryApplication.class, args);
    }
}
