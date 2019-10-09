package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ying {

    public static Logger logger = LoggerFactory.getLogger(Ying.class);

    @Autowired
    private Yang yang;
//
//    @Autowired
//    public Ying(Yang yang) {
//    }
//
    @Autowired
    public void setYang(Yang yang) {
        this.yang = yang;
        logger.info("Yang has been injected!");
    }
}
