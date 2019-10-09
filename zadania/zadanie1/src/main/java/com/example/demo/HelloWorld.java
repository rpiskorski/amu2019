package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class HelloWorld {

    public static Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    @PostConstruct
    public void helloWorld(){
        logger.info("Hello World");
    }

    @PreDestroy
    public void goodBye(){
        logger.info("Goodbye");
    }
}

