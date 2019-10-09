package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Toolbox {

    @Autowired
    public Tool tool;

    @Autowired
    public List<Tool> tools;


    public class AnonymousClass implements Tool{
        public Logger logger = LoggerFactory.getLogger(AnonymousClass.class);

        @PostConstruct
        public void welcome(){
            logger.info("AnonymousClass created!");
        }
    }

    @Bean
    Tool createAnonymousClassBean(){
        return new AnonymousClass();
    }

    public static Logger logger = LoggerFactory.getLogger(Toolbox.class);

    @PostConstruct
    public void welcome(){
        logger.info("Toolbox created!");
        logger.info("Injected primary class: "+this.tool.getClass().getCanonicalName());
        logger.info("Injected rest: "+(this.tools.stream()
                .map(value->value.getClass().getCanonicalName())
                .reduce((str1,str2)->str1+"\n"+str2)));

    }

}
