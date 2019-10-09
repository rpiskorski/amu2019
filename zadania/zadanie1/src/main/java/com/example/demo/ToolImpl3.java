package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Order(3)
public class ToolImpl3 implements Tool {

    public static Logger logger = LoggerFactory.getLogger(ToolImpl3.class);

    @PostConstruct
    public void welcome(){
        logger.info("ToolImpl3 created!");
    }
}
