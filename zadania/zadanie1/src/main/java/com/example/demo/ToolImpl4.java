package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Order(2)
@Profile("hydraulik")
@Primary
public class ToolImpl4 implements Tool {

    public static Logger logger = LoggerFactory.getLogger(ToolImpl4.class);

    @PostConstruct
    public void welcome(){
        logger.info("ToolImpl4 created!");
    }

}
