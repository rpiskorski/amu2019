package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Order(4)
@Profile("stolarz")
@Primary
public class ToolImpl2 implements Tool {

    public static Logger logger = LoggerFactory.getLogger(ToolImpl2.class);

    @PostConstruct
    public void welcome(){
        logger.info("ToolImpl2 created!");
    }
}
