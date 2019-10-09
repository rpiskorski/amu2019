package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Order(1)
public class ToolImplementation implements Tool {

    public static Logger logger = LoggerFactory.getLogger(ToolImplementation.class);

    @PostConstruct
    public void welcome(){
        logger.info("ToolImplementation created!");
    }
}
